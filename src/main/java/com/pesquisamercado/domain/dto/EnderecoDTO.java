package com.pesquisamercado.domain.dto;

import com.pesquisamercado.domain.Endereco;

public class EnderecoDTO {
	
	private Integer id; 
	private String logradouro; 
	private String numero; 
	private String bairro; 
	private String cep; 
		
	private EmpresaDTO empresaDTO; 
	
	public EnderecoDTO() { 
		
	}

	public EnderecoDTO(Endereco obj) {
		this.id = obj.getId();
		this.logradouro = obj.getLogradouro(); 
		this.numero = obj.getNumero();
		this.bairro = obj.getBairro();
		this.cep = obj.getCep();
		this.empresaDTO = obj.getEmpresaDTO(); 
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