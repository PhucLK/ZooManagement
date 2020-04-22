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

import com.fsoft.model.Employee;
import com.fsoft.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	private final String[] positions = { "Security", "SaleMan", "Staff" };

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = { "/", "/add" }, method = RequestMethod.GET)
	String addEmployee(@RequestParam(value = "message", required = false) String message, Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		model.addAttribute("positions", positions);
		model.addAttribute("employee", new Employee());
		model.addAttribute("action", "add");
		model.addAttribute("submit", "Add");
		model.addAttribute("message", message);
		return "employeeManagement";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	String saveEmployee(Model model, @Valid @ModelAttribute("employee") Employee employee,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("employees", employeeService.getAllEmployees());
			model.addAttribute("positions", positions);
			model.addAttribute("employee", new Employee());
			model.addAttribute("action", "add");
			model.addAttribute("submit", "Add");
			return "employeeManagement";
		}
		System.out.println("...................................");
		System.out.println(employee.getSex());
		employeeService.saveEmployee(employee);
		return "redirect:/employee/add?message=Success";
	}

	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	String editEmployee(Model model, @PathVariable("id") String id) {
		Employee employee = employeeService.getEmployee(id);
		System.out.println(employee);
		model.addAttribute("employees", employeeService.getAllEmployees());
		model.addAttribute("positions", positions);
		model.addAttribute("action", "edit");
		model.addAttribute("submit", "Edit");
		model.addAttribute("employee", employee);
		return "employeeManagement";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	String updateEmployee(Model model, @Valid @ModelAttribute("employee") Employee employee,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			model.addAttribute("employees", employeeService.getAllEmployees());
			model.addAttribute("positions", positions);
			model.addAttribute("employee", new Employee());
			model.addAttribute("action", "add");
			model.addAttribute("submit", "Add");
			return "employeeManagement";
		}
		employeeService.saveEmployee(employee);
		return "redirect:/employee/add?message=Success";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	String deleteEmployee(Model model, @PathVariable("id") String id) {
		boolean a = employeeService.deleteEmpoyee(id);
		if (a) {
			return "redirect:/employee/add?message=Fail";
		}
		return "redirect:/employee/add?message=Success";
	}
}
