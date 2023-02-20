package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class HostalDetails {
	public List<Hostal> getHostal(){
		return List.of(new Hostal(1,"srilatha",6500,"hyd"),new Hostal(1,"srilatha",6500,"hyd"),new Hostal(1,"srilatha",6500,"hyd"));
		
	}

}
