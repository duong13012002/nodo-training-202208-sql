package com.example.unit6_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@Configuration
@SpringBootApplication
//@ImportResource("classpath:config.xml")
public class Unit6SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(Unit6SpringBootApplication.class, args);
//		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
	}

}
