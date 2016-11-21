package com.example;

import com.example.pojo.AuthorSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PropertiesApplication {

	@Autowired
	private AuthorSettings authorSettings;

	@RequestMapping("/")
	public String index() {
		return "author name is " + authorSettings.getName() + "and author age is "+ authorSettings.getAge();
	}

	public static void main(String[] args) {
		SpringApplication.run(PropertiesApplication.class, args);
	}
}
