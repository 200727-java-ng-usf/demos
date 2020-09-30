package com.revature.quizzard.exceptions;

public class AuthorizationException extends QuizzardException {

    public AuthorizationException() {
        super("Your role does not allow you to perform this action!");
    }

    public AuthorizationException(String msg) {
        super(msg);
    }
<<<<<<< HEAD

    public AuthorizationException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public AuthorizationException(Throwable cause) {
        super(cause);
    }
=======
>>>>>>> 94ec4c8aac41b5b0457982f30f068c8d880c466d
}
