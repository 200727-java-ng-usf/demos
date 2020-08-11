package com.revature.exceptions;


//custom unchecked exception
public class AuthenticationException extends RuntimeException{


    public AuthenticationException(String username){
        super("A user with the username," + username + ", failed to Authenticate.");
    }//prints at stack trace (?)

    public AuthenticationException(String message, Throwable cause){
        super(message, cause);
    }//prints at stack trace (?)


}
