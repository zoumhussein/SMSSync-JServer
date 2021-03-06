/**
 * 
 */
package com.africasys.ushahidi.smssync.jserver.json;

import java.util.List;

import org.springframework.stereotype.Component;

import com.africasys.ushahidi.smssync.jserver.model.SMS;

/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class Message {

	private String task;
	private String secret;
	private List<SMS> messages;

	public Message() {
	}

	public Message(String task, String secret) {
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
