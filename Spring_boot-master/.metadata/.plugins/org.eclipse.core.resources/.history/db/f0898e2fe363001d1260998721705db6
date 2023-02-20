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
import com.example.demo.service.FurnitureSerImplementtations;
@RestController
@RequestMapping("/market")
public class FurnitureController {
	private FurnitureSerImplementtations ems;
    @Autowired
	public FurnitureController(FurnitureSerImplementtations ems) {
		
		this.ems = ems;
	}
	
    @GetMapping("/Furniture") 
	public List<Furniture> fetchAll()
	{
		return ems.showAll();
	}

	@GetMapping("/Furniture/{FurnitureId}") 
	public Furniture receiveById(@PathVariable int FurnitureId)
	{
		Furniture mp=ems.fetchById(FurnitureId);
		if(mp==null)
			throw new RuntimeException("Furniture not exsisted with this id :"+FurnitureId);
		return mp;	
	}

	@PostMapping("/Furniture")
	public void addFurniture(@RequestBody Furniture furniture)
	{
		furniture.setId(0);
		ems.insorup(furniture);
	}

	@PutMapping("/Furniture")
	public void updateFurniture(@RequestBody Furniture furniture)
	{
		ems.insorup(furniture);
	}

	@DeleteMapping("/Furniture/{FurnitureId}")
	public String deleteOnId(@PathVariable int FurnitureId)
	{
		Furniture mp=ems.fetchById(FurnitureId);
		if(mp==null)
			throw new RuntimeException("Furniture not exsisted to delete:"+FurnitureId);
		ems.delete(FurnitureId);
		return "Deleted Farnicher id is :" +FurnitureId;
	}

}
