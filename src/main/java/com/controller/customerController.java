package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class customerController {

	@GetMapping("/get")
    public String getCustomerById() {
        return "Hello Customer";
    }
}
