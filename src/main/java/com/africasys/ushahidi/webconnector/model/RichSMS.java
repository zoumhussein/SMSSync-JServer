/**
 * 
 */
package com.africasys.ushahidi.webconnector.model;

import java.util.Date;

import org.springframework.stereotype.Component;


/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class RichSMS {
	
	private String title;
	private String description;
	private String latitude;
	private String longititude;
	private String locationName;
	private Date date;
	
	public RichSMS(){};

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longititude;
	}
	public void setLongitude(String longitude) {
		this.longititude = longitude;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
