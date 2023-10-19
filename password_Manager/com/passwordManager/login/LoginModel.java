package com.passwordManager.login;

import com.passwordManager.dataClasses.*;
import com.passwordManager.essentials.*;

public class LoginModel extends Model{
	private Email email;
	private Password password;
	
	public LoginModel() {
		super();
	}
	
	public void setEmail(Email email) {
		this.email = email;
	}
	public void setPassword(Password password) {
		this.password = password;
	}
	public Email getEmail(Email email) {
		return email;
	}
	public Password getPasword(Password password) {
		return password;
	}
	
	
}
