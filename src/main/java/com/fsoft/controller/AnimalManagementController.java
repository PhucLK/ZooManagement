package com.fsoft.controller;

import java.util.List;
import java.util.stream.Collectors;

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

import com.fsoft.model.Animal;
import com.fsoft.model.AnimalType;
import com.fsoft.model.Employee;
import com.fsoft.service.AnimalService;
import com.fsoft.service.AnimalTypeService;
import com.fsoft.service.EmployeeService;

@Controller
@RequestMapping("/animal")
public class AnimalManagementController {

	@Autowired
	AnimalTypeService animalTypeService;

	@Autowired
	EmployeeService employeeService;

	@Autowired
	AnimalService animalService;

	@RequestMapping(value = {"/","/add"}, method = RequestMethod.GET)
	String addAnimal(Model model,@RequestParam(value = "message", required = false)String message) {
		//get all name of animalType from database
		List<String> animalType = animalTypeService.getAllAnimalTypes().stream().map(AnimalType::getAnimalTypeName)
				.collect(Collectors.toList());
		//get id Employee from database
		List<String> employeeId = employeeService.getAllEmployees().stream().map(Employee::getEmployee_id)
				.collect(Collectors.toList());
		
		model.addAttribute("animal", new Animal());
		model.addAttribute("animalTypes", animalType);
		model.addAttribute("employee_ids", employeeId);
		model.addAttribute("animals", animalService.getAllAnimals());
		model.addAttribute("message", message);
		model.addAttribute("action", "add");
		model.addAttribute("submit", "Add");
		return "animalManagement";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	String saveAnimal( Model model,@Valid @ModelAttribute("animal") Animal animal,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "redirect:/animal/add?message=Fail";
		}
		Animal animal2 = animalService.saveAnimal(animal);
		//check if animal_id > 0 -> save success
		if (animal2.getAnimal_id()!=null) {
			return "redirect:/animal/add?message=Success";
		}
		return "redirect:/animal/add?message=Fail";

	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	String editAnimal(Model model, @PathVariable("id") String id) {
		//find animal by id from database
		Animal animal = animalService.findAnimalById(id);
		//get all name of animalType from database
		List<String> animalType = animalTypeService.getAllAnimalTypes().stream().map(AnimalType::getAnimalTypeName)
				.collect(Collectors.toList());
		List<String> employeeId = employeeService.getAllEmployees().stream().map(Employee::getEmployee_id)
				.collect(Collectors.toList());
		
		model.addAttribute("animal", animal);
		model.addAttribute("animalTypes", animalType);
		model.addAttribute("employee_ids", employeeId);
		model.addAttribute("animals", animalService.getAllAnimals());
		model.addAttribute("action", "edit");
		model.addAttribute("submit", "Edit");
		return "animalManagement";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	String editAnimal(Model model,@Valid @ModelAttribute("animal") Animal animal,BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "redirect:/animal/add?message=Fail";
		}
		//check if animal_id > 0 -> edit success
		Animal animal2 = animalService.saveAnimal(animal);
		if (animal2.getAnimal_id()!=null) {
			return "redirect:/animal/add?message=Success";
		}
		return "redirect:/animal/add?message=Fail";

	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	String deleteAnimal(@PathVariable("id") String id, Model model) {
		boolean a = animalService.deleteAnimal(id);
		// if a = true is delete fail
		if (a) {
			return "redirect:/animal/add?message=Fail";
		}
		return "redirect:/animal/add?message=Success";

	}
}
