package com.revature.revabooks.exceptions;

public class ScreenNotFoundException extends RuntimeException{

    public ScreenNotFoundException() {
        super();
    }

    public ScreenNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
