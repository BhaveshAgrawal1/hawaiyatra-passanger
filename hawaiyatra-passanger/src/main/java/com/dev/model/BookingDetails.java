package com.dev.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class BookingDetails implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pnr;
	private Integer flight_id;
	private String name;
	private String email_id;
	private LocalDateTime booking_date;
	private Integer seat;
	private Integer round_trip;
	private String travel_class;
	private Integer flight_number;
	private String flight_name;
	private String source;
	private String destination;
	private LocalDateTime departure_time;
	private LocalDateTime arrival_time;
	private double fare;
	private Integer status;
	private String comment;
	private LocalDateTime modify_date;
	@ElementCollection
	private List<PassangerDetails> details;
	@ElementCollection
	private List<RoundTripDetails> round_trip_details;
	
	
	public BookingDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public List<PassangerDetails> getDetails() {
		return details;
	}



	public void setDetails(List<PassangerDetails> details) {
		this.details = details;
	}



	public List<RoundTripDetails> getRound_trip_details() {
		return round_trip_details;
	}



	public void setRound_trip_details(List<RoundTripDetails> round_trip_details) {
		this.round_trip_details = round_trip_details;
	}



	public Integer getFlightId() {
		return flight_id;
	}



	public void setFlightId(Integer flight_id) {
		this.flight_id = flight_id;
	}



	public Integer getPnr() {
		return pnr;
	}
	public void setPnr(Integer pnr) {
		this.pnr = pnr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public LocalDateTime getBooking_date() {
		return booking_date;
	}
	public void setBooking_date(LocalDateTime booking_date) {
		this.booking_date = booking_date;
	}
	public Integer getSeat() {
		return seat;
	}
	public void setSeat(Integer seat) {
		this.seat = seat;
	}
	public Integer getRound_trip() {
		return round_trip;
	}
	public void setRound_trip(Integer round_trip) {
		this.round_trip = round_trip;
	}
	public String getTravel_class() {
		return travel_class;
	}
	public void setTravel_class(String travel_class) {
		this.travel_class = travel_class;
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
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public LocalDateTime getModify_date() {
		return modify_date;
	}
	public void setModify_date(LocalDateTime modify_date) {
		this.modify_date = modify_date;
	}

}
