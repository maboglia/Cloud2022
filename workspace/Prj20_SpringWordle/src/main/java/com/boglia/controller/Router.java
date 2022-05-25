package com.boglia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class Router {

	@GetMapping("word")
	public String getWord() {
		return "prova";
	}

	@GetMapping("add")
	public String addWord() {
		return "form";
	}
	
	@PostMapping("add")
	public String aggiungi(@RequestParam("parolaIndovinata") String parola) {
		
		System.out.println(parola);
		if (!parola.isEmpty())
			return parola;
		
		
		return "form";
	}
	
	
}
