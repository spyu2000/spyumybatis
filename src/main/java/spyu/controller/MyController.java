package spyu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import spyu.service.TestService;

@Controller
public class MyController {
	@Autowired
	private TestService service;
	@RequestMapping(value="*.do")
	public String test(){
		System.out.println("Controller----->");
        service.inserUser();
		return "result"; 
	}
}
