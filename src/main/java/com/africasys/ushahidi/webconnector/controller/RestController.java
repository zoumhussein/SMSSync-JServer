package com.africasys.ushahidi.webconnector.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.africasys.ushahidi.webconnector.config.SMSSyncConfig;
import com.africasys.ushahidi.webconnector.config.TrackerConfig;
import com.africasys.ushahidi.webconnector.model.SMS;
import com.africasys.ushahidi.webconnector.model.TrackerSMS;
import com.africasys.ushahidi.webconnector.sms.SMSMngt;
import com.africasys.ushahidi.webconnector.utils.ApplicationConstantes;
import com.africasys.ushahidi.webconnector.utils.ConfigHelper;
import com.africasys.ushahidi.webconnector.utils.SMSParserHelper;
import com.africasys.ushahidi.webconnector.utils.SyncHelper;

/**
 * @author Zoumana TRAORE
 * Handles requests for the REST interface which renders JSON
 */
@Controller
public class RestController {
	
	private static final Log LOGGER = LogFactory.getLog(RestController.class);
	
	/**
	 * receive SMS from SMSSync gateway
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/rest", method =RequestMethod.POST, produces="application/json")
	@ResponseBody
	public Object receiveSMS(HttpServletRequest request, HttpServletResponse response) {
		
		LOGGER.debug("receiveSMS begin");
		
		boolean success = false;
		Object returnObj = null;
		SMSSyncConfig smsSync = ConfigHelper.getSMSSyncConfig();
		
		String message = request.getParameter(smsSync.getMessage());
		String sentTo = request.getParameter(smsSync.getTo());
		String secret = request.getParameter(smsSync.getSecret());

		String from = request.getParameter(smsSync.getFrom());
		String sentTimestamp = request.getParameter(smsSync.getTime());
		String messageId =request.getParameter(smsSync.getMessageId());

		//Don't process if the secret does not match, if there is any secret provided 
		if(StringUtils.isNotBlank(secret) && !SyncHelper.isSMSSyncAuthentified(secret)){
			return SyncHelper.responseError(ApplicationConstantes.ERROR_SMSSYNC_BAD_SECRET);
		}

		TrackerSMS trackerSMS = SMSParserHelper.parseTracerSMS(message);
		
		//Not a tracker SMS, so we reply OK so the SMS gateway never re-send it back
		if(trackerSMS == null){
			LOGGER.warn("Not a TrackerSMS");
			return SyncHelper.responseSuccess();
		}
		success = smsMngt.processTracerSMS(trackerSMS, from, sentTo, message, sentTimestamp);
		TrackerConfig trackerConfig = ConfigHelper.getTrackerConfig();
		
		if(!success){
			returnObj = SyncHelper.responseError(ApplicationConstantes.ERROR_DURING_REPORT_CREATION);
		}else{
			
			//we need to reply to the GPS tracker so i can stop sending again
			if(trackerConfig.isTracerStopReply()){
				returnObj = SyncHelper.responseSuccessWithMessage(from);
			}else{
				returnObj = SyncHelper.responseSuccess();	
			}
		}
		LOGGER.debug("receiveSMS end with messageId="+messageId);
		return returnObj;
	}
	
	/**
	 * sending SMSs through SMSSync gateway
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value = "/rest", method =RequestMethod.GET)
	@ResponseBody
	public Object sendSMS(HttpServletRequest request, HttpServletResponse response) {
		LOGGER.debug("sendSMS begin");
		List<SMS> messages = smsMngt.mockRetrieveSMSToSend();
		LOGGER.debug("receiveSMS end with number of SMS sent="+messages.size());
		return SyncHelper.sendSMSThroughGateway(messages);
	}
}
