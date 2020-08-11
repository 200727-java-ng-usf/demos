package com.revature.revabooks.exceptions;

public class ResourcePersistenceException extends RuntimeException{

    public ResourcePersistenceException() {
        super("Resource persistence exception");
    }

    public ResourcePersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
}
