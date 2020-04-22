package com.fsoft.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Employee {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private String employee_id;

	@NotEmpty(message = "*Please provide address")
	private String address;

	@NotEmpty(message = "*Please provide name of employee")
	private String employeeName;

	@NotEmpty(message = "*Please provide phone number")
	private String phoneNumber;

	private String position;
	
	@OneToMany(mappedBy = "employee")
	private List<Animal> animal;

	private String sex;

	public Employee() {
		super();
	}





	public String getEmployee_id() {
		return employee_id;
	}





	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}





	public List<Animal> getAnimal() {
		return animal;
	}


	public void setAnimal(List<Animal> animal) {
		this.animal = animal;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Employee [id=" + employee_id + ", address=" + address + ", employeeName=" + employeeName + ", phoneNumber="
				+ phoneNumber + ", position=" + position + ", sex=" + sex + "]";
	}

}
