package com.example.demo.Controller.Ser;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/display")
public class StudentDetails {
	@GetMapping("/output")
	public List<Student> getStudent(){
		return List.of(new Student(1,"ganesh","civil"),
				new Student(1,"ganesh","civil"),
				new Student(1,"ganesh","civil"),new Student(1,"ganesh","civil")
				,new Student(1,"ganesh","civil"));
		
	}

}
