package com.pesquisamercado.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.pesquisamercado.domain.dto.ConvidadoDTO;
import com.pesquisamercado.domain.dto.EmpresaDTO;
import com.pesquisamercado.domain.dto.PesquisadorDTO;

@Document(collection="telefone")
public class Telefone implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id; 
	private String numero; 
	
	public Telefone() {
		
	}
	
	private ConvidadoDTO convidado; 
	
	private PesquisadorDTO pesquisador; 	
	
	private EmpresaDTO empresa;
	
	public Telefone(Integer id, String numero, ConvidadoDTO convidado) {
		this.id = id;  
		this.numero = numero;
		this.convidado = convidado;  
	}
	
	
	public Telefone(Integer id, String numero, PesquisadorDTO pesquisador) {
		this.id = id;  
		this.numero = numero;
		this.pesquisador = pesquisador; 
	}
		
	public Telefone(Integer id, String numero, EmpresaDTO empresa) {
		this.id = id;  
		this.numero = numero;
		this.empresa = empresa; 
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
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
