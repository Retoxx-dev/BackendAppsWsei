package com.example.Lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class Lab2Application {

	@GetMapping("/")
	public String index(){
		return "index";
	}

	@GetMapping("/example")
	public String example(){
		return "example";
	}

	public static void main(String[] args) {
		SpringApplication.run(Lab2Application.class, args);
	}

}


