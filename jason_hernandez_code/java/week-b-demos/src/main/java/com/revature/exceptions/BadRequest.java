package com.revature.exceptions;

public class BadRequest extends RuntimeException{

    public BadRequest() {
        super("A bad request was made.");
    }
}
