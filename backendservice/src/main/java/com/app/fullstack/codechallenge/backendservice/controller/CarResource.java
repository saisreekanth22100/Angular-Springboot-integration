package com.app.fullstack.codechallenge.backendservice.controller;

import com.app.fullstack.codechallenge.backendservice.model.Car;
import com.app.fullstack.codechallenge.backendservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/challenge")
public class CarResource {

    @Autowired
    private CarRepository carRepository;

    @GetMapping("/cars")
    public List<Car> getCarList(){

        return carRepository.findAll();
    }


    @GetMapping("/hello")
    public String sayHello(){

        return "Welcome to Code Challenge";
    }

}
