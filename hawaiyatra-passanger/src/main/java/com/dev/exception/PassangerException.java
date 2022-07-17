package com.dev.exception;

public class PassangerException extends Exception {

	public PassangerException() {
		super();
	}
	
	public PassangerException(String m) {
		super(m);
	}
	
	public PassangerException(Exception e) {
		super(e);
	}
	
	public PassangerException(String m, Exception e) {
		super(m, e);
	}
	
	

}
