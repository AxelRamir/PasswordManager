package com.passwordManager.dataClasses;

public class Email {
	private String errorMessage;
	private String email = "";
	
	public Email(String email) {
		this.email = email.toLowerCase();
	}
	
	//getters and setters
	public String getErrorMessage() {
		return errorMessage;
	}
	public String getEmail() {
		return email;
	}
	public boolean isValid() {
		if(validate(email)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	private boolean validate(String email) {
		//makes sure the email isn't blank
		if(email.equals("") || email.equals(null)) {
			errorMessage = "Enter an email";
			return false;
		}
		
		//traverses the email
		char[] e = email.toCharArray();
		boolean hasAt = false; 
		boolean hasDot = false;
		int atCount = 0;
		int atPos = 0;
		int dotPos = 0;
		for(int i = 0; i < e.length; i++) {
			if(e[i] == '@') {
				hasAt = true;
				atPos = i + 1;
				atCount++;
			}
			else if(e[i] == '.') {
				hasDot = true;
				dotPos = i + 1;
			}
			//if the email character is not an @ or . 
			else {
				if(!Character.isAlphabetic(e[i]) && !Character.isDigit(e[i])) {
					errorMessage = "Email has invalid character(s)";
					return false;
				}
			}
		}
		if(atCount != 1) {
			errorMessage = "Email needs one '@' symbol";
			return false;
		}
		if(atPos > dotPos) {
			errorMessage = "'.' is followed by '@'";
			return false;
		}
		return true;
	}
}
