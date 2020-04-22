package com.fsoft.service;

import java.util.List;

import com.fsoft.model.Food;

public interface FoodService {

	List<Food> getAllFoods();
	
	Food saveFood(Food food);
	
	boolean deleteFood(String id);
	
	Food getFood(String id);
}
