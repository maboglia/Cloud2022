package com.boglia.canzoni.services;

import java.util.List;

import com.boglia.canzoni.entities.Canzone;

public interface CanzoneService {

	//CUD
	Canzone addCanzone(Canzone c);
	Canzone updateCanzone(Canzone c);
	void deleteCanzoneById(int id);
	
	//READ/RETRIEVE
	Canzone getCanzoneById(int id);
	List<Canzone> getCanzoni();
	List<Canzone> getCanzoniByGenere(String genere);
	List<Canzone> getCanzoniByCantante(String cantante);
	
}
