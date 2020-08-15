package com.revature.exceptions;

public class AuthenticationException extends RuntimeException {

    public AuthenticationException(String username) {
        super("A user with the username, " + username + ", failed to authenticate");
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }


}
