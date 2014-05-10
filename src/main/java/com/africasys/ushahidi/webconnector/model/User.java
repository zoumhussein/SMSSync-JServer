/**
 * 
 */
package com.africasys.ushahidi.webconnector.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.stereotype.Component;

/**
 * @author Zoumana TRAORE
 */
@XmlRootElement
@Component
public class User {
	
	
	private String name;
	private String fistname;
	private int age;
	
	public User(){
	};
	
	public User(String name, String fistname, int age) {
		super();
		this.name = name;
		this.fistname = fistname;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFistname() {
		return fistname;
	}
	public void setFistname(String fistname) {
		this.fistname = fistname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	} 
	
	

}
