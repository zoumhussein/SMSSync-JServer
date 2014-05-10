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
public class ServerConfig {
	
	private String url;
	private String login;
	private String password;
	
	public ServerConfig() {
		
		
	}

	/**
	 * 
	 * @param url
	 * @param login
	 * @param password
	 */
	public ServerConfig(String url, String login, String password) {
		super();
		this.url = url;
		this.login = login;
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
	

}
