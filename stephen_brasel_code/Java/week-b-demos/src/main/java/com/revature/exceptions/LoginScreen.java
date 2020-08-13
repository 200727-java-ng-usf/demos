package com.revature.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class LoginScreen {
//	public static void main(String[] args) {
//		try {
//			printMenu();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
	public static void printMenu() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Welcome to out app!\nPlease sign in.");

		System.out.print("Username: ");
		String username = reader.readLine();

		System.out.print("Password: ");
		String password = reader.readLine();

		if(!username.trim().equals("") && !password.trim().equals("")) {

			if(username.equals("admin") && password.equals("password")) {
				System.out.println("Welcome, " + username + "! Navigating you to your dashboard...");
			} else{
				throw new AuthenticationException(username);
			}
		} else {
			throw new BadRequestException();
		}


	}
}
