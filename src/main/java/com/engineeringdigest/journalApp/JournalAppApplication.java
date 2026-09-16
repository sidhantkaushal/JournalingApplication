package com.engineeringdigest.journalApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JournalAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome Journal Application");
		SpringApplication.run(JournalAppApplication.class, args);
	}

}
