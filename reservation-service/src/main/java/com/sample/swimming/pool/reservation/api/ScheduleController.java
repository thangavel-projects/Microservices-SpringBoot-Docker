package com.sample.swimming.pool.reservation.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.swimming.pool.reservation.model.Schedule;
import com.sample.swimming.pool.reservation.repository.ScheduleRepository;

@RestController
@RequestMapping("/rest/schedule")
public class ScheduleController {

	@Autowired
	ScheduleRepository scheduleRepository;
	
	@GetMapping("/all")
	public List<Schedule> getAvailableSchedule(){
		System.out.println("Im Herer>>>>>"+scheduleRepository);
		return scheduleRepository.findAll();
	}
}
