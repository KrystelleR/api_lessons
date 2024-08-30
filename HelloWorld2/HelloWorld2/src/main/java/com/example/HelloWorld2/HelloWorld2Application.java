package com.example.HelloWorld2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@SpringBootApplication
@RestController
public class HelloWorld2Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorld2Application.class, args);
	}

	@GetMapping("/hello")
	public Map<String, String> hello(){
		return Map.of("Hello","hello", "World","world");
	}
}
