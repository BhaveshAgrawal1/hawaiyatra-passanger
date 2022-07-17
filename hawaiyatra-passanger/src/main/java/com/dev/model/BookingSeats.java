package com.dev.model;

public class BookingSeats {
	
	private int flight_id;
	private int return_flight_id;
	private boolean return_trip = false;
	private int  seat;
	private String travel_class;
	
	
	
	

	public BookingSeats(int flight_id, int return_flight_id, boolean return_trip, int seat, String travel_class) {
		super();
		this.flight_id = flight_id;
		this.return_flight_id = return_flight_id;
		this.return_trip = return_trip;
		this.seat = seat;
		this.travel_class = travel_class;
	}

	public BookingSeats() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public int getReturn_flight_id() {
		return return_flight_id;
	}

	public void setReturn_flight_id(int return_flight_id) {
		this.return_flight_id = return_flight_id;
	}

	public boolean isReturn_trip() {
		return return_trip;
	}

	public void setReturn_trip(boolean return_trip) {
		this.return_trip = return_trip;
	}

	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public String getTravel_class() {
		return travel_class;
	}
	public void setTravel_class(String travel_class) {
		this.travel_class = travel_class;
	}
	
	

}
