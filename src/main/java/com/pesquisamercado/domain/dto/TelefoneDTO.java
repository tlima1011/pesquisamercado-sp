package com.pesquisamercado.domain.dto;

import java.io.Serializable;

import com.pesquisamercado.domain.Telefone;

public class TelefoneDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private String numero; 
	
	private EmpresaDTO empresaDTO; 
	
	public TelefoneDTO() {
		
	}

	public TelefoneDTO(Telefone obj) {
		this.id = obj.getId();
		this.numero = obj.getNumero();  
		this.empresaDTO = obj.getEmpresaDTO();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setNumero(String numero) {
		this.numero = numero; 
	}

	public String getNumero() {
		return numero;
	}

	public EmpresaDTO getEmpresaDTO() {
		return empresaDTO;
	}

	public void setEmpresaDTO(EmpresaDTO empresaDTO) {
		this.empresaDTO = empresaDTO;
	}
	
	
}
