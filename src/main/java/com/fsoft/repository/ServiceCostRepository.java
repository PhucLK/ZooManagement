package com.fsoft.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsoft.model.ServiceCost;

@Repository
public interface ServiceCostRepository extends CrudRepository<ServiceCost, Integer> {

}
