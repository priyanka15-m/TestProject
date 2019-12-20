package com.jt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jt.demo.pojo.AdminPojo;
import com.jt.demo.pojo.EnquiryPojo;
import com.jt.demo.pojo.PlacementPojo;
import com.jt.demo.repository.AdminRepository;
import com.jt.demo.repository.PlacementRepository;
import com.jt.demo.repository.enquiryRepository;

@Controller
public class JTController {
	
	//JtianBookIssue jtBook
//	PlacementPojo placementBean;
	
	@Autowired
//	JTRepository jtRepo;
	enquiryRepository enquiryrepo;
	
	@Autowired
	AdminRepository adminRepo;
	
	@Autowired
	PlacementRepository placementRepo;
	
	@RequestMapping("/")
	public String showAdmin()
	{
		System.err.println("Welcome to Admin Registration Page");
		return "Admin";
	}
	@RequestMapping("/login")
	public String login()
	{
		return "Login";
	}
	
	@PostMapping("/login")
	public String loginData(@ModelAttribute AdminPojo ab)
	{
		AdminPojo ap = adminRepo.findByNameAndPassword(ab.getName(), ab.getPassword());
		if(ap!=null)
		{
		  return "Home";
		}
		else
		{
			return "Login";
		}
		
	}
	
	@PostMapping("/adminreg")
	public String addAdminData(@ModelAttribute AdminPojo ap)
	{
		AdminPojo aa = adminRepo.save(ap);
		System.err.println("Admin Name:"+aa.getName());
		if(aa!=null)
		{
			return "Home";
		}
		else
		{
			return "Admin";
		}
		
	}
	
	//Method for Home Page
	@RequestMapping("/home")
	public String showHomePage()
	{
		return "Home";
	}
	
	//Method for Enquiry Page
	@RequestMapping("/enquiry")
	public String showEnquiryPage() 
	{
		System.err.println("Welcome to Enquiry Page");
		return "Enquiry";
	}  
	@PostMapping("/addenquiry")
	public String addEnquiry(@ModelAttribute EnquiryPojo ep)
	{
		EnquiryPojo pp=enquiryrepo.save(ep);
		System.err.println("name is "+pp.getName());
		if(pp!=null)
		{
			System.err.println("Enquiry Success");
			return "Success";
		}else {
			System.err.println("Enquiry Failed");
			return "Home";
		}
		
		
	}
	@RequestMapping("/addenquiry")
	public String addEnquiry()
	{
		return "AddEnquiry";
	}
	
	@RequestMapping("/dltenquiry")
	public String deleteEnquiry()
	{
		return "DeleteEnquiry";
	}
	@RequestMapping("/search")
	public String searchData()
	{
		return "DeleteEnquiryRecord";
	}
	@PostMapping("/search")
	public String getData(@ModelAttribute EnquiryPojo ep)
	{
		EnquiryPojo ab = enquiryrepo.findByNameAndEmail(ep.getName(), ep.getEmail());
		if(ab!=null) {
			System.err.println("name:" + ep.getName());
			System.err.println("email:" + ep.getEmail());
		}else {
			System.out.println("No data found");
		}
			
		return "DeleteEnquiryRecord";
	}
//	@RequestMapping("/xyz")
//	public String viewData(Model m)
//	{
//		System.err.println("Delete Page");
//		List<EnquiryPojo>  l = (List<EnquiryPojo>) enquiryrepo.findAll();
//		m.addAttribute("obj",l);
//		return "DeleteEnquiryRecord";
//	}
//	@RequestMapping("/delete/{id}")
//	public String deleteData(@PathVariable int id)
//	{
//		
//	}
	
// method for Register Page	
	@RequestMapping(value={"/register"})
	public String showRegisterPage()
	{
		System.err.println("Welcome to Register Page");
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
		
//		@PostMapping(value= {"/Jt"})
//		public String showJtPage(@ModelAttribute JtianBookIssue jtb)
//		{
//			JtianBookIssue jtbi = jtRepo.findById(jtb.getStudent_id());
//			if(jtbi!=null)
//			{
//				System.err.println("StudentId: " + jtb.getStudent_id() + "BookId:" + jtb.getBook_id());
//			}
//			System.err.println("Welcome to JTian Page");
//			return "Jt";
//		}
		
		//method for Book Issue Page
		@RequestMapping(value= {"/Nonjt"})
		public String showNonJtPage()
		{
			System.err.println("Welcome to NonJtian Page");
			return "NonJt";
		}
		
		//Method for Income Page
		@RequestMapping(value="/income")
		public String showIncomePage()
		{
			System.err.println("I am in showIncome method");
			return "Income";
		}
		@RequestMapping(value= {"/details","/DetailIncome"})
        public String showDetailIncomePage()
        {
			System.err.println("I am in showDetailIncome method");
			return "DetailIncome";
        }
		@RequestMapping(value="/Graph")
		public String showGraph()
		{
			System.err.println("I am in showGraph");
			return "Graph";
		}
		
		@RequestMapping(value= "/placement")
		public String showPlacementPage()
		{
			System.err.println("I am in Placement Page");
			return "Placement";
		}
		
//		@PostMapping(value="/abc/{year_of_passing}")
//		public String addPlacement(@ModelAttribute PlacementPojo ab,@PathVariable int year_of_passing,Model m)
//		{
//			PlacementPojo pp = placementRepo.findByYear_of_passing(ab.getYear_of_passing());
//			System.out.println("Y.O.P is:" + pp.getYear_of_passing());
//			if(pp!=null)
//			{
//				return "PlacementDetails";
//			}
//			
//			return "Home";
//			
//		}
}      
