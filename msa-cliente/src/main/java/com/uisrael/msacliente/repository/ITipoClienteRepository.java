package com.uisrael.msacliente.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.msacliente.model.TipoCliente;

public interface ITipoClienteRepository extends MongoRepository<TipoCliente, String> {

}
