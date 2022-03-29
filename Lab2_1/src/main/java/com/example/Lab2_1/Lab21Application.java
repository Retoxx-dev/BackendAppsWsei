package com.example.Lab2_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Lab21Application {
	@GetMapping("/")
	public String index(){
		return "Hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(Lab21Application.class, args);
	}

}
