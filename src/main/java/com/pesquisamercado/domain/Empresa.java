package com.pesquisamercado.domain;

import java.io.Serializable;
import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.pesquisamercado.enums.Status;

@Document(collection="empresa")
public class Empresa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id; 
	private String nomeEmpresa; 
	private String nomeContato; 
	private String email;
	private Status status; 
	
	//@DBRef(lazy = true)
	private ArrayList<Telefone> telefones = new ArrayList<>(); 
	
	//@DBRef(lazy = true)
	private ArrayList<Endereco> enderecos = new ArrayList<>();
	
	private ArrayList<Projeto> projetos = new ArrayList<>(); 
	
	private ArrayList<Convidado> convidados = new ArrayList<>();
	
	public Empresa() { 
		
	}

	public Empresa(Integer id, String nomeEmpresa, String nomeContato, String email, Status status) {
		this.id = id;
		this.nomeEmpresa = nomeEmpresa;
		this.nomeContato = nomeContato;
		this.email = email;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}

	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}

	public ArrayList<Convidado> getConvidados() {
		return convidados;
	}
}
