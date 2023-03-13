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
		return "Orientação ao Fututo";
	}
	
}

