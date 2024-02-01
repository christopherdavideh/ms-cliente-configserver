package com.uisrael.msacliente.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "cliente")
@Getter
@Setter
@NoArgsConstructor
public class Cliente {
	@Id
	private String idCliente;
	private String nombre;
	private String apellido;
	private String direccion;
	private String ci;
	private Date fechaNacimiento;
	private boolean estado;
	@DBRef
	private TipoCliente tipoCliente;
}
