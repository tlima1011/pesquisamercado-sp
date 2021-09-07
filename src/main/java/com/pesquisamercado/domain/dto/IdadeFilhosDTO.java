package com.pesquisamercado.domain.dto;

import com.pesquisamercado.domain.IdadeFilhos;

public class IdadeFilhosDTO {
	
	private Integer id; 
	private String idade; 
	
	public IdadeFilhosDTO() {
		
	}
	
	public IdadeFilhosDTO(IdadeFilhos obj) {
		this.id = obj.getId(); 
		this.idade = obj.getIdade(); 
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
	
}
