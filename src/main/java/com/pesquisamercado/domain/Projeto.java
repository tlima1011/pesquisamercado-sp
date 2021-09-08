package com.pesquisamercado.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.pesquisamercado.domain.dto.EmpresaDTO;
import com.pesquisamercado.domain.dto.PesquisadorDTO;

@Document(collection="projeto")
public class Projeto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer idProjeto; 
	private String numProjeto; 
	private String descProjeto; 
	private Date dataRecrutamento; 
	private Double valorPagar; 
	private Double beneficio; 
	private Date dataHoraEntrevista; 
	
	private EmpresaDTO empresaDTO;
	
	private PesquisadorDTO pesquisadorDTO; 
	
	private ArrayList<Convidado> convidados = new ArrayList<>(); 
	
	public Projeto() { 
		
	}

	public Projeto(Integer idProjeto, String numProjeto, String descProjeto, Date dataRecrutamento, Double valorPagar, Double beneficio,
			Date dataHoraEntrevista, EmpresaDTO empresaDTO, PesquisadorDTO pesquisadorDTO) {
		this.idProjeto = idProjeto;
		this.numProjeto = numProjeto;
		this.descProjeto = descProjeto; 
		this.dataRecrutamento = dataRecrutamento;
		this.valorPagar = valorPagar;
		this.beneficio = beneficio;
		this.dataHoraEntrevista = dataHoraEntrevista;
		this.empresaDTO = empresaDTO;
		this.pesquisadorDTO = pesquisadorDTO; 
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

	public ArrayList<Convidado> getConvidados() {
		return convidados;
	}

	
	
	
	
	
}
