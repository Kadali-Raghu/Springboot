package com.example.demo.service;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Groceries;
import com.example.demo.persistance.GroceriesDAOimplementations;

@Service
public class GroceriesSerImplementations  implements GroceriesSerdeclarations{
private GroceriesDAOimplementations grcdao;

@Autowired
	public GroceriesSerImplementations(GroceriesDAOimplementations grcdao) {
	this.grcdao = grcdao;
}

	@Override
	@Transactional
	public List<Groceries> showAll() {
		return grcdao.displayAll();
	}

	@Override
	@Transactional
	public Groceries fetchById(int id) {
		Groceries grc=grcdao.getById(id);
	return grc;
	}

	@Override
	@Transactional
	public void insorup(Groceries groceries) {
		grcdao.save(groceries);
	}

	@Override
	@Transactional
	public void delete(int id) {
	grcdao.deleteById(id);
	}

}
