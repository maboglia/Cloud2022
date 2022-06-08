package com.catgenova.viaggi.service;

import java.util.List;

import com.catgenova.viaggi.entities.Viaggio;

public interface ViaggiService {

	List<Viaggio> getViaggi();
	Viaggio addViaggio(Viaggio v);
	
	
	
	
}
