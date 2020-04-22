package com.fsoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.model.Animal;
import com.fsoft.repository.AnimalRepository;
import com.fsoft.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	AnimalRepository animalRepository;

	@Override
	public List<Animal> getAllAnimals() {
		// TODO Auto-generated method stub
		return (List<Animal>) animalRepository.findAll();
	}

	@Override
	public Animal saveAnimal(Animal animal) {
		// TODO Auto-generated method stub
		return animalRepository.save(animal);
	}

	@Override
	public Animal findAnimalById(String id) {
		// TODO Auto-generated method stub
		return animalRepository.findOne(id);
	}

	@Override
	public boolean deleteAnimal(String id) {
		// TODO Auto-generated method stub
		animalRepository.delete(id);
		return animalRepository.exists(id);
	}

}
