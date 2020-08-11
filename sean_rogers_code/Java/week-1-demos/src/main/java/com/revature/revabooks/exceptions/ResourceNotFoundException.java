package com.revature.revabooks.exceptions;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException() {
        super("Resource Not Found");
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
