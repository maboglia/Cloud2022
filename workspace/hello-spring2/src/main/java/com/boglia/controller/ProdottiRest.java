package com.boglia.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ProdottiRest {

	@GetMapping("tutti")
	public String getAll() {
		return "ciao";
	}
	
}
