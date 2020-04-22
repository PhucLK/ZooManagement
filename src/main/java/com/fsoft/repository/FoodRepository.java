package com.fsoft.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fsoft.model.Food;

@Repository
public interface FoodRepository extends CrudRepository<Food, String> {

}
