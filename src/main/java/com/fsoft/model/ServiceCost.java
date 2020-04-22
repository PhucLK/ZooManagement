package com.fsoft.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class ServiceCost {

	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;
	
	private int quantity;
	
	@NotEmpty(message = "*Please provide price")
	private double servicePrice;
	
	@Temporal(TemporalType.DATE)
	private Date startDate;
	
	
	@Temporal(TemporalType.DATE)
	private Date startTime;
	
	@OneToOne
	@JoinColumn(name = "service_id")
	private Service service;
	
	@OneToOne(mappedBy = "serviceCost")
	private OrderTicket orderTicket;

	public ServiceCost() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getServicePrice() {
		return servicePrice;
	}

	public void setServicePrice(double servicePrice) {
		this.servicePrice = servicePrice;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	

	public OrderTicket getOrderTicket() {
		return orderTicket;
	}

	public void setOrderTicket(OrderTicket orderTicket) {
		this.orderTicket = orderTicket;
	}

	@Override
	public String toString() {
		return "ServiceCost [id=" + id + ", quantity=" + quantity + ", servicePrice=" + servicePrice + ", startDate="
				+ startDate + ", startTime=" + startTime + ", service=" + service + "]";
	}
	
	
}
