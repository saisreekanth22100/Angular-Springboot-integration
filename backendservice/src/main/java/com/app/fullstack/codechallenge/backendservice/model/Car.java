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
    private String name;
    private Long milesPerGallon;
    private Long cylinders;
    private Long displacement;
    private Long horsePower;
    private Long price;
    private Long acceleration;
    private Boolean licensed;
    private String dateAdded;
    private String warehouse;


}
