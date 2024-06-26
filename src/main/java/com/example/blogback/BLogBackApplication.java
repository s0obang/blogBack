package com.example.blogback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
@EntityScan(basePackages = "com.example.blogback.entity")
public class BLogBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(BLogBackApplication.class, args);
	}

}
