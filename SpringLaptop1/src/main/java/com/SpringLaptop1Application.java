package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLaptop1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringLaptop1Application.class, args);
		System.out.println("Connected to Database");
	}

}
