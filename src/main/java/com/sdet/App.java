package com.sdet;

import java.util.ResourceBundle;

public class App {
	
	public boolean isUserLoggedIn(String inUsername, String inPassword) {
		
		ResourceBundle rb = ResourceBundle.getBundle("config");
		
		String username = rb.getString("username");
		String password = rb.getString("password");
		
		if (inUsername.equals(username) && inPassword.equals(password)) {
			return true;			
		}
		
		return false;
	}

}
