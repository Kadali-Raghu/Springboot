package com.example.demo.persistance;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Furniture;
@Repository
public class FurnitureDAOImplementations implements FurnitureDAOdeclartions{
	
	
	private EntityManager  entitymanager;
	@Autowired
	public FurnitureDAOImplementations(EntityManager entitymanager) {
	
		this.entitymanager = entitymanager;
		
	}
	@Override
	public List <Furniture> displayAll(){
		Session session=entitymanager.unwrap(Session.class);
		Query<Furniture> query=session.createQuery("from Furniture",Furniture.class);
		List<Furniture> Furnitu=query.getResultList();
		return Furnitu;
	}
	@Override
	public Furniture getById(int id) {
		Session session=entitymanager.unwrap(Session.class);
		Furniture frc=session.get(Furniture.class,id);
		return frc;
		
		
	}
	@Override
	public void save(Furniture furniture) {
		Session session=entitymanager.unwrap(Session.class);
		session.saveOrUpdate(furniture);
	}
	@Override
	public void deleteById(int id) {
		Session session=entitymanager.unwrap(Session.class);
		Query query=session.createQuery("delete from Furniture where id=:id");
		query.setParameter("id",id);
		query.executeUpdate();
		
	}

}
