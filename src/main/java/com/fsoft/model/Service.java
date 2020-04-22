package com.fsoft.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Service {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;
	
	@NotEmpty(message = "*Please provide desciption")
	private String description;
	
	private String image;
	
	@NotEmpty(message = "*Please provide service name")
	private String serviceName;
	
	@OneToOne
	@JoinColumn(name = "animalType_id")
	private AnimalType animalType;
	
	@OneToOne(mappedBy = "service")
	private ServiceCost serviceCost;

	public Service() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public AnimalType getAnimalType() {
		return animalType;
	}

	public void setAnimalType(AnimalType animalType) {
		this.animalType = animalType;
	}

	public ServiceCost getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(ServiceCost serviceCost) {
		this.serviceCost = serviceCost;
	}

	@Override
	public String toString() {
		return "Service [id=" + id + ", description=" + description + ", image=" + image + ", serviceName="
				+ serviceName + ", animalType=" + animalType + "]";
	}
	
	
}
