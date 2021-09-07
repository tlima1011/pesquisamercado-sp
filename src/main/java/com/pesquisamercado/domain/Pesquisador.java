package com.pesquisamercado.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import com.pesquisamercado.enums.EstadoCivil;
import com.pesquisamercado.enums.Status;

@Document(collection="pesquisador")
public class Pesquisador implements Serializable{

	private static final long serialVersionUID = 1L;
		
	private Integer idPesquisador; 
	private String nomePesquisador; 
	private Date dataNascimento; 
	private int idade; 
	private EstadoCivil estadoCivil; 
	private String cpf; 
	private String rg; 
	private String email; 
	private String senha; 
	private Status status; 
	
	private ArrayList<Telefone> telefones = new ArrayList<>(); 
	
	private ArrayList<Endereco> enderecos = new ArrayList<>();
	
	private ArrayList<Projeto> projetos = new ArrayList<>();
	
	private ArrayList<Empresa> empresas = new ArrayList<>();
	
	public Pesquisador() {
		
	}

	public Pesquisador(Integer idPesquisador, String nomePesquisador, Date dataNascimento, int idade,
			EstadoCivil estadoCivil, String cpf, String rg, String email, String senha, Status status) {
		this.idPesquisador = idPesquisador;
		this.nomePesquisador = nomePesquisador;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		this.cpf = cpf;
		this.rg = rg;
		this.email = email;
		this.senha = senha;
		this.status = status;
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

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
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

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}

	public ArrayList<Projeto> getProjetos() {
		return projetos;
	}

	public ArrayList<Empresa> getEmpresas() {
		return empresas;
	}
	

}
