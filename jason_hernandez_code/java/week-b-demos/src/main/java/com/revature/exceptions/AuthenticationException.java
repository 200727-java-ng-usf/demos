package com.revature.exceptions;

public class AuthenticationException extends RuntimeException{ // a custom unchecked exception

    public AuthenticationException(String username) {
        super("A user with the username " + username + " failed to authenticate.");
    }

    public AuthenticationException(String s, Throwable cause) {
        super(s, cause);
    }
}
