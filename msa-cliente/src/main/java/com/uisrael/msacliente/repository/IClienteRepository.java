package com.uisrael.msacliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.msacliente.model.Cliente;

public interface IClienteRepository extends MongoRepository<Cliente, String> {

}
