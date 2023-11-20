package org.itstep.pd011.carleasing.services;

import org.itstep.pd011.carleasing.entities.Country;
import org.itstep.pd011.carleasing.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService{


    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> getAll() {
        return countryRepository.findAll();
    }

    @Override
    public Optional<Country> getById(Integer id) {
        return countryRepository.findById(Long.valueOf(id));
    }

    @Override
    public void save(Country country) {
        if(country == null)
            return;

        countryRepository.saveAndFlush(country);
    }
}
