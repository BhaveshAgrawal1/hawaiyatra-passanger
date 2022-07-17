package com.dev.model;

import java.time.LocalDateTime;

public class SearchResponse {
	
	private Integer id;
	private Integer flight_number;
	private String flight_name;
	private String source;
	private String destination;
	private LocalDateTime departure_time;
	private LocalDateTime arrival_time;
	private double fare;
	
	
	
	public SearchResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SearchResponse(Integer id,Integer flight_number, String flight_name, String source, String destination,
			LocalDateTime departure_time,LocalDateTime arrival_time,double fare) {
		super();
		this.id=id;
		this.flight_number = flight_number;
		this.flight_name = flight_name;
		this.source = source;
		this.destination = destination;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.fare = fare;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(LocalDateTime arrival_time) {
		this.arrival_time = arrival_time;
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
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}

}
