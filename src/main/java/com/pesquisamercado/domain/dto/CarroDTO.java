package com.pesquisamercado.domain.dto;

import com.pesquisamercado.domain.Carro;

public class CarroDTO {
	
	private Integer id; 
	private String modelo; 
	private String marca; 
	private Integer ano; 
	
	public CarroDTO() {
		
	}
	
	public CarroDTO(Carro obj) {
		this.id = obj.getId(); 
		this.modelo = obj.getModelo(); 
		this.marca = obj.getMarca(); 
		this.ano = obj.getAno(); 
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

}
