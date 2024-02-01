package com.uisrael.msacliente.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
@RequestMapping("/api/cliente-git")
@Getter
@Setter
public class ClienteGitController {
	@Value("${app.testPropertie}")
	private String testProperties;
	
	@GetMapping("/test")
	public String leerTestProperties() {
		return this.testProperties;
	}
}
