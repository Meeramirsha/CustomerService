package com.bankapp.customer_service.controller;

import com.bankapp.customer_service.request.CustomerRequest;
import com.bankapp.customer_service.response.CustomerResponse;
import com.bankapp.customer_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @PostMapping("/register")
    public CustomerResponse registerCustomer(@RequestBody CustomerRequest customerRequest){
      return customerService.registerCustomer(customerRequest);
    }
    @GetMapping("getbyid/{id}")
    public CustomerResponse getById(@PathVariable Long id){
        return customerService.getById(id);
    }
}
