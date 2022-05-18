package com.boglia.viaggi.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.boglia.viaggi.entities.Viaggio;

public interface ViaggioDAO extends CrudRepository<Viaggio, Integer> {

}
