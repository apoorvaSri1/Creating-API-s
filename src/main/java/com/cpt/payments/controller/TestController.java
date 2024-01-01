package com.cpt.payments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/c1")
public class TestController {

	@RequestMapping(value = "/method1", method = RequestMethod.GET)
	public String method1(Model model) {
		System.out.println("Invoking method method1");
		
		model.addAttribute("batchnumber", "NovCT Batch");
		
		return "view";
	}
}
