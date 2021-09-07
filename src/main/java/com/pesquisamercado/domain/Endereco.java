package com.pesquisamercado.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
	
	private EmpresaDTO empresaDTO;
	
	private PesquisadorDTO pesquisadorDTO; 
		
	public Endereco() { 
		
	}
	
	public Endereco(Integer id, String logradouro,  String bairro, String numero, String cep, PesquisadorDTO pesquisadorDTO) {
		this.id = id;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numero = numero;
		this.cep = cep;
		this.setPesquisadorDTO(pesquisadorDTO); 
	} 
	
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

	public PesquisadorDTO getPesquisadorDTO() {
		return pesquisadorDTO;
	}

	public void setPesquisadorDTO(PesquisadorDTO pesquisadorDTO) {
		this.pesquisadorDTO = pesquisadorDTO;
	}
	
	
	
}
