package com.catgenova.viaggi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catgenova.viaggi.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

	
	
}
