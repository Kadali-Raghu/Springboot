package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.car.Vehicle;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.c, args);
		ConfigurableApplicationContext context=
				SpringApplication.run(DemoApplication.class, args);
		Vehicle rd=context.getBean(Vehicle.class);
		rd.control();
	}

}
