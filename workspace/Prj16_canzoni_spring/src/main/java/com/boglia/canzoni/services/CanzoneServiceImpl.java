package com.boglia.canzoni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.canzoni.entities.Canzone;
import com.boglia.canzoni.repos.CanzoneDAO;

@Service
public class CanzoneServiceImpl implements CanzoneService {

	@Autowired
	private CanzoneDAO repo;
	
	
	@Override
	public Canzone addCanzone(Canzone c) {
		return this.repo.save(c);
	}

	@Override
	public Canzone updateCanzone(Canzone c) {
		return this.repo.save(c);
	}

	@Override
	public void deleteCanzoneById(int id) {
		this.repo.deleteById(id);

	}

	@Override
	public Canzone getCanzoneById(int id) {
		if (this.repo.findById(id).isPresent())
			return this.repo.findById(id).get();
		return new Canzone();
	}

	@Override
	public List<Canzone> getCanzoni() {
		return this.repo.findAll();
	}

	@Override
	public List<Canzone> getCanzoniByGenere(String genere) {
		// TODO Auto-generated method stub
		return this.repo.findByGenere(genere);
	}

	@Override
	public List<Canzone> getCanzoniByCantante(String cantante) {
		// TODO Auto-generated method stub
		return this.repo.findByNomeCantante(cantante);
	}

}
