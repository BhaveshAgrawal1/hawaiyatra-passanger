package com.dev.client;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dev.model.BookingSeats;
import com.dev.model.SearchDetails;
import com.dev.model.SearchResponse;

@FeignClient("admin")
public interface AdminClient {

	@GetMapping("/flight/search")
	Map<String,List<SearchResponse>> getflight(@RequestBody SearchDetails details);
	
	@PutMapping("/flight/seatbooking")
	void updateSeat(@RequestBody BookingSeats details);
	
	@PutMapping("/flight/cancelseatbooking")
	void cancelSeatBooking(@RequestBody BookingSeats details);
	
}
