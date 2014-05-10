/**
 * 
 */
package com.africasys.ushahidi.webconnector.model;

import org.springframework.stereotype.Component;

/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class TrackerSMS {
	
	private String latitude;
	private String longitude;
	private String speed;
	private String date;
	private String fValue;
	private String signal;
	private String imei;
	
	public TrackerSMS() {
	}

	public TrackerSMS(String latitude, String longitude, String speed,
			String date, String fValue, String signal, String imei) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.speed = speed;
		this.date = date;
		this.fValue = fValue;
		this.signal = signal;
		this.imei = imei;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getfValue() {
		return fValue;
	}

	public void setfValue(String fValue) {
		this.fValue = fValue;
	}

	public String getSignal() {
		return signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}

	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
	
}
