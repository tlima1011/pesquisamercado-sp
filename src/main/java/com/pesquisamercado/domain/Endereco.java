package com.pesquisamercado.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.pesquisamercado.domain.dto.ConvidadoDTO;
import com.pesquisamercado.domain.dto.EmpresaDTO;
import com.pesquisamercado.domain.dto.PesquisadorDTO;

@Document(collection="endereco")
public class Endereco implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id; 
	private String logradouro; 
	private String numero; 
	private String bairro; 
	private String cep; 
	
	private EmpresaDTO empresa;
	
	private PesquisadorDTO pesquisador; 
		
	private ConvidadoDTO convidado; 
	
	public Endereco() { 
		
	}
	
	public Endereco(Integer id, String logradouro,  String bairro, String numero, String cep, ConvidadoDTO convidado) {
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.convidado = convidado; 
	} 
	
	
	public Endereco(Integer id, String logradouro,  String bairro, String numero, String cep, PesquisadorDTO pesquisador) {
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.pesquisador = pesquisador; 
	} 
	
	public Endereco(Integer id, String logradouro,  String bairro, String numero, String cep, EmpresaDTO empresa) {
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.empresa = empresa; 
	}

	public Endereco(Integer id2, String logradouro2, String numero2, String bairro2, String cep2, EmpresaDTO empresa,
			ConvidadoDTO convidado, PesquisadorDTO pesquisador) {
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.empresa = empresa;
		this.convidado = convidado;
		this.pesquisador = pesquisador; 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public EmpresaDTO getEmpresaDTO() {
		return empresa;
	}

	public void setEmpresaDTO(EmpresaDTO empresa) {
		this.empresa = empresa;
	}

	public PesquisadorDTO getPesquisadorDTO() {
		return pesquisador;
	}

	public void setPesquisadorDTO(PesquisadorDTO pesquisador) {
		this.pesquisador = pesquisador;
	}

	public ConvidadoDTO getConvidadoDTO() {
		return convidado;
	}

	public void setConvidadoDTO(ConvidadoDTO convidado) {
		this.convidado = convidado;
	}
}
