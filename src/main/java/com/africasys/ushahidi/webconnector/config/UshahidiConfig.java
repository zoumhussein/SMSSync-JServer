/**
 * 
 */
package com.africasys.ushahidi.webconnector.config;

import org.springframework.stereotype.Component;

/**
 * @author Zoumana TRAORE
 *
 */
@Component
public class UshahidiConfig {
	
	private String category;
	private String reportTitle;
	private String reportDescription;
	private String reportLocation;
	
	public UshahidiConfig() {
	}

	/**
	 * 
	 * @param category
	 * @param reportTitle
	 * @param reportDescription
	 * @param reportLocation
	 */
	public UshahidiConfig(String category, String reportTitle,
			String reportDescription, String reportLocation) {
		super();
		this.category = category;
		this.reportTitle = reportTitle;
		this.reportDescription = reportDescription;
		this.reportLocation = reportLocation;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getReportTitle() {
		return reportTitle;
	}

	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	public String getReportDescription() {
		return reportDescription;
	}

	public void setReportDescription(String reportDescription) {
		this.reportDescription = reportDescription;
	}

	public String getReportLocation() {
		return reportLocation;
	}

	public void setReportLocation(String reportLocation) {
		this.reportLocation = reportLocation;
	}
	

}
