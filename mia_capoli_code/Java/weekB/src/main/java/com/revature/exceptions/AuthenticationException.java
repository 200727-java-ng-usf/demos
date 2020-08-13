package com.revature.exceptions;


//custom unchecked exception
public class AuthenticationException extends RuntimeException{

    public AuthenticationException(String username) {
        super("A user with the username, " + username + ", failed to authenticate.");
    }


}
