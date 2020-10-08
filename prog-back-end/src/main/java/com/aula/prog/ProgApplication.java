package com.aula.prog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aula.prog.services.ClienteService;

@SpringBootApplication
public class ProgApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgApplication.class, args);
		
		ClienteService clienteS = new ClienteService();
	}

}
