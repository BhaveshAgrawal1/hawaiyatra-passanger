package com.devexception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.dev.exception.PassangerException;
import com.dev.model.ExMessage;



@ControllerAdvice
public class ExceptionControllerAdvise {
	
	@ExceptionHandler(PassangerException.class)
	public ResponseEntity<?> myExceptionHander(Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
		return new ResponseEntity<ExMessage>(new ExMessage(e.getMessage(), e.getClass()), HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
