package com.revature.exceptions;

public class BadRequestException extends RuntimeException{

	public BadRequestException() {
		super("A bad request was made.");
	}

//	public BadRequestException(String message, Throwable cause) {
//		super(message, cause);
//	}

}
