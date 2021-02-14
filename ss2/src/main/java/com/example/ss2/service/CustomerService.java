package com.example.ss2.service;

import com.example.ss2.domain.Customer;
import com.example.ss2.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository repository;

    public Customer getCustomer(String username){

        return repository.findCustomerByUsername(username);

    }
}
