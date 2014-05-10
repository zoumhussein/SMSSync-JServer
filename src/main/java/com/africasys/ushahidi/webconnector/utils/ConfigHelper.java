/**
 * 
 */
package com.africasys.ushahidi.webconnector.utils;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.africasys.ushahidi.webconnector.config.SMSSyncConfig;
import com.africasys.ushahidi.webconnector.config.ServerConfig;
import com.africasys.ushahidi.webconnector.config.TrackerConfig;
import com.africasys.ushahidi.webconnector.config.UshahidiConfig;

/**
 * @author Zoumana TRAORE
 *
 *	Just an helper class
 */
@Component
public class ConfigHelper {
	
	
	private static final Log LOGGER = LogFactory.getLog(ConfigHelper.class);
	private static Properties loadedConfig = null;
	
	
	/**
	 * load configuration file
	 * 
	 * @return
	 */
	public static Properties loadConfigProperties()
	{
		if(loadedConfig == null){
			Properties configuration = new Properties();
			try {
				configuration.load(ConfigHelper.class.getClassLoader().getResourceAsStream("configuration.properties"));
			} catch (Exception e) {
				e.printStackTrace();
				LOGGER.error("Error while locating configuration file");
			}
			loadedConfig = configuration;
		}
		
		return loadedConfig;
	}
	

	/**
	 * 
	 * @return
	 */
	public static ServerConfig getServerConfig()
	{
		String url ="";
		String login ="";
		String password ="";
		
		Properties configuration = loadConfigProperties();
		url = configuration.getProperty(ApplicationConstantes.USHAHIDI_URL_KEY);
		login = configuration.getProperty(ApplicationConstantes.USHAHIDI_LOGIN_KEY);
		password = configuration.getProperty(ApplicationConstantes.USHAHIDI_PASSWORD_KEY);
		return new ServerConfig(url, login, password);
	}
	
	/**
	 * 
	 * @return
	 */
	public static UshahidiConfig getUshahidiConfig()
	{
		String category="";
		String reportTitle="";
		String reportDescription="";
		String reportLocation="";
		
		Properties configuration = loadConfigProperties();
		category = configuration.getProperty(ApplicationConstantes.USHAHIDI_CATEGORY_KEY);
		reportTitle = configuration.getProperty(ApplicationConstantes.USHAHIDI_REPORT_TITLE_KEY);
		reportDescription = configuration.getProperty(ApplicationConstantes.USHAHIDI_REPORT_DESC_KEY);
		reportLocation = configuration.getProperty(ApplicationConstantes.USHAHIDI_REPORT_LOCATION_KEY);
		return new UshahidiConfig(category, reportTitle, reportDescription, reportLocation);
	}

	/**
	 * 
	 * @return
	 */
	public static SMSSyncConfig getSMSSyncConfig()
	{
		String syncFrom="";
		String syncMessage="";
		String syncMessageID="";
		String syncTo="";
		String syncSecret="";
		String syncTime="";
		String syncTask="";

		Properties configuration = loadConfigProperties();
		syncFrom = configuration.getProperty(ApplicationConstantes.SMSSYNC_FROM_KEY);
		syncMessage = configuration.getProperty(ApplicationConstantes.SMSSYNC_MESSAGE_KEY);
		syncMessageID = configuration.getProperty(ApplicationConstantes.SMSSYNC_MESSAGE_ID_KEY);
		syncTo = configuration.getProperty(ApplicationConstantes.SMSSYNC_TO_KEY);
		syncSecret = configuration.getProperty(ApplicationConstantes.SMSSYNC_SECRET_KEY);
		syncTime = configuration.getProperty(ApplicationConstantes.SMSSYNC_TIME_KEY);
		syncTask = configuration.getProperty(ApplicationConstantes.SMSSYNC_TASK_KEY);		
		return new SMSSyncConfig(syncFrom, syncMessage, syncMessageID, syncTo, syncSecret, syncTime, syncTask);
	}
	
	/**
	 * 
	 * @return
	 */
	public static TrackerConfig getTrackerConfig()
	{
		String responseMessage="";
		String contryCode="";
		String tracerStopValue = "";
		boolean tracerStopReply = true;
		
		Properties configuration = loadConfigProperties();
		responseMessage = configuration.getProperty(ApplicationConstantes.TRACKER_RESPONSE_KEY);
		contryCode = configuration.getProperty(ApplicationConstantes.COUNTRY_CODE_KEY);
		tracerStopValue = configuration.getProperty(ApplicationConstantes.TRACKER_STOP_REPLY_KEY);
		if(tracerStopValue.equalsIgnoreCase("no")){
			tracerStopReply =false;
		}else{
			tracerStopReply =true;
		}

		return new TrackerConfig(responseMessage, contryCode, tracerStopReply); 
	}
	
	/**
	 * 
	 * @return
	 */
	public static String getTrackerNameByNumber(String trackerPhoneNumber)
	{
		String trackerName="";
		Properties configuration = loadConfigProperties();
		trackerName = configuration.getProperty(trackerPhoneNumber);
		
		if(trackerName == null || trackerName == ""){
			trackerName = configuration.getProperty(ApplicationConstantes.TRACKER_DEFAULTNAME_KEY);
		}
		return trackerName;
	}

	
}
