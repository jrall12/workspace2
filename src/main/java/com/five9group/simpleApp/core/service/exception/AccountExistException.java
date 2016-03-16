package com.five9group.simpleApp.core.service.exception;

public class AccountExistException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public AccountExistException(){}
	
	public AccountExistException(Throwable cause){
		super(cause);
	}

	public AccountExistException(String message,Throwable cause){
		super(message,cause);
	}
	public AccountExistException(String message){
		super(message);
	}
	

}
