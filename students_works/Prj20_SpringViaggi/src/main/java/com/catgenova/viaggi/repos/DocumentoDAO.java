package com.catgenova.viaggi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.catgenova.viaggi.entities.Documento;


public interface DocumentoDAO extends JpaRepository<Documento, Integer> {

	
	
}
