package com.fsoft.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Food {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private String food_id;

	@NotEmpty(message = "*Please provide food name")
	private String foodName;

	@NotEmpty(message = "*Please provide quantity")
	private int quantity;

	@OneToMany
	@JoinColumn(name = "food_id", referencedColumnName = "food_id")
	private List<AnimalFood> animalFood;

	public Food() {
		super();
	}

	public String getFood_id() {
		return food_id;
	}

	public void setFood_id(String food_id) {
		this.food_id = food_id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<AnimalFood> getAnimalFood() {
		return animalFood;
	}

	public void setAnimalFood(List<AnimalFood> animalFood) {
		this.animalFood = animalFood;
	}

	@Override
	public String toString() {
		return "Food [id=" + food_id + ", foodName=" + foodName + ", quantity=" + quantity + "]";
	}

}
