package com.pesquisamercado.domain.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import com.pesquisamercado.domain.Pesquisador;
import com.pesquisamercado.enums.EstadoCivil;
import com.pesquisamercado.enums.Status;

public class PesquisadorDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer idPesquisador; 
	private String nomePesquisador; 
	private LocalDate dataNascimento; 
	private int idade; 
	private EstadoCivil estadoCivil; 
	private String cpf; 
	private String rg; 
	private String email; 
	private String senha; 
	private Status status; 
	
	public PesquisadorDTO() {
		
	}
	
	public PesquisadorDTO(Pesquisador obj) {
		this.idPesquisador = obj.getIdPesquisador(); 
		this.nomePesquisador = obj.getNomePesquisador(); 
		this.dataNascimento = obj.getDataNascimento(); 
		this.idade = obj.getIdade(); 
		this.estadoCivil = obj.getEstadoCivil(); 
		this.cpf = obj.getCpf(); 
		this.rg = obj.getRg(); 
		this.email = obj.getEmail(); 
		this.senha = obj.getSenha(); 
		this.status = obj.getStatus(); 
	}

	public Integer getIdPesquisador() {
		return idPesquisador;
	}

	public void setIdPesquisador(Integer idPesquisador) {
		this.idPesquisador = idPesquisador;
	}

	public String getNomePesquisador() {
		return nomePesquisador;
	}

	public void setNomePesquisador(String nomePesquisador) {
		this.nomePesquisador = nomePesquisador;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
	

}
