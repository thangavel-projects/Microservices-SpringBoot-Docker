package com.sample.swimming.pool.reservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sample.swimming.pool.reservation.model.RegistrationDetails;

public interface RegistrationRepository extends MongoRepository<RegistrationDetails, String> {

	
}
