package org.itstep.pd011.carleasing.services;

import org.itstep.pd011.carleasing.entities.Model;
import org.itstep.pd011.carleasing.repositories.ModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelServiceImpl implements ModelService{

    @Autowired
    private ModelRepository modelRepository;

    @Override
    public List<Model> getAll() {
        return modelRepository.findAll();
    }

    @Override
    public Optional<Model> getById(Integer id) {
        return modelRepository.findById(Long.valueOf(id));
    }

    @Override
    public void save(Model model) {
        if(model == null)
            return;

        modelRepository.saveAndFlush(model);
    }
}
