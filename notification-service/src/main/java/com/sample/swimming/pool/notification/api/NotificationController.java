package com.sample.swimming.pool.notification.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class NotificationController {

	@RequestMapping("/greetings")
	public String helloWorld() {
		return "hello world";
	}
}
