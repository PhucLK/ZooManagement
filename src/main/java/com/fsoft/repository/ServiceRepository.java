package com.fsoft.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsoft.model.Service;

@Repository
public interface ServiceRepository extends CrudRepository<Service, Integer> {

}
