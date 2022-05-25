package com.fin.breweryapp.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

	@GetMapping({ "/", "", "/index" })
	public String welcome() {

		return "index";
	}
}
