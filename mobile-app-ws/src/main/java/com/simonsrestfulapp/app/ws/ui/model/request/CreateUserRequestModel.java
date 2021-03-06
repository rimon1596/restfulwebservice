package com.simonsrestfulapp.app.ws.ui.model.request;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreateUserRequestModel {

	private String firstName;
	private String lastName;
	private String email;
	private String password;


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// RETURN EMAIL
	public String getEmail() {
		return email;
	}

	// SET EMAIL
	public void setEmail(String email) {
		this.email = email;
	}

}
