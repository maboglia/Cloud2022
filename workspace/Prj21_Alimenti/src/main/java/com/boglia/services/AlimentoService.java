package com.boglia.services;

import java.util.List;

import com.boglia.entities.Alimento;

public interface AlimentoService {

	List<Alimento> getAlimenti();	
	Alimento getAlimento(int id);
	
	void addAlimento(Alimento a);
	void updAlimento(Alimento a);
	void delAlimento(int id);

	
}
