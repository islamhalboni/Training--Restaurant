package com.asal.example.TrainingRestuarant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrainingRestuarantApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingRestuarantApplication.class, args);
		Auth auth = new Auth();
		System.out.println(auth.helloWorld());
	}

}
