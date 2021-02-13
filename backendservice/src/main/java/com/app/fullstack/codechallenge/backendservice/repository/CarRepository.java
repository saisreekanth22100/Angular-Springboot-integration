package com.app.fullstack.codechallenge.backendservice.repository;

import com.app.fullstack.codechallenge.backendservice.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

public interface CarRepository extends JpaRepository<Car, Id> {
}
