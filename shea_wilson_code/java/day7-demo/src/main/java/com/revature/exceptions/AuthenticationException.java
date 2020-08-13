package com.revature.exceptions;
//custom unchecked exception
public class AuthenticationException extends RuntimeException {

    public AuthenticationException(String username){
        super("A user with the username, "+username+" , failed to authenticate");
    }

    //useful for wrapping up exceptions that you did not implement and indicating them as the cause
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
