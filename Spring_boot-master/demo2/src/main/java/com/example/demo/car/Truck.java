package com.example.demo.car;

import org.springframework.stereotype.Component;

@Component
public class Truck implements Vehicle_console{
	public void wheels() {
		System.out.println("more than  4 wheels");
		
	}
	public void followsfety() {
		System.out.println(" go slow");
		
	}

}
