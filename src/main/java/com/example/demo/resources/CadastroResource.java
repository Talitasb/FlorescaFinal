package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cadastro;
import com.example.demo.repositories.CadastroRepository;

@RestController
@RequestMapping("/Cadastro")
public class CadastroResource {

	@Autowired
	private CadastroRepository service;

	@GetMapping
	public List<Cadastro> findAll() {
		return service.findAll();
	}
	@PostMapping
	public Cadastro save(@RequestBody Cadastro cadastro) {
		return service.save(cadastro);
	}
}
