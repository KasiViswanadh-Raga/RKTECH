package com.task1.passwordchecker;

import java.util.Scanner;

public class PasswordStrengthChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password: ");
		String password = sc.nextLine();
		String result = checkPasswordStrength(password);
		System.out.println(result);
	}

public static String checkPasswordStrength(String password) {
	if(password.length()<8) {
		return "The Password must be at least 8 characters long";
	}
	boolean hasUpper = false;
	boolean hasLower = false;
	boolean hasDigit = false;
	boolean hasSpecialCharacter = false;
	for(int i=0;i<password.length();i++) {
		char ch = password.charAt(i);
		if(Character.isUpperCase(ch)) {
			hasUpper = true;
		}
		else if(Character.isLowerCase(ch)) {
			hasLower = true;
		}
		else if(Character.isDigit(ch)) {
			hasDigit = true;
		}
		else if(isSpecialCharacter(ch)) {
			hasSpecialCharacter = true;
		}
	}
	if(!hasUpper) {
		return "The Password must contain at least one uppercase letter";
	}
	if(!hasLower) {
		return "The Password must contain at least one lowercase letter";
	}
	if(!hasDigit) {
		return "The Password must contain at least one digit";
	}
	if(!hasSpecialCharacter) {
		return "The Password must contain at least one special character";
	}
	return "Your password meets all criteria";
}
private static boolean isSpecialCharacter(char ch) {
	String specialCharacters = "!@#$%^&*()-_=+{};:,<.>";
	for(int i=0;i<specialCharacters.length();i++) {
		if(ch == specialCharacters.charAt(i)) {
			return true;
		}
	}
	return false;
}
}
