package com.fsoft.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class AnimalFood {

	@EmbeddedId
	private AnimalFoodId animalFoodId;

	private int quantityEat;
	
	public AnimalFood() {
		super();
	}

	public int getQuantityEat() {
		return quantityEat;
	}

	public void setQuantityEat(int quantityEat) {
		this.quantityEat = quantityEat;
	}

	public AnimalFoodId getAnimalFoodId() {
		return animalFoodId;
	}

	public void setAnimalFoodId(AnimalFoodId animalFoodId) {
		this.animalFoodId = animalFoodId;
	}

}
