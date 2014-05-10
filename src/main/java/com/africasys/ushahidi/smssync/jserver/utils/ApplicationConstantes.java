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
	 *Configuration keys 
	 */
	public static final String USHAHIDI_URL_KEY = "ushURL";
	public static final String USHAHIDI_LOGIN_KEY = "ushLogin";
	public static final String USHAHIDI_PASSWORD_KEY = "ushPassword";

	public static final String USHAHIDI_CATEGORY_KEY = "ushCategory";
	public static final String USHAHIDI_REPORT_TITLE_KEY = "ushReportTitle";
	public static final String USHAHIDI_REPORT_DESC_KEY = "ushReportDescription";
	public static final String USHAHIDI_REPORT_LOCATION_KEY = "ushReportLocation";

	public static final String TRACKER_RESPONSE_KEY = "trackerResponse";
	public static final String TRACKER_DEFAULTNAME_KEY = "defaultTrackerName";
	public static final String TRACKER_STOP_REPLY_KEY = "tracerStopReply";
	public static final String COUNTRY_CODE_KEY = "contryCode";

	public static final String SMSSYNC_FROM_KEY = "syncFrom";
	public static final String SMSSYNC_MESSAGE_KEY = "syncMessage";
	public static final String SMSSYNC_MESSAGE_ID_KEY = "syncMessageID";
	public static final String SMSSYNC_SECRET_KEY = "syncSecret";
	public static final String SMSSYNC_TO_KEY = "syncTo";
	public static final String SMSSYNC_TIME_KEY = "syncTime";
	public static final String SMSSYNC_TASK_KEY = "syncTask";

	
	public static final String SUPPORT_EMAIL_KEY = "supportEmail";

	
	/**
	 * errors
	 */
	public static final String ERROR_SMSSYNC_BAD_SECRET = "Bad secret provided form SMSSync";
	public static final String ERROR_SERVER_MSG = "USHAHIDI Server reports and error during the processing";
	public static final String ERROR_CATEGORY_NOT_FOUND = "Category not found: ";
	public static final String ERROR_DURING_REPORT_CREATION = "Error while processing the SMS and submitting report";

	/**
	 * REGEXP
	 */
	public static final String GEOSMS_REGEXP = "^geo:[+-]?\\d+\\.?\\d+\\s*,\\s*[+-]?\\d+\\.?\\d+;u=\\d";
	public static final String GPS_COORDINATE_REGEXP = "^[+-]?\\d+\\.?\\d+\\s*,\\s*[+-]?\\d+\\.?\\d";

}
