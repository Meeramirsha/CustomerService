package com.bankapp.customer_service.service;
import com.bankapp.customer_service.entity.Customer;
import com.bankapp.customer_service.repository.CustomerRepository;
import com.bankapp.customer_service.request.CustomerRequest;
import com.bankapp.customer_service.response.CustomerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CustomerServiceImpl extends CustomerService{
    Logger logger= LoggerFactory.getLogger(CustomerServiceImpl.class);
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public CustomerResponse registerCustomer(CustomerRequest customerRequest) {
        Customer customer=new Customer();
        customer.setName(customerRequest.getName());

        customer.setAddress(customerRequest.getAddress());
        customer.setPassword(customerRequest.getPassword());
        customer.setEmail(customerRequest.getEmail());
        return new CustomerResponse(customerRepository.save(customer));
    }

    @Override
    public CustomerResponse getById(Long customerId) {
        return new CustomerResponse(customerRepository.findById(customerId).get());
    }

}
