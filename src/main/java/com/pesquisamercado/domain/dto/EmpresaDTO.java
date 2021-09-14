package com.pesquisamercado.domain.dto;

import java.io.Serializable;

import com.pesquisamercado.domain.Empresa;
import com.pesquisamercado.enums.Status;

public class EmpresaDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer idEmpresa; 
	private String nomeEmpresa; 
	private String nomeContato; 
	private String email;
	private Status status; 
	
	public EmpresaDTO() { 
		
	}

	public EmpresaDTO(Empresa obj) {
		this.idEmpresa = obj.getIdEmpresa();
		this.nomeEmpresa = obj.getNomeEmpresa();
		this.nomeContato = obj.getNomeContato(); 
		this.email = obj.getEmail(); 
		this.status = obj.getStatus(); 
	}

	public Integer getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(Integer idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeContato() {
		return nomeContato;
	}

	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
