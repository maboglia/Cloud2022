package com.boglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.entities.Alimento;
import com.boglia.services.AlimentoService;

@RestController
@RequestMapping("api")
public class AlimentiREST {

	@Autowired
	private AlimentoService service;
	
	@GetMapping
	public List<Alimento> getAll(){
		return service.getAlimenti();
	}
	
	
}
