package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	 
//	Model, ModelMap and ModelAndView to define a model in spring mvc
//	Model --> used to add attribute to the model
//	ModelMap --> defines a holder for model attributes and is primarily designed for
//	adding attributed 
//	ModelAndView --> holder for model and a view
	
	@RequestMapping("/hello")
	public String welcome(ModelMap model) {
		model.addAttribute("message", "hello and welcome to the project"); //name and value
		return "hello";
	}
}
