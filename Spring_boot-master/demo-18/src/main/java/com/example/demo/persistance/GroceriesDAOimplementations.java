package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Groceries;

@Repository
public class GroceriesDAOimplementations implements GroceriesDAOdeclarations
{

private EntityManager entitymanager;

@Autowired
	public GroceriesDAOimplementations(EntityManager entitymanager) {
	this.entitymanager = entitymanager;
    }
	@Override
	public List<Groceries> displayAll() {
		
		Session session=entitymanager.unwrap(Session.class);
		Query<Groceries> query=session.createQuery("from Groceries",Groceries.class);
		 List<Groceries> employees=query.getResultList();
	
		return employees;
	}

	@Override
	public Groceries getById(int id) {
	
		Session session=entitymanager.unwrap(Session.class);
	    Groceries grc=session.get(Groceries.class,id);
	    return grc;   
	}
	@Override
	public void save(Groceries groceries) {	
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(groceries);
	}

	@Override
	public void deleteById(int id) {
		Session session=entitymanager.unwrap(Session.class);
		Query query=session.createQuery("delete from Groceries where id=:groceriesId");
		query.setParameter("groceriesId",id);
		query.executeUpdate();
	}

}
