package com.pesquisamercado.domain.dto;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.DBRef;

import com.pesquisamercado.domain.Pesquisador;
import com.pesquisamercado.domain.Telefone;

public class TelefoneDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id; 
	private String numero; 
	
	@DBRef(lazy = true)
	private ConvidadoDTO convidadoDTO; 
	
	private EmpresaDTO empresaDTO; 
	
	private PesquisadorDTO pesquisadorDTO; 
		
	public TelefoneDTO() {
		
	}
	
//	public TelefoneDTO(Pesquisador obj) {
//		this.id = obj.getId(); 
//		this.numero = obj.getNu
//	}
	
	public TelefoneDTO(Telefone obj) {
		this.id = obj.getId();
		this.numero = obj.getNumero();  
		this.empresaDTO = obj.getEmpresaDTO();
		this.pesquisadorDTO = obj.getPesquisadorDTO(); 
		this.convidadoDTO = obj.getConvidadoDTO(); 
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

	public PesquisadorDTO getPesquisadorDTO() {
		return pesquisadorDTO;
	}

	public void setPesquisadorDTO(PesquisadorDTO pesquisadorDTO) {
		this.pesquisadorDTO = pesquisadorDTO;
	}

	public ConvidadoDTO getConvidadoDTO() {
		return convidadoDTO;
	}

	public void setConvidadoDTO(ConvidadoDTO convidadoDTO) {
		this.convidadoDTO = convidadoDTO;
	}
	
	
	
}
