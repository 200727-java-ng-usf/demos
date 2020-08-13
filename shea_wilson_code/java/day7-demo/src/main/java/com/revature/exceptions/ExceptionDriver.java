package com.revature.exceptions;

import java.io.IOException;

public class ExceptionDriver {
    public static void main(String[] args) {
        LoginScreen s = new LoginScreen();

        try {
            s.printMenu();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
