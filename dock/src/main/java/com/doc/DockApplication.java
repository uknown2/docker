package com.doc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping
public class DockApplication {
	@GetMapping("/demo")
	public String demo() {
		return "hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(DockApplication.class, args);
	}

}



//docker build -t dock:latest .
//docker images
//docker run -p 8081:8080 dock