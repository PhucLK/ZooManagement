package com.fsoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fsoft.model.Food;
import com.fsoft.repository.FoodRepository;
import com.fsoft.service.FoodService;

@Service
public class FoodServiceImpl implements FoodService {

	@Autowired
	FoodRepository foodRepository;

	@Override
	public List<Food> getAllFoods() {
		// TODO Auto-generated method stub
		return (List<Food>) foodRepository.findAll();
	}

	@Override
	public Food saveFood(Food food) {
		// TODO Auto-generated method stub
		return foodRepository.save(food);
	}

	@Override
	public boolean deleteFood(String id) {
		// TODO Auto-generated method stub
		foodRepository.delete(id);
		return foodRepository.exists(id);
	}

	@Override
	public Food getFood(String id) {
		// TODO Auto-generated method stub
		return foodRepository.findOne(id);
	}

}
