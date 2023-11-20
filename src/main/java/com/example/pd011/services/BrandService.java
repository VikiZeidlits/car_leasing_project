package org.itstep.pd011.carleasing.services;

import org.itstep.pd011.carleasing.entities.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandService {

    List<Brand> getAll();

    Optional<Brand> getById(Integer id);

    void save(Brand brand);
}
