package com.bankapp.customer_service.request;


import com.bankapp.customer_service.entity.Customer;

public class CustomerRequest {

    private String name;

    private String email;

    private String address;

    private String password;

    public CustomerRequest() {}

    public CustomerRequest(Customer customer) {

        this.name = customer.getName();
        this.email = customer.getEmail();
        this.address = customer.getAddress();
        this.password = customer.getPassword();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email address");
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}