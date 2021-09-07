package com.pesquisamercado.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
	
	private PesquisadorDTO pesquisadorDTO; 	
	
	private EmpresaDTO empresaDTO;
	
	public Telefone(Integer id, String numero, PesquisadorDTO pesquisadorDTO) {
		this.id = id;  
		this.numero = numero;
		this.pesquisadorDTO = pesquisadorDTO; 
	}
		
	public Telefone(Integer id, String numero, EmpresaDTO empresaDTO) {
		this.id = id;  
		this.numero = numero;
		this.empresaDTO = empresaDTO; 
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
