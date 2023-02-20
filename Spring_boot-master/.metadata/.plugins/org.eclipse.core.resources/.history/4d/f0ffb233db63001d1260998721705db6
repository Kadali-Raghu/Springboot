package com.example.demo.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Furniture;
import com.example.demo.service.FarnicherSerImplementations;

@RestController
@RequestMapping("/display")
public class FarnicherController {
	public FarnicherSerImplementations ems;
@Autowired
	public FarnicherController(FarnicherSerImplementations ems) {
	
		this.ems = ems;
	}
	
	@GetMapping("/fr") 
	public List<Furniture> fetchAll()
	{
		return ems.showAll();
	}

	@GetMapping("/fr/{frId}") 
	public Furniture receiveById(@PathVariable int frId)
	{
		Furniture emp=ems.fetchById(frId);
		if(emp==null)
			throw new RuntimeException("Farnicher not exsisted with this id :"+frId);
		return emp;	
	}

	@PostMapping("/fr")
	public void addFarnicher(@RequestBody Furniture farnicher)
	{
		farnicher.setId(0);
		ems.insorup(farnicher);
	}

	@PutMapping("/fr")
	public void updateFarnicher(@RequestBody Furniture farnicher)
	{
		ems.insorup(farnicher);
	}

	@DeleteMapping("/fr/{frId}")
	public String deleteOnId(@PathVariable int frId)
	{
		Furniture emp=ems.fetchById(frId);
		if(emp==null)
			throw new RuntimeException("farnicher not exsisted to delete:"+frId);
		ems.delete(frId);
		return "Deleted Farnicher id is :" +frId;
	}

}
