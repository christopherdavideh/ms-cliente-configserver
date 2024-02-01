package com.uisrael.msacliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.msacliente.model.TipoCliente;
import com.uisrael.msacliente.service.ITipoClienteService;

@RestController
@RequestMapping("/api/tipo")
public class TipoClienteController {
	
	@Autowired
	private ITipoClienteService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void guardarTipoCliente(@RequestBody TipoCliente nuevoTipo) {
		service.guardarTipoCliente(nuevoTipo);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<TipoCliente> listarTipoCliente(){
		return service.listarTipoCliente();
	}

}
