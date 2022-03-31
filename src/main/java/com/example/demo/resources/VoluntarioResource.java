package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Voluntario;
import com.example.demo.repositories.VoluntarioRepository;

@RestController
@RequestMapping("/Voluntario")
public class VoluntarioResource {

	@Autowired
	private VoluntarioRepository service;

	@GetMapping
	public List<Voluntario> findAll() {
		return service.findAll();
	}
	@PostMapping
	public Voluntario save(@RequestBody Voluntario voluntario) {
		return service.save(voluntario);
	}
}
