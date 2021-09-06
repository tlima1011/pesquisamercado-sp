package com.pesquisamercado.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.pesquisamercado.domain.dto.EmpresaDTO;

@Document(collection="endereco")
public class Endereco {
	
	@Id
	private Integer id; 
	private String logradouro; 
	private String numero; 
	private String bairro; 
	private String cep; 
	
	public Endereco() { 
		
	}
	
	private EmpresaDTO empresaDTO; 

	public Endereco(Integer id, String logradouro,  String bairro, String numero, String cep, EmpresaDTO empresaDTO) {
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.empresaDTO = empresaDTO; 
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
		return empresaDTO;
	}

	public void setEmpresaDTO(EmpresaDTO empresaDTO) {
		this.empresaDTO = empresaDTO;
	}
	
	
	
}
