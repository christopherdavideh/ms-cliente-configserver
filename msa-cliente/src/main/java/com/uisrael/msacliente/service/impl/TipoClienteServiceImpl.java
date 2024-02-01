package com.uisrael.msacliente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.msacliente.model.TipoCliente;
import com.uisrael.msacliente.repository.ITipoClienteRepository;
import com.uisrael.msacliente.service.ITipoClienteService;

@Service
public class TipoClienteServiceImpl implements ITipoClienteService{
	
	@Autowired
	private ITipoClienteRepository repo;

	@Override
	public void guardarTipoCliente(TipoCliente nuevoTipo) {
		repo.save(nuevoTipo);
		
	}

	@Override
	public List<TipoCliente> listarTipoCliente() {
		return repo.findAll();
	}

}
