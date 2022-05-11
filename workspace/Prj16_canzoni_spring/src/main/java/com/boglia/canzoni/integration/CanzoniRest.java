package com.boglia.canzoni.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boglia.canzoni.entities.Canzone;
import com.boglia.canzoni.services.CanzoneService;

@RestController
@RequestMapping("api")
public class CanzoniRest {

	@Autowired
	private CanzoneService service;
	
	
	@GetMapping("canzoni")
	public List<Canzone> getCanzoni(){
		return this.service.getCanzoni();
	}
	
	@GetMapping("canzoni/{id}")
	public Canzone getCanzone(@PathVariable int id){
		return this.service.getCanzoneById(id);
	}

	@GetMapping("canzoni/genere/{genere}")
	public List<Canzone> getByGenere(@PathVariable String genere){
		return this.service.getCanzoniByGenere(genere);
	}

	@GetMapping("canzoni/cantanti/{cantante}")
	public List<Canzone> getByCantante(@PathVariable("cantante") String cantante){
		System.out.println(cantante);
		return this.service.getCanzoniByCantante(cantante);
	}


}
