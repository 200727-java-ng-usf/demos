package com.revature.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionDriver {
    public static void main(String[] args) {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        try {
//            String input = getInput(reader);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();

        LoginScreen loginScreen = new LoginScreen();
        try {
            loginScreen.printMenu();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getInput(BufferedReader reader) throws IOException {
        return reader.readLine();
    }
}
