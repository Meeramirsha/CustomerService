package com.bankapp.customer_service.service;

import com.bankapp.customer_service.request.CustomerRequest;
import com.bankapp.customer_service.response.CustomerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CustomerService {
    Logger logger= LoggerFactory.getLogger(CustomerService.class);
    public abstract CustomerResponse registerCustomer(CustomerRequest customerRequest);
    public abstract CustomerResponse getById(Long customerId);

}
