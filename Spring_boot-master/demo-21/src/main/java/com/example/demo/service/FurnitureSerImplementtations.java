package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entity.Furniture;

import com.example.demo.persistance.Furniture_jpa_DAOImplementations;
@Service
public class FurnitureSerImplementtations implements FurnitureSerdeclarations {
	private Furniture_jpa_DAOImplementations em;
    @Autowired
	public FurnitureSerImplementtations(Furniture_jpa_DAOImplementations em) {
	
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
    	Furniture mp=em.getById(id);
       return mp;
    }

    @Override
    @Transactional
    public void insorup(Furniture furniture) {
    	em.save(furniture);
    }

    @Override
    @Transactional
    public void delete(int id) {
    em.deleteById(id);
    }

	

}
