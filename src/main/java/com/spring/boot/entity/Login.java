package com.spring.boot.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Login {

	@NotBlank(message = "User Name Not be Empty")
	@Size(min = 3, max = 20, message = "User Name Must be 3 to 30 char")
	private String userName;
	private String email;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Login [userName=" + userName + ", email=" + email + "]";
	}

}
