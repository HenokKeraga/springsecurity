package com.example.ss2.config;

import com.example.ss2.domain.Customer;
import com.example.ss2.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class JdbcCustomUserService implements UserDetailsService {

    @Autowired
    CustomerService service;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Customer customer=service.getCustomer(username);

        CustomerSecurity customerSecurity= new CustomerSecurity(customer);

        return customerSecurity;
    }
}
