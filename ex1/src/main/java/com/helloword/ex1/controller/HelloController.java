package com.helloword.ex1.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mentalidades")
public class HelloController {
	
	@GetMapping 
	public String mentalidades() {
		return	"Mentalidades usadas: "
				+"1° Orientação ao futuro, "
				+"2º Responsabilidade pessoal, "
				+"3° mentalidade de crescimento, "
				+"4° Persistência, ";
				 	
	}
	
}
