package org.itstep.pd011.carleasing.services;

import org.itstep.pd011.carleasing.entities.Country;

import java.util.List;
import java.util.Optional;

public interface CountryService {

    List<Country> getAll();

    Optional<Country> getById(Integer id);

    void save(Country country);
}
