package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Contato;
import com.example.demo.repositories.ContatoRepository;

@RestController
@RequestMapping("/Contato")
public class ContatoResource {

	@Autowired
	private ContatoRepository service;

	@GetMapping
	public List<Contato> findAll() {
		return service.findAll();
	}
	@PostMapping
	public Contato save(@RequestBody Contato obj) {
			
		return service.save(obj);
	}
}
