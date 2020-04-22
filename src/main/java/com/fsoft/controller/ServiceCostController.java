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

import com.fsoft.model.ServiceCost;
import com.fsoft.service.ServiceCostService;

@Controller
@RequestMapping("/servicecost")
public class ServiceCostController {

	@Autowired
	ServiceCostService serviceCostService;
	
	@RequestMapping(value = { "/", "/add" }, method = RequestMethod.GET)
	String addFood(@RequestParam(value = "message", required = false) String message, Model model) {
		model.addAttribute("serviceCosts", serviceCostService.getAllServiceCosts());
		model.addAttribute("serviceCost", new ServiceCost());
		model.addAttribute("action", "add");
		model.addAttribute("submit", "Add");
		model.addAttribute("message", message);
		return "serviceCostManagement";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	String saveFood(Model model, @Valid @ModelAttribute("food") ServiceCost serviceCost,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("serviceCosts", serviceCostService.getAllServiceCosts());
			model.addAttribute("serviceCost", new ServiceCost());
			model.addAttribute("action", "add");
			model.addAttribute("submit", "Add");
			return "serviceCostManagement";
		}
		serviceCostService.saveServiceCost(serviceCost);
		return "redirect:/servicecost/add?message=Success";
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	String editFood(Model model, @PathVariable("id") int id) {
		ServiceCost serviceCost = serviceCostService.getServiceCost(id);
		model.addAttribute("serviceCosts", serviceCostService.getAllServiceCosts());
		model.addAttribute("action", "edit");
		model.addAttribute("submit", "Edit");
		model.addAttribute("serviceCost", serviceCost);
		return "foodManagement";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	String updateFood(Model model, @Valid @ModelAttribute("food") ServiceCost serviceCost,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("serviceCosts", serviceCostService.getAllServiceCosts());
			model.addAttribute("serviceCost", new ServiceCost());
			model.addAttribute("action", "add");
			model.addAttribute("submit", "Add");
			return "serviceCostManagement";
		}
		serviceCostService.saveServiceCost(serviceCost);
		return "redirect:/servicecost/add?message=Success";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	String deleteFood(Model model, @PathVariable("id") int id) {
		boolean a = serviceCostService.deleteServiceCost(id);
		if (a) {
			return "redirect:/servicecost/add?message=Fail";
		}
		return "redirect:/servicecost/add?message=Success";
	}
}
