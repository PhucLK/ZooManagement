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

import com.fsoft.model.AnimalType;
import com.fsoft.service.AnimalTypeService;

@Controller
@RequestMapping("/animaltype")
public class AnimalTypeManagementController {

	@Autowired
	AnimalTypeService animalTypeService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	String addAnimalType(Model model, @RequestParam(value = "message", required = false) String message) {
		System.out.println("animaltype addd Get");
		model.addAttribute("animalType", new AnimalType());
		model.addAttribute("message", message);
		model.addAttribute("animalTypes", animalTypeService.getAllAnimalTypes());
		model.addAttribute("submit", "Add");
		model.addAttribute("action", "add");

		return "animalTypeManagement";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	String saveAnimalType(Model model, @Valid @ModelAttribute("animalType") AnimalType animalType,BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			model.addAttribute("animalType", new AnimalType());
			model.addAttribute("animalTypes", animalTypeService.getAllAnimalTypes());
			model.addAttribute("submit", "Add");
			model.addAttribute("action", "add");

			return "animalTypeManagement";
		}
		AnimalType animalType2 = animalTypeService.saveAnimalType(animalType);
		if (animalType2!=null) {
			return "redirect:/animaltype/add?message=Success";
		}
		return "redirect:/animaltype/add?message=Fail";
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	String editAnimalType(@PathVariable("id") String id, Model model) {
		AnimalType animalType = animalTypeService.getAnimalType(id);
		model.addAttribute("animalType", animalType);
		model.addAttribute("submit", "Edit");
		model.addAttribute("action", "edit");
		return "animalTypeManagement";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	String updateAnimalType(@Valid @ModelAttribute("animalType") AnimalType animalType,BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("animalType", animalType);
			model.addAttribute("submit", "Edit");
			model.addAttribute("action", "edit");
			return "animalTypeManagement";
		}
		AnimalType animalType2 = animalTypeService.saveAnimalType(animalType);
		if (animalType2.getAnimalTypeId()!=null) {
			return "redirect:/animaltype/add?message=Success";
		}
		return "redirect:/animaltype/add?message=Fail";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	String deleteAnimalType(@PathVariable("id") String id, Model model) {
		boolean a = animalTypeService.deleteAnimalType(id);
		if (a) {
			return "redirect:/animaltype/add?message=Fail";
		}
		return "redirect:/animaltype/add?message=Success";
	}
	

}
