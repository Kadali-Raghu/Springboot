package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.Furniture;

public interface FernicherServdeclaration {
	
	public List<Furniture> showAll(); //select all 
	public Furniture fetchById(int id); //select based on id
	public void insorup(Furniture farnicher); //insert update  
	public void delete(int id); //delete

}
