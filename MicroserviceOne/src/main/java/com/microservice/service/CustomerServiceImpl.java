package com.microservice.service;

import com.microservice.model.Customer;
import com.microservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) throws Exception {
        var customer = customerRepository.findById(id);
        if(customer.isPresent()){
            return customer.get();
        }else{
            throw new Exception("Customer doesn't exist!");
        }
    }

    @Override
    @Transactional
    public void deleteById(Long id) throws Exception {
        var customer = this.customerRepository.findById(id);
        this.customerRepository.deleteById(customer.get().getId());
    }

    @Override
    @Transactional
    public void saveCustomer(Customer customer) {
        this.customerRepository.save(customer);
    }
}
