package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Cadastro;

public interface CadastroRepository extends JpaRepository<Cadastro, Long> {

	
}
