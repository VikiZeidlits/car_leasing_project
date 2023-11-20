package org.itstep.pd011.carleasing.services;

import org.itstep.pd011.carleasing.entities.Client;
import org.itstep.pd011.carleasing.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private ClientRepository clientRepository;

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getById(Integer id) {
        return clientRepository.findById(Long.valueOf(id));
    }

    @Override
    public void save(Client client) {
        if(client == null)
            return;

        clientRepository.saveAndFlush(client);
    }
}
