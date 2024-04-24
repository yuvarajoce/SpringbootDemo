package com.example.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@RequestMapping("/hello")
	public List<String> sayHello() {
		System.out.println("Hello...");
		ArrayList<String> al = new ArrayList<String>();
		al.add("Yuvi");
		al.add("Raj");
		al.add("Java");
		al.add("Delphi");
		return al;
	}
	
	@RequestMapping("/showdata")
	public Map<String, String> sayWelcome() {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Name", "Raj");
		hm.put("Mobile", "7200503209");
		System.out.println("Welcome...");
		return hm;
	}
}
