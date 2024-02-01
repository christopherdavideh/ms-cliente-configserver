package com.uisrael.msacliente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.msacliente.model.Cliente;
import com.uisrael.msacliente.repository.IClienteRepository;
import com.uisrael.msacliente.service.IClienteService;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private IClienteRepository repo;

	@Override
	public void guardarCliente(Cliente nuevoCliente) {
		repo.save(nuevoCliente);
		
	}

	@Override
	public List<Cliente> listarClientes() {
		return repo.findAll();
	}

}
