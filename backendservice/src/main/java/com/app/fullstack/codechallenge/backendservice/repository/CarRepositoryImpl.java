package com.app.fullstack.codechallenge.backendservice.repository;

import com.app.fullstack.codechallenge.backendservice.model.Car;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class CarRepositoryImpl {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insertWithQuery(Car car) {
        entityManager.createNativeQuery("INSERT INTO Car VALUES (?,?,?,?,?,?,?,?,?,?)")
                .setParameter(1, car.getName())
                .setParameter(2, car.getMilesPerGallon())
                .setParameter(3, car.getCylinders())
                .setParameter(1, car.getDisplacement())
                .setParameter(2, car.getHorsePower())
                .setParameter(3, car.getPrice())
                .setParameter(1, car.getAcceleration())
                .setParameter(2, car.getLicensed())
                .setParameter(3, car.getDateAdded())
                .setParameter(1, car.getWarehouse())
                .executeUpdate();
    }

}
