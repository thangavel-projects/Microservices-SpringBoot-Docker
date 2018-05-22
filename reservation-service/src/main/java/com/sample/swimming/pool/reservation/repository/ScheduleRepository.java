package com.sample.swimming.pool.reservation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.sample.swimming.pool.reservation.model.Schedule;

public interface ScheduleRepository extends MongoRepository<Schedule, String> {

	
}
