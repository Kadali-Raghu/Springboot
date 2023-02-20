package com.example.demo.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
 private Vehicle_console v;
// public Vehicle(Vehicle_console v) {
//	 this.v=v;
//	
//}
 
 @Autowired
	public Vehicle(@Qualifier("Car") Vehicle_console v) {
		this.v = v;
	}

 
 public void control (){
	v.wheels();
	v.followsfety();
	
	
}
	


}
