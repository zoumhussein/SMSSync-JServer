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
public class MessageAutoReply {

	private String success;
	private String task;
	private List<SMS> messages;
	
	
	public MessageAutoReply() {
	}

	public MessageAutoReply(String success, String task) {
		super();
		this.success = success;
		this.task = task;
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

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	
}
