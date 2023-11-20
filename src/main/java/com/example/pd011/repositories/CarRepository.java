package org.itstep.pd011.carleasing.repositories;

import org.itstep.pd011.carleasing.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

    // все модели заданного бренда
    List<Car> findCarsByModelBrandBrandNameContains(String brandName);
}
