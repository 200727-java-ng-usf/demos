package com.revature.exceptions;

import java.io.IOException;

public class ExceptionDriver {

    public static void main(String[] args) {
        LoginScreen loginScreen = new LoginScreen();

            try {
                loginScreen.printMenu();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }
}
