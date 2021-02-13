package com.app.fullstack.codechallenge.backendservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String name;
    private String milesPerGallon;
    private String cylinders;
    private String displacement;
    private String horsePower;
    private String price;
    private String acceleration;
    private Boolean licensed;
    private String dateAdded;
    private String warehouse;


}
