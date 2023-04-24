package com.example.hotel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HotelApplication {
        @GetMapping
        public String message(){
            return "Deploy success!";
        }
	public static void main(String[] args) {
		SpringApplication.run(HotelApplication.class, args);
	}

}
