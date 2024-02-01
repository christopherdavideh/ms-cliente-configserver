package com.uisrael.msaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsaConfigserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsaConfigserverApplication.class, args);
	}

}
