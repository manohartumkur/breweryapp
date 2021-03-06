package com.fin.breweryapp.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

	@GetMapping({ "/", "", "/index" })
	public ModelAndView welcome() {

		return new ModelAndView("index.html");
	}

	@GetMapping({ "/index1" })
	public String index() {

		return "index1.html";
	}
}
