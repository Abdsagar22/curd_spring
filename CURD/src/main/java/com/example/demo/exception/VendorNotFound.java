package com.example.demo.exception;

public class VendorNotFound extends RuntimeException {

	
	public VendorNotFound(String message, Throwable cause) {
		super(message, cause);
		
	}

	public VendorNotFound(String message) {
		super(message);
		
	}

	
}
