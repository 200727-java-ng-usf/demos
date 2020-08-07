package com.revature.exceptions;


public class BadRequestException  extends  RuntimeException {
    public BadRequestException() {
        super("A Bad request was made.");
    }
}
