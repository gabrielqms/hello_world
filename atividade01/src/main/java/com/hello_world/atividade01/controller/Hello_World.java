package com.hello_world.atividade01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello_world")
public class Hello_World {

	@GetMapping("/HelloWorld")
	public String HelloWorld() {
		return "Hello World!";
	}

	@GetMapping("/BSM")
	public String BSM() {
		return "Responsabilidade Pessoal, \r\n" + "Mentalidade de Crescimento, \r\n" + "Orientação ao futuro, \r\n"
				+ "Persistência, \r\n" + "Comunicação, \r\n" + "Atenção aos detalhes, \r\n" + "Trabalho em equipe, \r\n"
				+ "Proatividade";
	}

	@GetMapping("/Objetivos")
	public String Objetivos() {
		return "Entender melhor o banco de dados e o spring boot";
	}
}
