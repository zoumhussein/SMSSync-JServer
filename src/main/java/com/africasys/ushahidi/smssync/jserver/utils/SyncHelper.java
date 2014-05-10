/**
 * 
 */
package com.africasys.ushahidi.smssync.jserver.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import com.africasys.ushahidi.smssync.jserver.config.SMSSyncConfig;
import com.africasys.ushahidi.smssync.jserver.json.MessageAutoReply;
import com.africasys.ushahidi.smssync.jserver.json.MessageSendSMS;
import com.africasys.ushahidi.smssync.jserver.json.Response;
import com.africasys.ushahidi.smssync.jserver.json.SyncSMSAutoReply;
import com.africasys.ushahidi.smssync.jserver.json.SyncSMSSendResponse;
import com.africasys.ushahidi.smssync.jserver.json.SyncSimpleResponse;
import com.africasys.ushahidi.smssync.jserver.model.SMS;

/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class SyncHelper {

	/**
	 * response success to SMSSync
	 * 
	 * @return SyncSimpleResponse
	 */
	public static SyncSimpleResponse responseSuccess() {
		return new SyncSimpleResponse(new Response("true", null));

	}

	/**
	 * response error to SMSSync
	 * 
	 * @return SyncSimpleResponse
	 */
	public static SyncSimpleResponse responseError(String errorMessage) {
		return new SyncSimpleResponse(new Response("false", errorMessage));
	}

	/**
	 * send SMS through SMSSync gateway
	 * 
	 * @return
	 */
	public static SyncSMSSendResponse sendSMSThroughGateway(List<SMS> messages) {
		SMSSyncConfig config = ConfigHelper.getSMSSyncConfig();
		MessageSendSMS messageRes = new MessageSendSMS("send",
				config.getSecret());
		messageRes.setMessages(messages);
		return new SyncSMSSendResponse(messageRes);
	}

	/**
	 * check the SMSSYnc Server secret password
	 * 
	 * @param secret
	 * @return
	 */
	public static boolean isSMSSyncAuthentified(String secret) {

		SMSSyncConfig config = ConfigHelper.getSMSSyncConfig();
		if (StringUtils.equals(secret, config.getSecret())) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * @param to
	 * @return
	 */
	public static SyncSMSAutoReply responseSuccessWithMessage(String to) {
		SyncSMSAutoReply smsResponse = new SyncSMSAutoReply();
		MessageAutoReply autoReply = new MessageAutoReply("true", "send");
		List<SMS> messages = new ArrayList<SMS>();
		messages.add(new SMS("messageText", to));
		autoReply.setMessages(messages);
		smsResponse.setPayload(autoReply);
		return smsResponse;
	}

}
