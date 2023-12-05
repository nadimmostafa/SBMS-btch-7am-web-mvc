package org.nadim.controller;

import java.util.List;

import org.nadim.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {
	
	// To display welcome message
	@GetMapping("/message")
	@RequestMapping(value="/message",method=RequestMethod.GET)
	public String showMsg(Model model) {
		String msg = "Welcome To Home Page";
		model.addAttribute("message",msg);
		return "welcome";
	}
	
	//send object to UI page
	@RequestMapping(value="/send",method=RequestMethod.GET)
	public String sendObj(Model model) {
		Employee employee = new Employee(101,"Nadim","nadim26@gmail.com");
		model.addAttribute("emp",employee);
		return "welcome";
	}
	
	//send list of objects to UI page
	@GetMapping("/list")
	public String listObj(Model model) {
		List<Employee> list = List.of(
				new Employee(101,"Nadim","nadim26@gmail.com"),
				new Employee(102,"Asif","asif56@gmail.com"),
				new Employee(103,"Hadim","Hamid@gmail.com"),
				new Employee(104,"Imran","imran34@gmail.com")
				);
		
		model.addAttribute("list",list);
		return "productList";
	}
}
