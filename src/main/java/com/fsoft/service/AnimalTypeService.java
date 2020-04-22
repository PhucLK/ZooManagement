package com.fsoft.service;

import java.util.List;

import com.fsoft.model.AnimalType;

public interface AnimalTypeService {

	List<AnimalType> getAllAnimalTypes();
	
	AnimalType saveAnimalType(AnimalType animalType);
	
	//AnimalType getAnimalType(int id);
	
	//boolean deleteAnimalType(int id);

	boolean deleteAnimalType(String id);

	AnimalType getAnimalType(String id);
}
