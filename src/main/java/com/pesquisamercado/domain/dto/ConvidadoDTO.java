package com.pesquisamercado.domain.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

import com.pesquisamercado.domain.Convidado;
import com.pesquisamercado.enums.EstadoCivil;
import com.pesquisamercado.enums.Instrucao;
import com.pesquisamercado.enums.Status;

public class ConvidadoDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer idConvidado; 
	private String nomeConvidado; 
	private String rg; 
	private LocalDate dataNascimento; 
	private String cpf; 
	private String email; 
	private String nacionalidade; 
	private String tempoMoradia; 
	private int idade; 
	private EstadoCivil estadoCivil; 
	private Character temFilhos; 
	private Integer qtdeFilhos; 
	private Character trabalha; 
	private String faculdade; 
	private String curso;
	private String profissao;
	private Character estuda;
	private int contBanheiro;
	private int[] banheiro = { 0, 3, 7, 10, 14 };
	private int pontoBanheiros;
	private int contMensalista;
	private int[] mensalista = { 0, 3, 7, 10, 13 };
	private int pontoMensalista;
	private int contAutomovel;
	private int[] automovel = { 0, 3, 5, 8, 11 };
	private int pontoAutomovel;
	private int contMicrocomputador;
	private int[] microcomputador = { 0, 3, 6, 8, 11 };
	private int pontoMicrocomputador;
	private int contLavaLoucas;
	private int[] lavaLoucas = { 0, 3, 6, 6, 6 };
	private int pontoLavaLoucas;
	private int contGeladeira;
	private int[] geladeira = { 0, 2, 3, 5, 5 };
	private int pontoGeladeira;
	private int contFreezer;
	private int[] freezer = { 0, 2, 4, 6, 6 };
	private int pontoFreezer;
	private int contLavaRoupa;
	private int[] lavaRoupas = { 0, 2, 4, 6, 6 };
	private int pontoLavaRoupas;
	private int contDvd;
	private int[] dvd = { 0, 1, 3, 4, 6 };
	private int pontoDvd;
	private int contMicroondas;
	private int[] microondas = { 0, 2, 4, 4, 4 };
	private int pontoMicroondas;
	private int contMotocicleta;
	private int[] motocicletas = { 0, 1, 3, 3, 3 };
	private int pontoMotocicletas;
	private int contSecadoraRoupas;
	private int[] secadoraRoupas = { 0, 2, 2, 2, 2 };
	private int pontoSecadoraRoupas;
	private Character aguaEncanada;
	private Integer pontoAguaEncanada;
	private Character ruaPavimentada;
	private Integer pontoRuaPavimentada;
	private Instrucao instrucao;
	private Integer pontoInstrucao;
	private String profissaoChefe;
	private String empresaChefe; 
	private Integer totalPontos;
	private String criterio;
	private Status status;
	private PesquisadorDTO pesquisador; 
	private ProjetoDTO projeto; 
	private EmpresaDTO empresa; 
		
	public ConvidadoDTO() {
		
	}
	
	public ConvidadoDTO(Convidado obj) {
		this.idConvidado = obj.getIdConvidado(); 
		this.nomeConvidado = obj.getNomeConvidado(); 
		this.rg = obj.getRg();  
		this.dataNascimento = obj.getDataNascimento(); 
		this.cpf = obj.getCpf(); 
		this.email = obj.getEmail(); 
		this.nacionalidade = obj.getNacionalidade(); 
		this.tempoMoradia = obj.getTempoMoradia(); 
		this.idade = obj.getIdade(); 
		this.estadoCivil = obj.getEstadoCivil(); 
		this.temFilhos = obj.getTemFilhos(); 
		this.qtdeFilhos = obj.getQtdeFilhos(); 
		this.trabalha = obj.getTrabalha(); 
		this.faculdade = obj.getFaculdade(); 
		this.curso = obj.getCurso();
		this.profissao = obj.getProfissao();
		this.estuda = obj.getEstuda();
		this.contBanheiro = obj.getContBanheiro();
		this.pontoBanheiros = obj.getPontoBanheiros(); 
		this.contMensalista = obj.getContMensalista();
		this.pontoMensalista = obj.getPontoMensalista();
		this.contAutomovel = obj.getContAutomovel();
		this.pontoAutomovel = obj.getPontoAutomovel();
		this.contMicrocomputador = obj.getContMicrocomputador();
		this.pontoMicrocomputador = obj.getPontoMicrocomputador();
		this.contLavaLoucas = obj.getContLavaLoucas();
		this.pontoLavaLoucas = obj.getPontoLavaLoucas();
		this.contGeladeira = obj.getContGeladeira();
		this.pontoGeladeira = obj.getPontoGeladeira();
		this.contFreezer = obj.getContFreezer();
		this.pontoFreezer = obj.getPontoFreezer();
		this.contLavaRoupa = obj.getContLavaRoupa();
		this.pontoLavaRoupas = obj.getPontoLavaRoupas();
		this.contDvd = obj.getContDvd();
		this.pontoDvd = obj.getPontoDvd();
		this.contMicroondas = obj.getContMicroondas();
		this.pontoMicroondas = obj.getPontoMicroondas();
		this.contMotocicleta = obj.getContMotocicleta();
		this.pontoMotocicletas = obj.getPontoMotocicletas();
		this.contSecadoraRoupas = obj.getContSecadoraRoupas();
		this.pontoSecadoraRoupas = obj.getPontoSecadoraRoupas();
		this.aguaEncanada = obj.getAguaEncanada();
		this.pontoAguaEncanada = obj.getPontoAguaEncanada();
		this.ruaPavimentada = obj.getRuaPavimentada();
		this.pontoRuaPavimentada = obj.getPontoRuaPavimentada();
		this.instrucao = obj.getInstrucao();
		this.pontoInstrucao = obj.getPontoInstrucao();
		this.profissaoChefe = obj.getProfissaoChefe();
		this.empresaChefe = obj.getEmpresaChefe(); 
		this.totalPontos = obj.getTotalPontos();
		this.criterio = obj.getCriterio();
		this.status = obj.getStatus();
		this.pesquisador = obj.getPesquisadorDTO();
		this.projeto = obj.getProjetoDTO();
		this.empresa = obj.getEmpresaDTO(); 
	}

	public Integer getIdConvidado() {
		return idConvidado;
	}

	public void setIdConvidado(Integer idConvidado) {
		this.idConvidado = idConvidado;
	}

	public String getNomeConvidado() {
		return nomeConvidado;
	}

	public void setNomeConvidado(String nomeConvidado) {
		this.nomeConvidado = nomeConvidado;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getTempoMoradia() {
		return tempoMoradia;
	}

	public void setTempoMoradia(String tempoMoradia) {
		this.tempoMoradia = tempoMoradia;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Character getTemFilhos() {
		return temFilhos;
	}

	public Integer getQtdeFilhos() {
		return qtdeFilhos;
	}

	public void setQtdeFilhos(Integer qtdeFilhos) {
		this.qtdeFilhos = qtdeFilhos;
	}

	public void setTemFilhos(Character temFilhos) {
		this.temFilhos = temFilhos;
	}

	public Character getTrabalha() {
		return trabalha;
	}

	public void setTrabalha(Character trabalha) {
		this.trabalha = trabalha;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public Character getEstuda() {
		return estuda;
	}

	public void setEstuda(Character estuda) {
		this.estuda = estuda;
	}

	public int getContBanheiro() {
		return contBanheiro;
	}

	public void setContBanheiro(int contBanheiro) {
		this.contBanheiro = contBanheiro;
	}

	public int getPontoBanheiros() {
		return pontoBanheiros;
	}

	public void setPontoBanheiros(int pontoBanheiros) {
		this.pontoBanheiros = pontoBanheiros;
	}

	public int getContMensalista() {
		return contMensalista;
	}

	public void setContMensalista(int contMensalista) {
		this.contMensalista = contMensalista;
	}

	public int getPontoMensalista() {
		return pontoMensalista;
	}

	public void setPontoMensalista(int pontoMensalista) {
		this.pontoMensalista = pontoMensalista;
	}

	public int getContAutomovel() {
		return contAutomovel;
	}

	public void setContAutomovel(int contAutomovel) {
		this.contAutomovel = contAutomovel;
	}

	public int getPontoAutomovel() {
		return pontoAutomovel;
	}

	public void setPontoAutomovel(int pontoAutomovel) {
		this.pontoAutomovel = pontoAutomovel;
	}

	public int getContMicrocomputador() {
		return contMicrocomputador;
	}

	public void setContMicrocomputador(int contMicrocomputador) {
		this.contMicrocomputador = contMicrocomputador;
	}

	public int getPontoMicrocomputador() {
		return pontoMicrocomputador;
	}

	public void setPontoMicrocomputador(int pontoMicrocomputador) {
		this.pontoMicrocomputador = pontoMicrocomputador;
	}

	public int getContLavaLoucas() {
		return contLavaLoucas;
	}

	public void setContLavaLoucas(int contLavaLoucas) {
		this.contLavaLoucas = contLavaLoucas;
	}

	public int getPontoLavaLoucas() {
		return pontoLavaLoucas;
	}

	public void setPontoLavaLoucas(int pontoLavaLoucas) {
		this.pontoLavaLoucas = pontoLavaLoucas;
	}

	public int getContGeladeira() {
		return contGeladeira;
	}

	public void setContGeladeira(int contGeladeira) {
		this.contGeladeira = contGeladeira;
	}

	public int getPontoGeladeira() {
		return pontoGeladeira;
	}

	public void setPontoGeladeira(int pontoGeladeira) {
		this.pontoGeladeira = pontoGeladeira;
	}

	public int getContFreezer() {
		return contFreezer;
	}

	public void setContFreezer(int contFreezer) {
		this.contFreezer = contFreezer;
	}

	public int getPontoFreezer() {
		return pontoFreezer;
	}

	public void setPontoFreezer(int pontoFreezer) {
		this.pontoFreezer = pontoFreezer;
	}

	public int getContLavaRoupa() {
		return contLavaRoupa;
	}

	public void setContLavaRoupa(int contLavaRoupa) {
		this.contLavaRoupa = contLavaRoupa;
	}

	public int getPontoLavaRoupas() {
		return pontoLavaRoupas;
	}

	public void setPontoLavaRoupas(int pontoLavaRoupas) {
		this.pontoLavaRoupas = pontoLavaRoupas;
	}

	public int getContDvd() {
		return contDvd;
	}

	public void setContDvd(int contDvd) {
		this.contDvd = contDvd;
	}

	public int getPontoDvd() {
		return pontoDvd;
	}

	public void setPontoDvd(int pontoDvd) {
		this.pontoDvd = pontoDvd;
	}

	public int getContMicroondas() {
		return contMicroondas;
	}

	public void setContMicroondas(int contMicroondas) {
		this.contMicroondas = contMicroondas;
	}

	public int getPontoMicroondas() {
		return pontoMicroondas;
	}

	public void setPontoMicroondas(int pontoMicroondas) {
		this.pontoMicroondas = pontoMicroondas;
	}

	public int getContMotocicleta() {
		return contMotocicleta;
	}

	public void setContMotocicleta(int contMotocicleta) {
		this.contMotocicleta = contMotocicleta;
	}

	public int getPontoMotocicletas() {
		return pontoMotocicletas;
	}

	public void setPontoMotocicletas(int pontoMotocicletas) {
		this.pontoMotocicletas = pontoMotocicletas;
	}

	public int getContSecadoraRoupas() {
		return contSecadoraRoupas;
	}

	public void setContSecadoraRoupas(int contSecadoraRoupas) {
		this.contSecadoraRoupas = contSecadoraRoupas;
	}

	public int getPontoSecadoraRoupas() {
		return pontoSecadoraRoupas;
	}

	public void setPontoSecadoraRoupas(int pontoSecadoraRoupas) {
		this.pontoSecadoraRoupas = pontoSecadoraRoupas;
	}

	public Character getAguaEncanada() {
		return aguaEncanada;
	}

	public void setAguaEncanada(Character aguaEncanada) {
		this.aguaEncanada = aguaEncanada;
	}

	public Integer getPontoAguaEncanada() {
		return pontoAguaEncanada;
	}

	public void setPontoAguaEncanada(Integer pontoAguaEncanada) {
		this.pontoAguaEncanada = pontoAguaEncanada;
	}

	public Character getRuaPavimentada() {
		return ruaPavimentada;
	}

	public void setRuaPavimentada(Character ruaPavimentada) {
		this.ruaPavimentada = ruaPavimentada;
	}

	public Integer getPontoRuaPavimentada() {
		return pontoRuaPavimentada;
	}

	public void setPontoRuaPavimentada(Integer pontoRuaPavimentada) {
		this.pontoRuaPavimentada = pontoRuaPavimentada;
	}

	public Instrucao getInstrucao() {
		return instrucao;
	}

	public void setInstrucao(Instrucao instrucao) {
		this.instrucao = instrucao;
	}

	public Integer getPontoInstrucao() {
		return pontoInstrucao;
	}

	public void setPontoInstrucao(Integer pontoInstrucao) {
		this.pontoInstrucao = pontoInstrucao;
	}

	public String getProfissaoChefe() {
		return profissaoChefe;
	}

	public void setProfissaoChefe(String profissaoChefe) {
		this.profissaoChefe = profissaoChefe;
	}

	public String getEmpresaChefe() {
		return empresaChefe;
	}

	public void setEmpresaChefe(String empresaChefe) {
		this.empresaChefe = empresaChefe;
	}

	public Integer getTotalPontos() {
		return totalPontos;
	}

	public void setTotalPontos(Integer totalPontos) {
		this.totalPontos = totalPontos;
	}

	public String getCriterio() {
		return criterio;
	}

	public void setCriterio(String criterio) {
		this.criterio = criterio;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public PesquisadorDTO getPesquisador() {
		return pesquisador;
	}

	public ProjetoDTO getProjeto() {
		return projeto;
	}

	public EmpresaDTO getEmpresa() {
		return empresa;
	}
	
}
