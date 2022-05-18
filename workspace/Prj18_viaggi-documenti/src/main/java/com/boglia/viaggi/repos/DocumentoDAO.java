package com.boglia.viaggi.repos;

import org.springframework.data.repository.CrudRepository;

import com.boglia.viaggi.entities.Documento;

public interface DocumentoDAO extends CrudRepository<Documento, Integer> {

}
