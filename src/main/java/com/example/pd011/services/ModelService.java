package org.itstep.pd011.carleasing.services;

import org.itstep.pd011.carleasing.entities.Model;

import java.util.List;
import java.util.Optional;

public interface ModelService {

    List<Model> getAll();

    Optional<Model> getById(Integer id);

    void save(Model model);
}
