package org.itstep.pd011.carleasing.services;

import org.itstep.pd011.carleasing.entities.Car;
import org.itstep.pd011.carleasing.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @Override
    public Optional<Car> getById(Integer id) {
        return carRepository.findById(Long.valueOf(id));
    }

    @Override
    public void save(Car car) {
        if(car == null)
            return;

        carRepository.saveAndFlush(car);
    }

    @Override
    public List<Car> findByBrandName(String brandName) {
        return carRepository.findCarsByModelBrandBrandNameContains(brandName);
    }
}
