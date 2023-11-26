package org.nadim.controller;

import org.nadim.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/msg")
	public String msg(Model model) {
		User user = new User("Nadim","Male");
		model.addAttribute("user",user);
		return "index";
	}
}
