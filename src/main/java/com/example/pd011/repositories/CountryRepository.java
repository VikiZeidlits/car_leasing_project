package org.itstep.pd011.carleasing.repositories;

import org.itstep.pd011.carleasing.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
}
