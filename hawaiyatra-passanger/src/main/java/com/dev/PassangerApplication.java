package com.dev;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.dev.model.BookingDetails;
import com.dev.model.PassangerDetails;
import com.dev.model.RoundTripDetails;
import com.dev.services.PassangerService;

@SpringBootApplication
@EnableFeignClients
public class PassangerApplication {
	
	@Autowired
	private PassangerService service;

	public static void main(String[] args) {
		SpringApplication.run(PassangerApplication.class, args);
	}

}
