package com.tts.SubscriberList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubscriberListApplication {
	private Long Id;
	private String firstName;

	public static void main(String[] args) {
		SpringApplication.run(SubscriberListApplication.class, args);
	}

}
