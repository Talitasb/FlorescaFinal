package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entities.Parcerias;
import com.example.demo.repositories.ParceriasRepository;

@Service
public class ParceriasService {

	@Autowired
	private ParceriasRepository repository;
		
		@Transactional(readOnly = true)
		public List<Parcerias> findAll(){
			List<Parcerias> resultado = repository.findAll();
			return resultado;
	 	}
		public void save(Parcerias parcerias) {
			repository.save(parcerias);
		}
	}



	
	