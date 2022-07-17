package com.dev.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable 
public class RoundTripDetails implements Serializable {
	
	private Integer flight_id;
	private Integer flight_number;
	private String flight_name;
	private String source;
	private String destination;
	private LocalDateTime departure_time;
	private LocalDateTime arrival_time;
	
	
	
	public RoundTripDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Integer getFlight_id() {
		return flight_id;
	}



	public void setFlight_id(Integer flight_id) {
		this.flight_id = flight_id;
	}



	public Integer getFlight_number() {
		return flight_number;
	}
	public void setFlight_number(Integer flight_number) {
		this.flight_number = flight_number;
	}
	public String getFlight_name() {
		return flight_name;
	}
	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
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
	public LocalDateTime getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(LocalDateTime departure_time) {
		this.departure_time = departure_time;
	}
	public LocalDateTime getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(LocalDateTime arrival_time) {
		this.arrival_time = arrival_time;
	}

}
