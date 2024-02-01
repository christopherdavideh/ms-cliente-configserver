package com.uisrael.msacliente.service;

import java.util.List;

import com.uisrael.msacliente.model.TipoCliente;

public interface ITipoClienteService {
	
	public void guardarTipoCliente(TipoCliente nuevoTipo);
	
	public List<TipoCliente> listarTipoCliente();

}
