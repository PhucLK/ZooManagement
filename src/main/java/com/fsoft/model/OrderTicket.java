package com.fsoft.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class OrderTicket {

	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private int id;
	
	@NotEmpty(message = "*Please provide address")
	private String address;
	
	@NotEmpty(message = "*Please provide fullname")
	private String fullName;
	
	@NotEmpty(message = "*Please provide a card")
	private String identityCard;
	
	@NotEmpty(message = "*Please provide phone number")
	private String phone;
	
	private int quantity;
	
	private boolean statusPay;
	
	private Date timeOrder;
	
	private Date timeUse;
	
	@OneToOne
	@JoinColumn(name = "serviceCost_id")
	private ServiceCost serviceCost;

	public OrderTicket() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIdentityCard() {
		return identityCard;
	}

	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isStatusPay() {
		return statusPay;
	}

	public void setStatusPay(boolean statusPay) {
		this.statusPay = statusPay;
	}

	public Date getTimeOrder() {
		return timeOrder;
	}

	public void setTimeOrder(Date timeOrder) {
		this.timeOrder = timeOrder;
	}

	public Date getTimeUse() {
		return timeUse;
	}

	public void setTimeUse(Date timeUse) {
		this.timeUse = timeUse;
	}

	public ServiceCost getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(ServiceCost serviceCost) {
		this.serviceCost = serviceCost;
	}

	@Override
	public String toString() {
		return "OrderTicket [id=" + id + ", address=" + address + ", fullName=" + fullName + ", identityCard="
				+ identityCard + ", phone=" + phone + ", quantity=" + quantity + ", statusPay=" + statusPay
				+ ", timeOrder=" + timeOrder + ", timeUse=" + timeUse + ", serviceCost=" + serviceCost + "]";
	}
	
	
}
