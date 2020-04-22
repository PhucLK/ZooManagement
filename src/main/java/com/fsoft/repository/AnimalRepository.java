package com.fsoft.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsoft.model.Animal;

@Repository
public interface AnimalRepository extends CrudRepository<Animal, String> {
	
}
