package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parcerias {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String Nome;
	private String email;
	private String endereço;
	private String cidade;
	private String estado;
	private String cep;
	private Double senha;
	private Double confirmarsenha;
	
	public Parcerias() {
		
	}

	public Parcerias(Long id, String nome, String email, String endereço, String cidade, String estado, String cep,
			Double senha, Double confirmarsenha) {
		super();
		this.id = id;
		Nome = nome;
		this.email = email;
		this.endereço = endereço;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.senha = senha;
		this.confirmarsenha = confirmarsenha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Double getSenha() {
		return senha;
	}

	public void setSenha(Double senha) {
		this.senha = senha;
	}

	public Double getConfirmarsenha() {
		return confirmarsenha;
	}

	public void setConfirmarsenha(Double confirmarsenha) {
		this.confirmarsenha = confirmarsenha;
	}

	
	
}