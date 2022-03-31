package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.entities.FlorescaUser;
import com.example.demo.repositories.FlorescaUserRepository;

@Service
public class FlorescaUserService implements UserDetailsService {

	@Autowired
	private FlorescaUserRepository florescaUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return Optional.ofNullable(florescaUserRepository.findByUsername(username))
	.orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado"));
	}

}
