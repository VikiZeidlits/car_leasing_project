package org.itstep.pd011.carleasing.services;

import org.itstep.pd011.carleasing.entities.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {

    List<Car> getAll();

    Optional<Car> getById(Integer id);

    void save(Car car);

    List<Car> findByBrandName(String brandName);
}
