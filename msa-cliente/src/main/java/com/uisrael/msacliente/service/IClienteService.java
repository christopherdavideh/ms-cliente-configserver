package com.uisrael.msacliente.service;

import java.util.List;

import com.uisrael.msacliente.model.Cliente;

public interface IClienteService {
	
	public void guardarCliente(Cliente nuevoCliente);
	
	public List<Cliente> listarClientes();

}
