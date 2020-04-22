package com.fsoft.service;

import java.util.List;

import com.fsoft.model.Animal;

public interface AnimalService {

	List<Animal> getAllAnimals();
	
	Animal saveAnimal(Animal animal);
	
	//Animal findAnimalById(int id);
	
	//boolean deleteAnimal(int id);

	Animal findAnimalById(String id);

	boolean deleteAnimal(String id);
}
