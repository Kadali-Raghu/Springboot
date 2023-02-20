package com.example.demo.service;



import java.util.List;

import com.example.demo.entity.Groceries;

public interface GroceriesSerdeclarations 
{
	public List<Groceries> showAll(); 
	public Groceries fetchById(int id); 
	public void insorup(Groceries groceries);  
	public void delete(int id); 
}
