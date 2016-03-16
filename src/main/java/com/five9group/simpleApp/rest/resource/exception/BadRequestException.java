package com.five9group.simpleApp.rest.resource.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;


@ResponseStatus(value=HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException{

	private static final long serialVersionUID = 4782634424350276349L;

public BadRequestException(){}

public BadRequestException(Throwable cause){
	super(cause);
}
}
