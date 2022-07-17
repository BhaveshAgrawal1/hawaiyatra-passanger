package com.dev.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.model.*;

public interface PassangerRepositories  extends JpaRepository<BookingDetails, Integer>  { 
	
	@Query("SELECT a from BookingDetails a where a.email_id=?1" )
	List<BookingDetails> searchByEmailId(String email_id);
	
}
