package com.app.fullstack.codechallenge.backendservice.model;

import io.swagger.annotations.ApiModelProperty;
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
    @ApiModelProperty(notes="name should cannot be empty")
    private String name;
    @ApiModelProperty(notes="milesPerGallon should cannot be empty")
    private Long milesPerGallon;
    private Long cylinders;
    private Long displacement;
    private Long horsePower;
    @ApiModelProperty(notes="price should cannot be empty")
    private Long price;
    private Long acceleration;
    private Boolean licensed;
    @ApiModelProperty(notes="dateAdded should cannot be empty")
    private String dateAdded;
    private String warehouse;


}
