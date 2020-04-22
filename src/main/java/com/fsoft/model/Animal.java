package com.fsoft.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Animal {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private String animal_id;

	@NotEmpty(message = "*Please provide animal name")
	@Length(min = 5, message = "*animal name must have at least 5 character")
	private String animalName;

	private String sex;

	@NotEmpty(message = "*Please provide animal weight")
	private double weight;

	@ManyToOne
	@JoinColumn(name = "employee_Id")
	private Employee employee;

	@ManyToOne
	@JoinColumn(name = "animalType_id")
	private AnimalType animalType;

	@OneToMany
	@JoinColumn(name = "animal_id", referencedColumnName = "animal_id")
	private List<AnimalFood> animalFood;

	public Animal() {
		super();
	}

	public String getAnimal_id() {
		return animal_id;
	}


	public void setAnimal_id(String animal_id) {
		this.animal_id = animal_id;
	}


	public String getAnimalName() {
		return animalName;
	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public List<AnimalFood> getAnimalFood() {
		return animalFood;
	}

	public void setAnimalFood(List<AnimalFood> animalFood) {
		this.animalFood = animalFood;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public AnimalType getAnimalType() {
		return animalType;
	}

	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}

	@Override
	public String toString() {
		return "Animal [id=" + animal_id + ", animalName=" + animalName + ", sex=" + sex + ", weight=" + weight + ", employee="
				+ employee + "]";
	}

}
