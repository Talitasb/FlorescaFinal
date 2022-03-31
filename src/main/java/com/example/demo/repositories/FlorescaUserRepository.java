package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.FlorescaUser;

@Repository
public interface FlorescaUserRepository extends JpaRepository<FlorescaUser, Long> {

	FlorescaUser findByUsername(String username);
}
