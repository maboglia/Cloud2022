package com.boglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boglia.services.ProdottiService;

@Controller
public class ProdottiMVC {

	@Autowired
	private ProdottiService service;
	
	@GetMapping
	public String getAll(Model m) {
		m.addAttribute("prodotti", service.getAll());
		return "elenco";
	}
	
}
