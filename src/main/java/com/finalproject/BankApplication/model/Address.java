package com.finalproject.BankApplication.model;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table
public class Address extends BaseEntity{

    private String country;
    private String city;
    private String postcode;
    private String street;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "address")
    private Set<Client> clients = new HashSet<>();
}
