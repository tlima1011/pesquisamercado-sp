package com.pesquisamercado.domain.dto;

import java.io.Serializable;

import com.pesquisamercado.domain.IdadeFilhos;

public class IdadeFilhosDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private String idade; 
	
	private ConvidadoDTO convidadoDTO; 
	
	public IdadeFilhosDTO() {
		
	}
	
	public IdadeFilhosDTO(IdadeFilhos obj) {
		this.id = obj.getId(); 
		this.idade = obj.getIdade(); 
		this.convidadoDTO = obj.getConvidadoDTO();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public ConvidadoDTO getConvidadoDTO() {
		return convidadoDTO;
	}
	
}
