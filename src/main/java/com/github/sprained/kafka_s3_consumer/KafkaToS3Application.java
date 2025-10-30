package com.github.sprained.kafka_s3_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaToS3Application {

	public static void main(String[] args) {
		SpringApplication.run(KafkaToS3Application.class, args);
	}

}
