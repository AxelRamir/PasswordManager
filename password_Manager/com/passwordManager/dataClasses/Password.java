package com.passwordManager.dataClasses;

public class Password {
	private String errorMessage;
	private String password;
	char[] symbols = {'!','@','#','$','%','^','&','*','(',')'};
	
	public Password(String password) {
		this.password = password;
	}
	
	//getters and setters
	public String getErrorMessage() {
		return errorMessage;
	}
	public String getPassword() {
		return password;
	}
	
	public boolean isValid() {
		if(validate(password)) {
			return true;
		}
		return false;
	}
	private boolean isSymbol(char p) {
		for(char temp : symbols) {
			if(p == temp) {
				return true;
			}
		}
		return false;
	}
	
	private boolean validate(String password) {
		boolean hasNumber = false;
		boolean hasUppercase = false;
		boolean hasLowercase = false;
		boolean hasSymbol = false;
		char[] p = password.toCharArray();
		//check to make sure password is entered
		if(password.equals("")|| password.equals(null)) {
			errorMessage = "Enter a password";
			return false;
		}
		
		//traverse the password
		for(int i = 0; i < p.length; i++) {
			if(Character.isDigit(p[i])) {
				hasNumber = true;
			}
			else if(Character.isUpperCase(p[i])) {
				hasUppercase = true;
			}
			else if(Character.isLowerCase(p[i])) {
				hasLowercase = true;
			}
			else if(isSymbol(p[i])) {
				hasSymbol = true;
			}
			else {
				errorMessage = "only symbols allowed are {";
				for(int j = 0; j < symbols.length; j++) {
					errorMessage += symbols[j];
				}
				errorMessage += "}";
				return false;
			}
		}
		
		//checks to make sure password has number, uppercase, lowercase, and symbol
		if(hasNumber && hasUppercase && hasLowercase && hasSymbol) {
			return true;
		}
		//if it doesn't have each of the above conditions, check for them individually
		else {
			if(!hasNumber) {
				errorMessage = "Password needs number";
			}
			if(!hasUppercase) {
				errorMessage = "Password needs uppercase letter";
			}
			if(!hasLowercase) {
				errorMessage = "Password needs lowercase letter";
			}
			if(!hasSymbol) {
				errorMessage = "Password needs symbol";
			}
		}
		return false;
	}
	
}
