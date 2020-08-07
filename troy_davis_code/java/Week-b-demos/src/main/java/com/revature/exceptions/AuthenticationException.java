package com.revature.exceptions;


//custom unchecked exception
public class AuthenticationException extends RuntimeException {

    public AuthenticationException(String username) {
        super("A user with the username, " + username + " failed to Authenticate");

    }


    //Useful for wrapping up exceptions that you did not implement
    //and indicating them as cause
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

}
