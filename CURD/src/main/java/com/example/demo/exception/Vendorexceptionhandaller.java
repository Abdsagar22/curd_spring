package com.example.demo.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Vendorexceptionhandaller {
	
	
	
	@ExceptionHandler()
	public ResponseEntity<Object> handletheExcetion(VendorNotFound  vendorNotFound)
	{
		return null; 
		
	}

}
