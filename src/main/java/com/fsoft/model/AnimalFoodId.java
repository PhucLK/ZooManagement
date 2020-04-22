package com.fsoft.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class AnimalFoodId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String animal_id;

	private String food_id;

	public AnimalFoodId() {
		super();
	}



	public AnimalFoodId(String animal_id, String food_id) {
		super();
		this.animal_id = animal_id;
		this.food_id = food_id;
	}



	public String getAnimal_id() {
		return animal_id;
	}



	public void setAnimal_id(String animal_id) {
		this.animal_id = animal_id;
	}



	public String getFood_id() {
		return food_id;
	}



	public void setFood_id(String food_id) {
		this.food_id = food_id;
	}



	@Override
	public int hashCode() {
		return Objects.hash(getAnimal_id(), getFood_id());
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimalFoodId other = (AnimalFoodId) obj;

		return Objects.equals(getAnimal_id(), other.getAnimal_id()) && Objects.equals(getFood_id(), other.getFood_id());
	}

}
