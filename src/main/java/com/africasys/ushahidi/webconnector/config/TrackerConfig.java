/**
 * 
 */
package com.africasys.ushahidi.webconnector.config;

import org.springframework.stereotype.Component;

/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class TrackerConfig {
	
	private String responseMessage;
	private String contryCode;
	private boolean tracerStopReply;
	
	
	public TrackerConfig() {
	}


	public TrackerConfig(String responseMessage, String contryCode, boolean tracerStopReply) {
		super();
		this.responseMessage = responseMessage;
		this.contryCode = contryCode;
		this.tracerStopReply = tracerStopReply;
	}


	public String getResponseMessage() {
		return responseMessage;
	}


	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}


	public String getContryCode() {
		return contryCode;
	}


	public void setContryCode(String contryCode) {
		this.contryCode = contryCode;
	}


	public boolean isTracerStopReply() {
		return tracerStopReply;
	}


	public void setTracerStopReply(boolean tracerStopReply) {
		this.tracerStopReply = tracerStopReply;
	}

	
}
