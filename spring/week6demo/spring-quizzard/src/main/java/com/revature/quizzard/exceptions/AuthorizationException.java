package com.revature.quizzard.exceptions;

public class AuthorizationException extends QuizzardException {

	public AuthorizationException(){
		super("This role is not allowed to perform this action.");
	}

	public AuthorizationException(String msg) {
		super(msg);
	}

	public AuthorizationException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public AuthorizationException(Throwable cause) {
		super(cause);
	}
}
