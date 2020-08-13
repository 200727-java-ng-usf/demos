package com.revature.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDriver {
	public static void main(String[] args) {
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
////		String input = getInput(reader);
//
//		try {
//			String input = getInput(reader);
//		} catch (IOException | NullPointerException e) {
//			e.printStackTrace();
//		}
		Scanner scanner = new Scanner(System.in);
		int someNumberHopefully = 0;
		try {
			// the following line has the potential to throw an InputMisMatchException
			// but is not required tto handle it, because it is an unchecked exception.
			someNumberHopefully = scanner.nextInt();
//			return;
		} catch(InputMismatchException ime){
			ime.printStackTrace();
		}
		// catch blocks with more generic exceptions must be declared last
		catch (Exception e){

		}
		//always executes regardless of whether or not the try block raises an exception
		finally {
			scanner.equals(null);
			System.out.println("I will always print?");
		}
		/*
			Try/catch/finally Rules

				- a try block cannot exist on its own (must be paired with a try block, finally block, or try with resources
				- catch blocks must be declared in order of most specific exceptions to the least speciifc exceptions
				- variables declared within a try block are not visible in any of the catch blocks
				- variables declared within a catch block are not visible outside of their scope
				-
		 */

		System.out.println("Hopefully you gave me a number: " + someNumberHopefully);


		LoginScreen login = new LoginScreen();

		try {
			LoginScreen.printMenu();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Adding the throws clause to a method signature indicates that this method
	// may throw the declared exception(e). If any checked exceptions are declared, then
	// anywhere this method is invoked, they must be handled (either caught or further
	// propogated) Unchecked exceptions are never required to be handled, though it may be
	// prudent to do so in many cases.
	public static String getInput(BufferedReader reader) throws IOException, NullPointerException {
		return reader.readLine();
	}

}
