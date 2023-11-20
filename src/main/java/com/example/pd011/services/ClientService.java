package org.itstep.pd011.carleasing.services;

import org.itstep.pd011.carleasing.entities.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    List<Client> getAll();

    Optional<Client> getById(Integer id);

    void save(Client client);
}
