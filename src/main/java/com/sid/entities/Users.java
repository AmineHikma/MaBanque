package com.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.RequestParam;

@Entity
public class Users implements Serializable{
	@Id
private String username;
private String password;
private String active;
public Users() {
	super();
	// TODO Auto-generated constructor stub
}
public Users(String username, String password, @RequestParam(name="active",defaultValue="1")String active) {
	super();
	this.username = username;
	this.password = password;
	this.active = active;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getActive() {
	return active;
}
public void setActive(String active) {
	this.active = active;
}


}
