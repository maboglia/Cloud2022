package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Prodotto;
import com.boglia.repos.ProdottoDAO;

@Service
public class ProdottiServiceImpl implements ProdottiService {

	@Autowired
	private ProdottoDAO repo;
	
	
	@Override
	public void addProdotto(Prodotto p) {
		repo.save(p);
	}

	@Override
	public List<Prodotto> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Prodotto getProdotto(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void updateProdotto(Prodotto p) {
		repo.save(p);

	}

	@Override
	public void deleteProdotto(int id) {
		repo.deleteById(id);

	}

}
