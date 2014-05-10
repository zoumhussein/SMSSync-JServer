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
public class SyncSimpleResponse {

	private Response payload;

	public SyncSimpleResponse() {
	};

	public SyncSimpleResponse(Response payload) {
		super();
		this.payload = payload;
	}

	public Response getPayload() {
		return payload;
	}

	public void setPayload(Response payload) {
		this.payload = payload;
	}

}
