/**
 * 
 */
package com.africasys.ushahidi.smssync.jserver.utils;

import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.africasys.ushahidi.smssync.jserver.config.SMSSyncConfig;

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
	
}
