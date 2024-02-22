package com.customer.web;

import java.util.Collection;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dao.CustomerDAO;
import com.customer.domain.Customer;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerDAO customersDAO;
	
	@GetMapping("/index.html")
	public String getIndex() {
		return "/index";
	}
	
	@GetMapping("/")
	public String getRoot() {
		return "redirect:/index.html";
	}	
	
	@PostMapping("/login")
	public ResponseEntity<Object> checkPersonInfo(@RequestBody Customer customer) {
		String name = customer.getCustomerName();
		String password = customer.getPassword();
		
		if ((name.compareTo("Jill") + password.compareTo("Kayak")) == 0) {
			
			return new ResponseEntity<Object>(customer,HttpStatus.OK);
		}
		return new ResponseEntity<Object>(customer,HttpStatus.NOT_FOUND);
	}
	
//	@RequestMapping("/browseCustomers")
//	public ModelAndView browseCustomers() {
//		Collection<Customer> list = customersDAO.getAllCustomers();
//		return new ModelAndView("browseCustomers", "customers", list);
//	}
//	
//	@PostMapping("/register")
//	public ResponseEntity<Customer> addNewCustomers(@RequestBody Customer customer) {
//		//need to turn webform into json
//		System.out.println(customer);
//		customersDAO.addCustomer(customer);
//	}

}