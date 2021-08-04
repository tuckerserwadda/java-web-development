package com.udacity.jdnd.review;
/**
 * Start with previous final review exercise.
 * Create a bean with data.
 * Create a service that uses that data.
 * Test that the service receives the bean with logging.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);

	}
	@Bean
	public String message(){
		System.out.println("message bean created");
		return "Hello Spring";
	}
	@Bean
	public String upperCaseMessage(MessageService messageService){
		System.out.println("upper case created");
		return messageService.upperCase();
	}
	@Bean
	public String lowerCaseMessage(MessageService messageService){
		System.out.println("lower case created ");
		return messageService.lowerCase();
	}


}
