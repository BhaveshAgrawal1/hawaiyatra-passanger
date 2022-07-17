package com.dev.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SearchDetails {
	
	private String source;
	private String destination;
	private LocalDate journey_date;
	private Integer seat;
	private String class_type;
	private boolean return_trip = false;
	private String return_source;
	private String return_destination;
	private LocalDate return_date;
	
	
	
	public SearchDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public boolean isReturn_trip() {
		return return_trip;
	}



	public void setReturn_trip(boolean return_trip) {
		this.return_trip = return_trip;
	}



	public String getReturn_source() {
		return return_source;
	}



	public void setReturn_source(String return_source) {
		this.return_source = return_source;
	}



	public String getReturn_destination() {
		return return_destination;
	}



	public void setReturn_destination(String return_destination) {
		this.return_destination = return_destination;
	}



	public LocalDate getReturn_date() {
		return return_date;
	}



	public void setReturn_date(LocalDate return_date) {
		this.return_date = return_date;
	}



	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public LocalDate getJourney_date() {
		return journey_date;
	}
	public void setJourney_date(LocalDate journey_date) {
		this.journey_date = journey_date;
	}
	public Integer getSeat() {
		return seat;
	}
	public void setSeat(Integer seat) {
		this.seat = seat;
	}
	public String getClass_type() {
		return class_type;
	}
	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}
	

}
