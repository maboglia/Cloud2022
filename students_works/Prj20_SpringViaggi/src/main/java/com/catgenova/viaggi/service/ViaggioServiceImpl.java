package com.catgenova.viaggi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.catgenova.viaggi.entities.Viaggio;
import com.catgenova.viaggi.repos.ViaggioDAO;

@Service
public class ViaggioServiceImpl implements ViaggiService {

	@Autowired
	private ViaggioDAO repo;

	@Override
	public List<Viaggio> getViaggi() {

		return repo.findAll();
	}

	@Override
	public Viaggio addViaggio(Viaggio v) {
		return repo.save(v);
	}

}
