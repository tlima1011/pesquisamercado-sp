package com.pesquisamercado.domain.dto;

import java.io.Serializable;

import com.pesquisamercado.domain.Endereco;

public class EnderecoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private String logradouro; 
	private String numero; 
	private String bairro; 
	private String cep; 
		
	private EmpresaDTO empresa; 
	
	private PesquisadorDTO pesquisador;
	
	private ConvidadoDTO convidado; 
	
	public EnderecoDTO() { 
		
	}
	
	public EnderecoDTO(Endereco obj) {
		this.id = obj.getId();
		this.logradouro = obj.getLogradouro(); 
		this.numero = obj.getNumero();
		this.bairro = obj.getBairro();
		this.cep = obj.getCep();
		this.empresa = obj.getEmpresaDTO(); 
		this.pesquisador = obj.getPesquisadorDTO(); 
		this.convidado = obj.getConvidadoDTO(); 
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
