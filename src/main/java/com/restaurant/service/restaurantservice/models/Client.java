package com.restaurant.service.restaurantservice.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="TBL_CLIENTS")
@Getter
@Setter
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "NAME", nullable = false)    
    private String name;

    @Column(name = "PHONE")  
    private String phone;

    @Column(name = "MAIL")    
    private String mail;
    
    @Column(name = "PASSWORD",nullable = false)    
    private String password;

    @OneToMany(mappedBy="client")  
    private List<Reservation> reservations;

}