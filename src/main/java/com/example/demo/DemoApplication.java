package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Start application");
		System.out.println("branch 2");
                System.out.println("komunikat");
		SpringApplication.run(DemoApplication.class, args);
                
                System.out.println("branch 4");
	}

}
