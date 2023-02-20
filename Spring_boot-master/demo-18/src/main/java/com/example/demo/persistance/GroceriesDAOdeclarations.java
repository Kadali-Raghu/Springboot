package com.example.demo.persistance;

import java.util.List;

import com.example.demo.entity.Groceries;

public interface GroceriesDAOdeclarations {
	public List <Groceries> displayAll();
	public Groceries getById(int id);
	public void save(Groceries groceries);
	public void deleteById(int id);
	

}
