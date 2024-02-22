package com.example.demo.exception;

import org.springframework.http.HttpStatus;

public class VendorException {
	
	private final String message;
	private final Throwable throwable;
	private final HttpStatus httpstatus;
	
	
	public VendorException(String message, Throwable throwable, HttpStatus httpstatus) {
		super();
		this.message = message;
		this.throwable = throwable;
		this.httpstatus = httpstatus;
	}


	public String getMessage() {
		return message;
	}


	public Throwable getThrowable() {
		return throwable;
	}


	public HttpStatus getHttpstatus() {
		return httpstatus;
	}


	
	
	

}
