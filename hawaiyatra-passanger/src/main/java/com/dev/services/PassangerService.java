package com.dev.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


import com.dev.exception.PassangerException;
import com.dev.model.*;
import com.dev.repositories.PassangerRepositories;

@Service
public class PassangerService {
	
	@Autowired
	private PassangerRepositories repo;
	
	public BookingDetails ticketBooking(BookingDetails details)throws PassangerException {
		if(details != null) {
			if(details.getRound_trip() == 0) {
			  RestTemplate restTemplate = new RestTemplate();
			  
			  String resourceUrl = "http://localhost:9090/airtravel/seatbooking";
			  HttpEntity<BookingSeats> request = new HttpEntity<BookingSeats>( new
			  BookingSeats(details.getFlightId(),0,false,details.getSeat(),details.getTravel_class()));
			  
			  // Send the PUT method as a method parameter 
			  restTemplate.exchange(resourceUrl, HttpMethod.PUT, request, Void.class);
			}
			else {
				RestTemplate restTemplate = new RestTemplate();
				  
				  String resourceUrl = "http://localhost:9090/airtravel/seatbooking";
				  HttpEntity<BookingSeats> request = new HttpEntity<BookingSeats>( new
				  BookingSeats(details.getFlightId(),details.getRound_trip_details().get(0).getFlight_id(),true,details.getSeat(),details.getTravel_class()));
				  
				  // Send the PUT method as a method parameter 
				  restTemplate.exchange(resourceUrl, HttpMethod.PUT, request, Void.class);
			}
			LocalDateTime createdate = LocalDateTime.now();
			details.setBooking_date(createdate);
			return repo.save(details);
		}
		throw new PassangerException("Incorrect value recived");
		
	}
	
	public BookingDetails searchByPnr(PnrSearch details) throws PassangerException{
		Optional<BookingDetails> optional = repo.findById(details.getPnr());
		if(optional.isPresent()) {
		return optional.get();
		}
		throw new PassangerException("PNR No:- "+details.getPnr()+" is not present");
	}
	
	public List<BookingDetails> searchByEmailId(EmailIdSearch details) throws PassangerException{
		List<BookingDetails> history = repo.searchByEmailId(details.getEmail_id());
		if(history != null) {
		return history;
		}
		throw new PassangerException("History not present for given email id");
	}
	
	public String cancelTicket(CancelTicket cancel)  throws PassangerException {
		if(cancel != null && cancel.getPnr() != null && cancel.getComment() != null && cancel.getComment() != "") {
			Optional<BookingDetails> optional = repo.findById(cancel.getPnr());
			if(optional.isPresent()) {
				BookingDetails details = optional.get();
				LocalDateTime modifydate = LocalDateTime.now();
				details.setModify_date(modifydate);
				details.setComment(cancel.getComment());
				details.setStatus(0);
				BookingDetails  cancel_detail = repo.save(details);
				
				if(details.getRound_trip() == 0) {
					  RestTemplate restTemplate = new RestTemplate();
					  
					  String resourceUrl = "http://localhost:9090/airtravel/cancelseatbooking";
					  HttpEntity<BookingSeats> request = new HttpEntity<BookingSeats>( new
					  BookingSeats(details.getFlightId(),0,false,details.getSeat(),details.getTravel_class()));
					  
					  // Send the PUT method as a method parameter 
					  restTemplate.exchange(resourceUrl, HttpMethod.PUT, request, Void.class);
					}
					else {
						RestTemplate restTemplate = new RestTemplate();
						  
						  String resourceUrl = "http://localhost:9090/airtravel/cancelseatbooking";
						  HttpEntity<BookingSeats> request = new HttpEntity<BookingSeats>( new
						  BookingSeats(details.getFlightId(),details.getRound_trip_details().get(0).getFlight_id(),true,details.getSeat(),details.getTravel_class()));
						  
						  // Send the PUT method as a method parameter 
						  restTemplate.exchange(resourceUrl, HttpMethod.PUT, request, Void.class);
					}
				return "Ticket Id: "+cancel.getPnr()+" is canceled ";
			}
			throw new PassangerException("Ticket id:- "+cancel.getPnr()+" is not present");
		}	
		throw new PassangerException("Incorrect value recived");
	}
	

}
