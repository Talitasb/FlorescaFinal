package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {

	
}
