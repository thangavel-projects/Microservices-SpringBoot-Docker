package com.sample.swimming.pool.reservation.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.sample.swimming.pool.reservation.model.Reservation;

public interface ReservationRepository extends MongoRepository<Reservation, String>  {

	public List<Reservation> findAll();
	
}