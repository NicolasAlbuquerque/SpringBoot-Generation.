package org.generation.olamundo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// indica mque é a classe controladorau
@RestController

//indica um endpoint pata a aplicação
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String olamundo() {
		return "Hello World";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "<br>BSM</br>"+"<br>- Persistência</br>"+
				"<br>- Mentalidade de Crescimento</br>"+
				"<br>- Orientação ao Futuro</br>"+
				"<br>- Responsabilidade Pessoal</br>"+
				"<br>- Trabalho em Equipe</br>"+
				"<br>- Comunicação</br>"+
				"<br>- Comunicação Não Violenta</br>"+
				"<br>- Atenção para Detalhes</br>"+
				"<br>- Proatividade</br>";
	}

	@GetMapping("/objetivo")
	public String objetivo() {
		return "<br>OBJETIVOS</br>"+"<br>- Focar no Projeto Integrador</br>"+
				"<br>- Orghanização<br>"+
				"<br>- Gestão de tempo</br>"+
				"<br>- Revisão</br>"+
				"<br>- Trabalho em equipe</br>";
	}
	
}

