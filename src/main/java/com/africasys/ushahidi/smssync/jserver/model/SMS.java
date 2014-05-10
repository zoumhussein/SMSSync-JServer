/**
 * 
 */
package com.africasys.ushahidi.smssync.jserver.model;

import org.springframework.stereotype.Component;


/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class SMS {
	
	private String message;
	private String to;
	
	public SMS(){};
	
	public SMS(String message, String sentTo) {
		super();
		this.message = message;
		this.to = sentTo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	

}
