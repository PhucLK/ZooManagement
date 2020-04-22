package com.fsoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.model.AnimalType;
import com.fsoft.repository.AnimalTypeRepository;
import com.fsoft.service.AnimalTypeService;

@Service
public class AnimalTypeServiceImpl implements AnimalTypeService {

	@Autowired
	AnimalTypeRepository animalTypeRepository;

	@Override
	public List<AnimalType> getAllAnimalTypes() {
		// TODO Auto-generated method stub
		return (List<AnimalType>) animalTypeRepository.findAll();
	}

	@Override
	public AnimalType saveAnimalType(AnimalType animalType) {
		// TODO Auto-generated method stub
		return animalTypeRepository.save(animalType);
	}

	@Override
	public boolean deleteAnimalType(String id) {
		// TODO Auto-generated method stub
		animalTypeRepository.delete(id);
		return animalTypeRepository.exists(id);
	}

	@Override
	public AnimalType getAnimalType(String id) {
		// TODO Auto-generated method stub
		return animalTypeRepository.findOne(id);
	}

}
