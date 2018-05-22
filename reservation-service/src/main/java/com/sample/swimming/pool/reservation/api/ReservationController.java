package com.sample.swimming.pool.reservation.api;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.swimming.pool.reservation.model.Reservation;
import com.sample.swimming.pool.reservation.repository.ReservationRepository;

@RestController
@RequestMapping("/rest/reservation")
public class ReservationController {

	@Autowired
	private ReservationRepository reservationDetails;
	
	@GetMapping("/all")
	public List<Reservation> getAll() {
		return reservationDetails.findAll();
	}
	
	@GetMapping("/hello")
	public String greetings() {
		return "Hello World";
	}
}
