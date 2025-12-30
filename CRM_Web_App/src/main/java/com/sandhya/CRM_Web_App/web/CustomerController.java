package com.sandhya.CRM_Web_App.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sandhya.CRM_Web_App.model.Customer;
import com.sandhya.CRM_Web_App.service.ICustomerService;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerService service;
	
	@GetMapping("/CustomerInfo")
	public String GetCustomerInfo(Model model) {
		List<Customer> cxList = service.getCustomerInfo();
		model.addAttribute("customerList", cxList);
		cxList.forEach(v->System.out.println(v));
		return "customerInfo";
	}
	@GetMapping("/getDetail")
	public String GetDetails(Model model) {
		model.addAttribute("customer",new Customer());
		return "detailForm";
	}
	
	@PostMapping("/regCx")
	public String RegCx(@ModelAttribute("cx")Customer customer,Model model) {
		service.registerCustomer(customer);
		return "redirect:/CustomerInfo";
	}
	@GetMapping("/updateCx")
	public String RegCx(@RequestParam("cxId") Integer id,Model model) {
		Customer cx=service.fetchById(id);
		model.addAttribute("customer", cx);
		return "updateInfo";
	}
	
	@PostMapping("/updateCx")
	public String updateCustomer(@ModelAttribute Customer customer) {
	    service.registerCustomer(customer); // save() updates when id exists
	    return "redirect:/CustomerInfo";
	}
	@GetMapping("/deleteCx")
	public String deleteCustomer(@RequestParam("cxId") Integer id) {
	    service.deleteById(id);
	    return "redirect:/CustomerInfo";
	}

	

}
