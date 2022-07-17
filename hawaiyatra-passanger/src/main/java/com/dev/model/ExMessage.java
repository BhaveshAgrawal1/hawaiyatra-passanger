package com.dev.model;

import java.time.LocalDateTime;

public class ExMessage {

	private String message;
	private Class<?> type;
	private LocalDateTime now;
	
	public ExMessage(String message, Class<?> type, LocalDateTime now) {
		super();
		this.message = message;
		this.type = type;
		
		//this(message, type);
		
		this.now = now;
	}
	public ExMessage(String message, Class<?> type) {
		super();
		this.message = message;
		this.type = type;
		this.now = LocalDateTime.now();
	}
	public ExMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Class<?> getType() {
		return type;
	}
	public void setType(Class<?> type) {
		this.type = type;
	}
	public LocalDateTime getNow() {
		return now;
	}
	public void setNow(LocalDateTime now) {
		this.now = now;
	}
	@Override
	public String toString() {
		return "ExMessage [message=" + message + ", type=" + type + ", now=" + now + "]";
	}
	
}
