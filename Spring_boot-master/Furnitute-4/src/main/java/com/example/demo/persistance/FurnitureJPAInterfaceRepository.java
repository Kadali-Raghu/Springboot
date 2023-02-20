package com.example.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.entity.Furniture;
@RepositoryRestResource(path = "ganesh")
public interface FurnitureJPAInterfaceRepository extends JpaRepository<Furniture, Integer>{

}
