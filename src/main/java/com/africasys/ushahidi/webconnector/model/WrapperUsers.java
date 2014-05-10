/**
 * 
 */
package com.africasys.ushahidi.webconnector.model;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

/**
 * @author Zoumana TRAORE
 * Wrapper to generate JSON for a list of Users
 *
 */
@XmlRootElement
public class WrapperUsers {

	private int number;
	private List<User> users;
	
	public int getNumber() {
		return number;
	}
	
	
	public void setNumber(int number) {
		this.number = number;
	}
	public List<User> getUsers() {
		return users;
	}
	
	/**
	 * trick to auto set number
	 */
	public void setUsers(List<User> users) {
		this.users = users;
		this.number = users.size();
	}
	
}
