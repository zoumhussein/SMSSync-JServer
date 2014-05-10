/**
 * 
 */
package com.africasys.ushahidi.smssync.jserver.utils;

import org.springframework.stereotype.Component;

/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class ApplicationConstantes {

	/**
	 * Configuration keys
	 */
	public static final String SMSSYNC_FROM_KEY = "syncFrom";
	public static final String SMSSYNC_MESSAGE_KEY = "syncMessage";
	public static final String SMSSYNC_MESSAGE_ID_KEY = "syncMessageID";
	public static final String SMSSYNC_SECRET_KEY = "syncSecret";
	public static final String SMSSYNC_TO_KEY = "syncTo";
	public static final String SMSSYNC_TIME_KEY = "syncTime";
	public static final String SMSSYNC_TASK_KEY = "syncTask";

	/**
	 * errors
	 */
	public static final String ERROR_SMSSYNC_BAD_SECRET = "Bad secret provided form SMSSync";
	public static final String ERROR_DURING_REPORT_CREATION = "Error while processing the SMS and submitting report";
}
