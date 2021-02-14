package com.example.ss2.config;

import com.example.ss2.domain.Customer;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CustomerSecurity implements UserDetails {

    private Customer customer;

    public CustomerSecurity(Customer customer){
        this.customer=customer;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        List<GrantedAuthority> listAuthorities = new ArrayList<GrantedAuthority>();
        GrantedAuthority authority= ()->"READ";
        listAuthorities.add(authority);
        return  listAuthorities;
    }

    @Override
    public String getPassword() {
        return customer.getPassword();
    }

    @Override
    public String getUsername() {
        return customer.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
