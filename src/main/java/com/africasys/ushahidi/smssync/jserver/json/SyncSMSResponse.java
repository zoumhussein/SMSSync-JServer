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
public class SyncSMSResponse {

	private String success;
	private String task;
	private List<SMS> messages;
	
	public SyncSMSResponse() {
	}

	/**
	 * 
	 * @param success
	 * @param task
	 */
	public SyncSMSResponse(String success, String task) {
		super();
		this.success = success;
		this.task = task;
	}
	
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
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
	
	

}
