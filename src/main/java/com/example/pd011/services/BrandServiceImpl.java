package org.itstep.pd011.carleasing.services;

import org.itstep.pd011.carleasing.entities.Brand;
import org.itstep.pd011.carleasing.repositories.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public Optional<Brand> getById(Integer id) {
        return brandRepository.findById(Long.valueOf(id));
    }

    @Override
    public void save(Brand brand) {
        if(brand == null)
            return;

        brandRepository.saveAndFlush(brand);
    }
}
