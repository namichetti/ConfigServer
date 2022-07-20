package com.microservice.service;

import com.microservice.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> getAll();
    Customer findById(Long id) throws Exception;
    void deleteById(Long id) throws Exception;
    void saveCustomer(Customer customer);

}
