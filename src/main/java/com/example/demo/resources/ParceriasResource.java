package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Parcerias;
import com.example.demo.repositories.ParceriasRepository;

@RestController
@RequestMapping("/Parcerias")
public class ParceriasResource {

	@Autowired
	private ParceriasRepository service;

	@GetMapping
	public List<Parcerias> findAll() {
		return service.findAll();
	}
	@PostMapping
	public Parcerias save(@RequestBody Parcerias parcerias) {
		return service.save(parcerias);
	}
}
