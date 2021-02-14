package com.example.ss2.repo;

import com.example.ss2.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    public Customer findCustomerByUsername(String username);
}
