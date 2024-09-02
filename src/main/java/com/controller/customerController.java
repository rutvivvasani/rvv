package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Customer;
import com.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class customerController {

	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/getAll")
    public List<Customer>  getCustomer() {
        return customerService.findAllCustomers();
    }
	
	@PostMapping("/add")
    public String createCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return "Customer added successful";
    }
}
