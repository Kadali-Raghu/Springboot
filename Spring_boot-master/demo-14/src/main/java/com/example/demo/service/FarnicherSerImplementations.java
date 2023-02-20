package com.example.demo.service;

import javax.transaction.Transactional;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Furniture;
import com.example.demo.persistance.FernicharDAOImplementations;

@Service
public class FarnicherSerImplementations implements FernicherServdeclaration {
	private FernicharDAOImplementations em;
@Autowired
	public FarnicherSerImplementations(FernicharDAOImplementations em) {
		
		this.em = em;
	}
    
@Override
@Transactional
    public List<Furniture> showAll() {
	return em.displayAll();
}

@Override
@Transactional
     public Furniture fetchById(int id) {
	Furniture emp=em.getById(id);
   return emp;
}

@Override
@Transactional
public void insorup(Furniture farnicher) {
	em.save(farnicher);
}

@Override
@Transactional
public void delete(int id) {
em.deleteById(id);
}

	
	

}
