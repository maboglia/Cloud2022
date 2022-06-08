package com.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.Alimento;

public interface AlimentoDAO extends JpaRepository<Alimento, Integer> {

}
