package org.nadim.controler;

import java.util.List;

import org.nadim.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@RequestMapping(value="/show",method=RequestMethod.GET)
	public String showProduct(Model model) {
		List<Product> list = List.of(
				new Product(101,"Laptop",125000.00,true),
				new Product(102,"Mobile",12000.00,true),
				new Product(103,"TV",12500.00,false),
				new Product(104,"Camera",15000.00,true),
				new Product(105,"Sound Box",1000.00,true)
				);
		model.addAttribute("list",list);
		return "productPage";
	}
}
