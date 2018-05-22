package com.sample.swimming.pool.reservation.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;
import com.sample.swimming.pool.reservation.dto.AvailableScheduleDTO;
import com.sample.swimming.pool.reservation.model.RegistrationDetails;
import com.sample.swimming.pool.reservation.repository.RegistrationRepository;

@Controller
public class WebUiController {

	@Autowired
	RegistrationRepository registrationRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(value="/", produces = "application/json")
	public String displayHomePage(Model model) {
		String uri = "http://reservation-service:8181/rest/schedule/all";
	    AvailableScheduleDTO [] responseEntity = restTemplate.getForObject(uri, AvailableScheduleDTO[].class);
		model.addAttribute("registration", responseEntity);
		return "index";
	}
	
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
}
