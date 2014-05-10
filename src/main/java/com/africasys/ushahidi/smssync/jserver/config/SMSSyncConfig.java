/**
 * 
 */
package com.africasys.ushahidi.smssync.jserver.config;

import org.springframework.stereotype.Component;

/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class SMSSyncConfig {
	
	private String from;
	private String message;
	private String messageId;
	private String to;
	private String secret;
	private String time;
	private String task;
	
	public SMSSyncConfig() {
	}

	public SMSSyncConfig(String from, String message, String messageId,
			String to, String secret, String time, String task) {
		super();
		this.from = from;
		this.message = message;
		this.messageId = messageId;
		this.to = to;
		this.secret = secret;
		this.time = time;
		this.task = task;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageId() {
		return messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
}
