package com.helloword.ex2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("objetivos")
@RestController
public class HelloController {

	@GetMapping
	public String objetivos() {
		return "Meus objetivos de aprendizado para a semana: "
				+ "Dominar o spring boot e conseguir gerenciar um projeto dentro do mesmo";
	}
	
}
