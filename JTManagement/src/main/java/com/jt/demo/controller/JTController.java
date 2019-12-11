package com.jt.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jt.demo.pojo.JtianBookIssue;
import com.jt.demo.repository.JTRepository;

@Controller
public class JTController {
	
	JtianBookIssue jtBook;
	
	@Autowired
	JTRepository jtRepo;
	
//	Method for Enquiry Page
	@RequestMapping(value= {"/","/enquiry"})
	public String showEnquiryPage() 
	{
		System.err.println("Welcome to Enquiry Page");
		return "Enquiry";
	}
	
// method for Register Page	
	@RequestMapping(value={"/register"})
	public String showRegisterPage()
	{
		System.err.println("Wecome to Register Page");
		return "Register";
	}
	
//method for Book Issue Page
	@RequestMapping(value= {"/book"})
	public String showBookIssuePage()
	{
		System.err.println("Welcome to Book Issue Page");
		return "Book";
	}
	
	//method for Book Issue Page
		@RequestMapping(value= {"/Jt"})
		public String showJtPage()
		{
			System.err.println("Welcome to JTian Page");
			return "Jt";
		}
		
		@PostMapping(value= {"/Jt"})
		public String showJtPage(@ModelAttribute JtianBookIssue jtb)
		{
//			JtianBookIssue jtbi = jtRepo.findById(jtb.getStudent_id());
//			if(jtbi!=null)
//			{
//				System.err.println("StudentId: " + jtb.getStudent_id() + "BookId:" + jtb.getBook_id());
//			}
			System.err.println("Welcome to JTian Page");
			return "Jt";
		}
		
		//method for Book Issue Page
		@RequestMapping(value= {"/Nonjt"})
		public String showNonJtPage()
		{
			System.err.println("Welcome to NonJtian Page");
			return "NonJt";
		}

}
