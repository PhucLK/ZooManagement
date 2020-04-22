package com.fsoft.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.fsoft.model.Food;
import com.fsoft.service.impl.FoodServiceImpl;

@Controller
@RequestMapping("/food")
public class FoodController {

	@Autowired
	FoodServiceImpl foodServiceImpl;
	
	@RequestMapping(value = { "/", "/add" }, method = RequestMethod.GET)
	String addFood(@RequestParam(value = "message", required = false) String message, Model model) {
		model.addAttribute("foods", foodServiceImpl.getAllFoods());
		model.addAttribute("food", new Food());
		model.addAttribute("action", "add");
		model.addAttribute("submit", "Add");
		model.addAttribute("message", message);
		return "foodManagement";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	String saveFood(Model model, @Valid @ModelAttribute("food") Food food,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("foods", foodServiceImpl.getAllFoods());
			model.addAttribute("food", new Food());
			model.addAttribute("action", "add");
			model.addAttribute("submit", "Add");
			return "foodManagement";
		}
		foodServiceImpl.saveFood(food);
		return "redirect:/food/add?message=Success";
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	String editFood(Model model, @PathVariable("id") String id) {
		Food food = foodServiceImpl.getFood(id);
		model.addAttribute("foods", foodServiceImpl.getAllFoods());
		model.addAttribute("action", "edit");
		model.addAttribute("submit", "Edit");
		model.addAttribute("food", food);
		return "foodManagement";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	String updateFood(Model model, @Valid @ModelAttribute("food") Food food,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("foods", foodServiceImpl.getAllFoods());
			model.addAttribute("food", new Food());
			model.addAttribute("action", "add");
			model.addAttribute("submit", "Add");
			return "foodManagement";
		}
		foodServiceImpl.saveFood(food);
		return "redirect:/food/add?message=Success";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	String deleteFood(Model model, @PathVariable("id") String id) {
		boolean a = foodServiceImpl.deleteFood(id);
		if (a) {
			return "redirect:/food/add?message=Fail";
		}
		return "redirect:/food/add?message=Success";
	}
}
