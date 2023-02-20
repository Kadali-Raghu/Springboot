package com.example.demo.persistance;



import java.util.List;

import com.example.demo.entity.Furniture;

public interface FernicharDAOdeclartions {
	public List<Furniture> displayAll(); //select all employees
	public Furniture getById(int id); //select based on id--->jpa-get()
	public void save(Furniture farnicher); //insert update  -->jpa-saveOrUpdate()
	public void deleteById(int id);

}
