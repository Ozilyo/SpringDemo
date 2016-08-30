package com.interfac.springdemo.util;

public class LoginValidator {
	public static boolean validateUser(String username, String password) {
		
		return username.equalsIgnoreCase("root")
				&& password.equals("toor");
	}
}
