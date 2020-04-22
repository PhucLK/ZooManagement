package com.fsoft.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsoft.model.AnimalType;

@Repository
public interface AnimalTypeRepository extends CrudRepository<AnimalType, String> {

}
