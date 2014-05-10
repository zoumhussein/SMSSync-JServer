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
public class SyncSMSAutoReply {

	private MessageAutoReply payload;

	public SyncSMSAutoReply() {
	};

	public SyncSMSAutoReply(MessageAutoReply payload) {
		super();
		this.payload = payload;
	}

	public MessageAutoReply getPayload() {
		return payload;
	}

	public void setPayload(MessageAutoReply payload) {
		this.payload = payload;
	}

}
