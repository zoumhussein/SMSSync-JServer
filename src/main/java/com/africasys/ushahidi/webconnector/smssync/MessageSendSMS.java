/**
 * 
 */
package com.africasys.ushahidi.webconnector.smssync;

import java.util.List;

import org.springframework.stereotype.Component;

import com.africasys.ushahidi.webconnector.model.SMS;


/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class MessageSendSMS {

	private String task;
	private String secret;
	private List<SMS> messages;
	
	
	public MessageSendSMS() {
	}

	public MessageSendSMS(String task, String secret) {
		super();
		this.task = task;
		this.secret = secret;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public List<SMS> getMessages() {
		return messages;
	}

	public void setMessages(List<SMS> messages) {
		this.messages = messages;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}
}
