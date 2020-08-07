package com.revature.exceptions;

// a custom unchecked exception

public class AuthenticationException extends RuntimeException {



    public AuthenticationException(String username) {
        super(" A user, with the username, "+ username + ", fail to login. ");
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
