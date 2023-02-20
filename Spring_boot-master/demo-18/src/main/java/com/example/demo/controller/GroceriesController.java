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

import com.example.demo.entity.Groceries;
import com.example.demo.service.GroceriesSerImplementations;

@RestController
@RequestMapping("/market")
public class GroceriesController 
{
private GroceriesSerImplementations grcser;

@Autowired
public GroceriesController(GroceriesSerImplementations grcser) {
	this.grcser = grcser;
}

@GetMapping("/Groceries") 
public List<Groceries> fetchAll()
{
	return grcser.showAll();
}

@GetMapping("/Groceries/{GroceriesId}") 
public Groceries receiveById(@PathVariable int GroceriesId)
{
	Groceries gvc=grcser.fetchById(GroceriesId);
	if(gvc==null)
		throw new RuntimeException("Groceries not exsisted with this id :"+GroceriesId);
	return gvc;	
}

@PostMapping("/Groceries")
public void addGroceries(@RequestBody Groceries Groceries)
{
	Groceries.setId(0);
	grcser.insorup(Groceries);
}

@PutMapping("/Groceries")
public void updateGroceries(@RequestBody Groceries Groceries)
{
	grcser.insorup(Groceries);
}

@DeleteMapping("/Groceries/{GroceriesId}")
public String deleteOnId(@PathVariable int GroceriesId)
{
	Groceries grc=grcser.fetchById(GroceriesId);
	if(grc==null)
		throw new RuntimeException("Groceries not exsisted to delete:"+GroceriesId);
	grcser.delete(GroceriesId);
	return "Deleted Groceries id is :" +GroceriesId;
}
}
