package com.spring.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaWithSpringBootConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaWithSpringBootConsumerApplication.class, args);
		System.out.println("Inside consumer kafka project");
	}

}
