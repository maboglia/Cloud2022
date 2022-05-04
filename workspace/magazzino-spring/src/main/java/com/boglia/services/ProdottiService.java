package com.boglia.services;

import java.util.List;

import com.boglia.entities.Prodotto;

public interface ProdottiService {

	//crud
	
	void addProdotto(Prodotto p);
	
	List<Prodotto> getAll();
	Prodotto getProdotto(int id);
	
	void updateProdotto(Prodotto p);
	
	void deleteProdotto(int id);
	
}
