package com.uisrael.msacliente.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "tipo")
@Getter
@Setter
@NoArgsConstructor
public class TipoCliente {
	@Id
	private String tipoId; 
	private String tipoNombre;
	private boolean tipoEstado; 
}
