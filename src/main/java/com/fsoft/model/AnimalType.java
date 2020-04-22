package com.fsoft.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class AnimalType {

	@Id
	@NotNull
	private String animalTypeId;
	
	@NotEmpty(message = "*Please provide animal type")
	private String animalTypeName;
	
	@OneToMany(mappedBy = "animalType")
	private List<Animal> animal;

	public AnimalType() {
		super();
	}



	public String getAnimalTypeId() {
		return animalTypeId;
	}



	public void setAnimalTypeId(String animalTypeId) {
		this.animalTypeId = animalTypeId;
	}



	public String getAnimalTypeName() {
		return animalTypeName;
	}

	public void setAnimalTypeName(String animalTypeName) {
		this.animalTypeName = animalTypeName;
	}



	public List<Animal> getAnimal() {
		return animal;
	}

	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "AnimalType [animalTypeId=" + animalTypeId + ", animalTypeName=" + animalTypeName + ", animal=" + animal
				+ "]";
	}
	
	
}
