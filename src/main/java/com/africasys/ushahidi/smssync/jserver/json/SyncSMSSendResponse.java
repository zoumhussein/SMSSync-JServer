/**
 * 
 */
package com.africasys.ushahidi.smssync.jserver.json;

import org.springframework.stereotype.Component;

/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class SyncSMSSendResponse {

	private MessageSendSMS payload;

	public SyncSMSSendResponse() {
	};

	public SyncSMSSendResponse(MessageSendSMS payload) {
		super();
		this.payload = payload;
	}

	public MessageSendSMS getPayload() {
		return payload;
	}

	public void setPayload(MessageSendSMS payload) {
		this.payload = payload;
	}

}
