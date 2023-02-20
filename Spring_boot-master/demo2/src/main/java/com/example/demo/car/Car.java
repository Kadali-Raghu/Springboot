package com.example.demo.car;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Car implements Vehicle_console{
	public void wheels() {
		System.out.println("4 wheels");
		
	}
	public void followsfety() {
		System.out.println("Go minmum speed");
		
	}

}
