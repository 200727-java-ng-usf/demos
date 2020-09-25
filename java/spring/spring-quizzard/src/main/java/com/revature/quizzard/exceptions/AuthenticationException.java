package com.revature.quizzard.exceptions;

public class AuthenticationException extends QuizzardException {

    public AuthenticationException() {
        super("Authentication failed!");
    }

    public AuthenticationException(String msg) {
        super(msg);
    }

    public AuthenticationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public AuthenticationException(Throwable cause) {
        super(cause);
    }

}
