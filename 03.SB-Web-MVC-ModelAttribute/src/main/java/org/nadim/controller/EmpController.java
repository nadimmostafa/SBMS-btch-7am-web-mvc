package org.nadim.controller;

import org.nadim.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmpController {

	//To display form UI
	//@GetMapping("/view")
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public String viewForm() {
		return "empRegister";
	}
	
	//To read form data from UI
	@RequestMapping(value="/data",method=RequestMethod.POST)
	public String readData(@ModelAttribute Employee emp, Model model) {
		model.addAttribute("emp",emp);
		return "viewEmp";
	}
}
