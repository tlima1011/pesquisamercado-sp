package com.pesquisamercado.domain;

import com.pesquisamercado.domain.dto.ConvidadoDTO;

public class IdadeFilhos {
	
	private Integer id; 
	private String idade; 
	
	private ConvidadoDTO convidadoDTO;
	
	public IdadeFilhos() { 
		
	}
	
	public IdadeFilhos(Integer id, String idade, ConvidadoDTO convidadoDTO) {
		this.id = id;
		this.idade = idade;
		this.convidadoDTO = convidadoDTO; 
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

	public void setConvidadoDTO(ConvidadoDTO convidadoDTO) {
		this.convidadoDTO = convidadoDTO; 
		
	}
	
	public ConvidadoDTO getConvidadoDTO() {
		return convidadoDTO;
	}

	
	
		

}
