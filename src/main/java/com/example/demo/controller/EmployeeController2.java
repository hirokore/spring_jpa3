//package com.example.demo.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.example.demo.model.Employee;
//import com.example.demo.repository.DepartmentRepository;
//import com.example.demo.repository.EmployeeRepository;
//
//@Controller
//public class EmployeeController {
//
//	private final EmployeeRepository repository;
//	private final DepartmentRepository repository2;
//
//	@Autowired 
//	public EmployeeController(EmployeeRepository repository, DepartmentRepository repository2) {
//		this.repository = repository;
//		this.repository2 = repository2;
//	}
//	
//	@GetMapping("/")
//	public String showList(Model model) {
//		model.addAttribute("employees", repository.findAll());
//		return "index";
//	}
//	
//	@GetMapping("/add")
//	public String addEmployee(@ModelAttribute Employee employee, Model model) {
//		model.addAttribute("departments", repository2.findAll());
//		
//		return "form";
//	}
//	
//	@PostMapping("/process")
//	public String process(@ModelAttribute @Validated Employee employee, BindingResult result) {
//		if (result.hasErrors()) {
//			return "form";
//		}
//		repository.save(employee);
//		return "redirect:/";
//	}
//	
//	@GetMapping("/edit/{id}")
//	public String editEmployee(@PathVariable @ModelAttribute Long id, Model model) {
//		model.addAttribute("departments", repository2.findAll());
//		model.addAttribute("employee", repository.findById(id));
//		repository.findById(id);
//		return "form";
//	}
//	
//	@GetMapping("/delete/{id}")
//	public String deleteEmployee(@PathVariable @ModelAttribute Long id, Employee employee) {
//		repository.deleteById(id);
//		return "redirect:/";
//	}
//	
//	//EOF
//}
