package com.jt.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JTController {
	
//	Method for Enquiry Page
	@RequestMapping(value= {"/","/enquiry"})
	public String showEnquiryPage() 
	{
		System.err.println("Welcome to Enquiry Page");
		return "Enquiry";
	}

}
