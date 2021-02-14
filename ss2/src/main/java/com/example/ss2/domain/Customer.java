package com.example.ss2.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table(name = "User")
public class Customer {
    @Id
    private Integer id;
    private String username;
    private String password;
}
