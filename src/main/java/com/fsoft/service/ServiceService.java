package com.fsoft.service;

import java.util.List;

import com.fsoft.model.Service;

public interface ServiceService {

	List<Service> getAllServices();
	
	Service saveService(Service service);
	
	boolean deleteService(int id);
}
