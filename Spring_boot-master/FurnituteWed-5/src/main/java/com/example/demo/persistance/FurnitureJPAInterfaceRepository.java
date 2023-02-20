package com.example.demo.persistance;

import java.util.List;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Furniture;
@RepositoryRestResource
public interface FurnitureJPAInterfaceRepository extends JpaRepository<Furniture, Integer>{
	@Query (value="select * from furnitures f where f.fname like %:name%",nativeQuery=true)
	public List <Furniture> findFurnitureByName(@Param("name")String name);

}
