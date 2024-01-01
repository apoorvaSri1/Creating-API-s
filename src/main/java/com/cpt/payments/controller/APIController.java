package com.cpt.payments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/c2")
public class APIController {

	@RequestMapping(value = "/method1", method = RequestMethod.GET)
	@ResponseBody
	public String method1() {
		System.out.println("Invoking method method1");
		
		String batchnumber = "NovCT Batch HELLO";
		
		return "1";
	}
	
	
	@GetMapping("/method2")
	@ResponseBody
	public int method2(int val1, int val2) {
		
		System.out.println("Invoking method method2|" + val1 + "|val2:" + val2);
		
		int res = val1 + val2;
		return res;
	}
	
	
	
	@PostMapping("/method3")
	@ResponseBody
	public int method3(int val1, int val2) {
		
		System.out.println("Invoking method method2|" + val1 + "|val2:" + val2);
		
		int res = val1 + val2;
		return res;
	}
	
	@PostMapping("/method4")
	@ResponseBody
	public int method4(int val1, int val2) {
		
		System.out.println("Invoking method method2|" + val1 + "|val2:" + val2);
		
		int res = val1 + val2;
		return res;
	}
	
	
	

}
