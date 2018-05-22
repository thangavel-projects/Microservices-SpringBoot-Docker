package com.sample.swimming.pool.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DisoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisoveryApplication.class, args);
	}
}
