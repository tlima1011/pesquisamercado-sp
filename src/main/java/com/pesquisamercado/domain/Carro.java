package com.pesquisamercado.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.pesquisamercado.domain.dto.ConvidadoDTO;

@Document(collection="carro")
public class Carro implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer id; 
	private String modelo; 
	private String marca; 
	private Integer ano; 
	
	private ConvidadoDTO convidado; 
	
	public Carro() { 
		
	}

	public Carro(Integer id, String modelo, String marca, Integer ano, ConvidadoDTO convidado) {
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.convidado = convidado; 
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

	public ConvidadoDTO getConvidado() {
		return convidado;
	}

	public void setConvidadoDTO(ConvidadoDTO convidado) {
		this.convidado = convidado;
	}
}
