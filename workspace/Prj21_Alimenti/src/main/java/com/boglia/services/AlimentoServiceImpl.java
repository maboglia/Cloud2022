package com.boglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boglia.entities.Alimento;
import com.boglia.repos.AlimentoDAO;

@Service
public class AlimentoServiceImpl implements AlimentoService {

	@Autowired
	private AlimentoDAO repo;
	
	
	@Override
	public List<Alimento> getAlimenti() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Alimento getAlimento(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAlimento(Alimento a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updAlimento(Alimento a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delAlimento(int id) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
	
}
