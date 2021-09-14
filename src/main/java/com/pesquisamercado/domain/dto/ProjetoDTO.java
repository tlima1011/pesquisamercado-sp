package com.pesquisamercado.domain.dto;

import java.io.Serializable;
import java.util.Date;

import com.pesquisamercado.domain.Projeto;

public class ProjetoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer idProjeto; 
	private String numProjeto; 
	private String descProjeto; 
	private Date dataRecrutamento; 
	private Double valorPagar; 
	private Double beneficio; 
	private Date dataHoraEntrevista; 
	
	private EmpresaDTO empresa;
	
	private PesquisadorDTO pesquisador; 
	
	public ProjetoDTO() { 
		
	}

	public ProjetoDTO(Projeto obj) { 
		this.idProjeto = obj.getIdProjeto(); 
		this.numProjeto = obj.getNumProjeto();
		this.descProjeto = obj.getDescProjeto(); 
		this.dataRecrutamento = obj.getDataRecrutamento(); 
		this.valorPagar = obj.getValorPagar(); 
		this.beneficio = obj.getBeneficio(); 
		this.dataHoraEntrevista = obj.getDataHoraEntrevista();
		this.empresa = obj.getEmpresaDTO();
		this.pesquisador = obj.getPesquisadorDTO(); 
	}

	public Integer getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(Integer idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getNumProjeto() {
		return numProjeto;
	}

	public void setNumProjeto(String numProjeto) {
		this.numProjeto = numProjeto;
	}
	
	public String getDescProjeto() {
		return descProjeto;
	}

	public void setDescProjeto(String descProjeto) {
		this.descProjeto = descProjeto;
	}

	public Date getDataRecrutamento() {
		return dataRecrutamento;
	}

	public void setDataRecrutamento(Date dataRecrutamento) {
		this.dataRecrutamento = dataRecrutamento;
	}

	public Double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(Double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public Double getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(Double beneficio) {
		this.beneficio = beneficio;
	}

	public Date getDataHoraEntrevista() {
		return dataHoraEntrevista;
	}

	public void setDataHoraEntrevista(Date dataHoraEntrevista) {
		this.dataHoraEntrevista = dataHoraEntrevista;
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
}
