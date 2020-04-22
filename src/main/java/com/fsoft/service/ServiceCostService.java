package com.fsoft.service;

import java.util.List;

import com.fsoft.model.ServiceCost;


public interface ServiceCostService {

	List<ServiceCost> getAllServiceCosts();
	
	ServiceCost saveServiceCost(ServiceCost serviceCost);
	
	boolean deleteServiceCost(int id);
	
	ServiceCost getServiceCost(int id);
}
