package com.revature.exceptions;

public class BadRequestException extends RuntimeException {

    public BadRequestException() {
        super("A bad thing was done here.");
    }
}
