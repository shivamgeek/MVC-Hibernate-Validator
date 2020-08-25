package com.shivam;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/register")
	public String showForm(Model model) {
		Customer c = new Customer();
		model.addAttribute("customerData",c);
		return "customer-form";
	}
	
	@RequestMapping("processForm")
	public String validateCustomerForm(@Valid @ModelAttribute("customerData") Customer c, BindingResult result) {
		if(result.hasErrors() == true) {
			return "customer-form";
		}else {
			return "customer-success";
		}
	}
	
}
