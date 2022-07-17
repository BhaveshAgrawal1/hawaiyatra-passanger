package com.dev.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.client.AdminClient;
import com.dev.exception.PassangerException;
import com.dev.model.*;
import com.dev.services.PassangerService;

@RestController
@RequestMapping("/airtravel")
public class PassangerController {

	@Autowired
	private PassangerService service;
	
	@Autowired
	private AdminClient admin;

	@PostMapping("/booking")
	private BookingDetails ticketBooking(@RequestBody BookingDetails detail) throws PassangerException {
		return service.ticketBooking(detail);
	}
	
	@GetMapping("/searchbypnr")
	private BookingDetails searchByPnr(@RequestBody  PnrSearch search) throws PassangerException {
		return service.searchByPnr(search);
		
	}
	
	@GetMapping("/searchbyemailid")
	private List<BookingDetails> searchByEmailId(@RequestBody EmailIdSearch search) throws PassangerException {
		return service.searchByEmailId(search);
		
	}
	
	@PutMapping("/cancel")
	private String cancelTicket(@RequestBody CancelTicket cancel) throws PassangerException {
		return service.cancelTicket(cancel);
	}
	
	@GetMapping("/search")
	Map<String,List<SearchResponse>> getflight(@RequestBody SearchDetails details){
		return admin.getflight(details);
	}
	
	@PutMapping("/seatbooking")
	void updateSeat(@RequestBody BookingSeats details) {
		admin.updateSeat(details);
	}
	
	@PutMapping("/cancelseatbooking")
	void cancelSeatBooking(@RequestBody BookingSeats details) {
		admin.cancelSeatBooking(details);
	}

}
