package com.fsoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.model.ServiceCost;
import com.fsoft.repository.ServiceCostRepository;
import com.fsoft.service.ServiceCostService;

@Service
public class ServiceCostImpl implements ServiceCostService {

	@Autowired
	ServiceCostRepository serviceCostRepository;
	
	@Override
	public List<ServiceCost> getAllServiceCosts() {
		// TODO Auto-generated method stub
		return (List<ServiceCost>) serviceCostRepository.findAll();
	}

	@Override
	public ServiceCost saveServiceCost(ServiceCost serviceCost) {
		// TODO Auto-generated method stub
		return serviceCostRepository.save(serviceCost);
	}

	@Override
	public boolean deleteServiceCost(int id) {
		// TODO Auto-generated method stub
		serviceCostRepository.delete(id);
		return serviceCostRepository.exists(id);
	}

	@Override
	public ServiceCost getServiceCost(int id) {
		// TODO Auto-generated method stub
		return serviceCostRepository.findOne(id);
	}

}
