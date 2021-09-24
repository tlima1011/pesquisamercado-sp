package com.pesquisamercado.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.pesquisamercado.domain.dto.EmpresaDTO;
import com.pesquisamercado.domain.dto.PesquisadorDTO;
import com.pesquisamercado.domain.dto.ProjetoDTO;
import com.pesquisamercado.enums.EstadoCivil;
import com.pesquisamercado.enums.Instrucao;
import com.pesquisamercado.enums.Status;

@Document(collection="convidado")
public class Convidado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
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
	
	private ArrayList<IdadeFilhos> idadeFilhos = new ArrayList<>(); 
	
	private ArrayList<Endereco> enderecos = new ArrayList<>();

	private ArrayList<Telefone> telefones = new ArrayList<>();

	private ArrayList<Carro> carros = new ArrayList<>();
	
	private ProjetoDTO projeto; 
	
	private EmpresaDTO empresa; 
	
	private PesquisadorDTO pesquisador; 
	
	public Convidado() {
		
	}
	
	public Convidado(Integer idConvidado, String nomeConvidado, String rg, LocalDate dataNascimento, String cpf,
			String email, String nacionalidade, String tempoMoradia, int idade, EstadoCivil estadoCivil,
			Character temFilhos, Integer qtdeFilhos, Character trabalha, String profissao, Character estuda, String curso, String faculdade,
			int contBanheiro, int pontoBanheiros, int contMensalista, int contAutomovel, int contMicrocomputador,
			int pontoMicrocomputador, int contLavaLoucas, int contGeladeira, int pontoGeladeira, int contFreezer,
			int contLavaRoupa, int contDvd, int contMicroondas, int contMotocicleta, int contSecadoraRoupas,
			Character aguaEncanada, Character ruaPavimentada, Instrucao instrucao, String profissaoChefe, String empresaChefe, Status status,
			PesquisadorDTO pesquisador, ProjetoDTO projeto, EmpresaDTO empresa) {
		this.idConvidado = idConvidado;
		this.nomeConvidado = nomeConvidado;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.email = email;
		this.nacionalidade = nacionalidade;
		this.tempoMoradia = tempoMoradia;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
		this.temFilhos = temFilhos;
		this.setQtdeFilhos(qtdeFilhos); 
		this.trabalha = trabalha;
		this.profissao = profissao;
		this.estuda = estuda;
		this.curso = curso;
		this.faculdade = faculdade;
		this.contBanheiro = contBanheiro;
		setPontoBanheiros(contBanheiro);
		this.contMensalista = contMensalista;
		setPontoMensalista(contMensalista);
		this.contAutomovel = contAutomovel;
		setPontoAutomovel(contAutomovel);
		this.contMicrocomputador = contMicrocomputador;
		setPontoMicrocomputador(contMicrocomputador);
		this.contLavaLoucas = contLavaLoucas;
		setPontoLavaLoucas(contLavaLoucas);
		this.contGeladeira = contGeladeira;
		setPontoGeladeira(contGeladeira);
		this.contFreezer = contFreezer;
		setPontoFreezer(contFreezer);
		this.contLavaRoupa = contLavaRoupa;
		setPontoLavaRoupas(contLavaRoupa);
		this.contDvd = contDvd;
		setPontoDvd(contDvd);
		this.contMicroondas = contMicroondas;
		setPontoMicroondas(contMicroondas);
		this.contMotocicleta = contMotocicleta;
		setPontoMotocicletas(contMotocicleta);
		this.contSecadoraRoupas = contSecadoraRoupas;
		setPontoSecadoraRoupas(contSecadoraRoupas);
		this.aguaEncanada = aguaEncanada;
		setPontoAguaEncanada();
		this.ruaPavimentada = ruaPavimentada;
		setPontoRuaPavimentada();
		this.instrucao = instrucao;
		setPontoInstrucao();
		this.profissaoChefe = profissaoChefe;
		this.empresaChefe = empresaChefe; 
		setTotalPontos();
		setCriterio();
		this.status = status;
		this.pesquisador = pesquisador;
		this.projeto = projeto;
		this.empresa = empresa;
	}

	public Convidado(Integer idConvidado, String nomeConvidado2, String rg2, LocalDate dataNascimento2, String cpf2,
			String email2, String nacionalidade2, String tempoMoradia2, int idade2, EstadoCivil estadoCivil2,
			Character temFilhos2, Integer qtdeFilhos2,Character trabalha2, String faculdade2, String curso2, String profissao2,
			Character estuda2, int contBanheiro2, int pontoBanheiros2, int contMensalista2, int pontoMensalista2,
			int contAutomovel2, int pontoAutomovel2, int contMicrocomputador2, int pontoMicrocomputador2,
			int contLavaLoucas2, int pontoLavaLoucas2, int contGeladeira2, int pontoGeladeira2, int contFreezer2,
			int pontoFreezer2, int contLavaRoupa2, int pontoLavaRoupas2, int contDvd2, int pontoDvd2,
			int contMicroondas2, int pontoMicroondas2, int contMotocicleta2, int pontoMotocicletas2,
			int contSecadoraRoupas2, int pontoSecadoraRoupas2, Character aguaEncanada2, Integer pontoAguaEncanada2,
			Character ruaPavimentada2, Integer pontoRuaPavimentada2, Instrucao instrucao2, Integer pontoInstrucao2,
			String profissaoChefe2, String empresaChefe2, Integer totalPontos2, String criterio2, Status status2,
			PesquisadorDTO pesquisador, ProjetoDTO projeto, EmpresaDTO empresa) {
		this.idConvidado = idConvidado;
		this.nomeConvidado = nomeConvidado2;
		this.rg = rg2;
		this.dataNascimento = dataNascimento2;
		this.cpf = cpf2;
		this.email = email2;
		this.nacionalidade = nacionalidade2;
		this.tempoMoradia = tempoMoradia2;
		this.idade = idade2;
		this.estadoCivil = estadoCivil2;
		this.temFilhos = temFilhos2;
		this.setQtdeFilhos(qtdeFilhos2);
		this.trabalha = trabalha2;
		this.profissao = profissao2;
		this.estuda = estuda2;
		this.curso = curso2;
		this.faculdade = faculdade2;
		this.contBanheiro = contBanheiro2;
		setPontoBanheiros(contBanheiro);
		this.contMensalista = contMensalista2;
		setPontoMensalista(contMensalista);
		this.contAutomovel = contAutomovel2;
		setPontoAutomovel(contAutomovel);
		this.contMicrocomputador = contMicrocomputador2;
		setPontoMicrocomputador(contMicrocomputador);
		this.contLavaLoucas = contLavaLoucas2;
		setPontoLavaLoucas(contLavaLoucas);
		this.contGeladeira = contGeladeira2;
		setPontoGeladeira(contGeladeira);
		this.contFreezer = contFreezer2;
		setPontoFreezer(contFreezer);
		this.contLavaRoupa = contLavaRoupa2;
		setPontoLavaRoupas(contLavaRoupa);
		this.contDvd = contDvd2;
		setPontoDvd(contDvd);
		this.contMicroondas = contMicroondas2;
		setPontoMicroondas(contMicroondas);
		this.contMotocicleta = contMotocicleta2;
		setPontoMotocicletas(contMotocicleta);
		this.contSecadoraRoupas = contSecadoraRoupas2;
		setPontoSecadoraRoupas(contSecadoraRoupas);
		this.aguaEncanada = aguaEncanada2;
		setPontoAguaEncanada();
		this.ruaPavimentada = ruaPavimentada2;
		setPontoRuaPavimentada();
		this.instrucao = instrucao2;
		setPontoInstrucao();
		this.profissaoChefe = profissaoChefe2;
		this.empresaChefe = empresaChefe2; 
		setTotalPontos();
		setCriterio();
		this.status = status2;
		this.pesquisador = pesquisador;
		this.projeto = projeto;
		this.empresa = empresa;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
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

	public void setPontoBanheiros(int contBanheiro) {
		this.pontoBanheiros = banheiro[contBanheiro];
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

	public void setPontoMensalista(int contMensalista) {
		this.pontoMensalista = mensalista[contMensalista];
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

	public void setPontoAutomovel(int contAutomovel) {
		this.pontoAutomovel = automovel[contAutomovel];
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

	public void setPontoMicrocomputador(int contMicrocomputador) {
		this.pontoMicrocomputador = microcomputador[contMicrocomputador];
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

	public void setPontoLavaLoucas(int contLavaLoucas) {
		this.pontoLavaLoucas = lavaLoucas[contLavaLoucas];
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

	public void setPontoGeladeira(int contGeladeira) {
		this.pontoGeladeira = geladeira[contGeladeira];
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

	public void setPontoFreezer(int contFreezer) {
		this.pontoFreezer = freezer[contFreezer];
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

	public void setPontoLavaRoupas(int contLavaRoupas) {
		this.pontoLavaRoupas = lavaRoupas[contLavaRoupas];
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

	public void setPontoDvd(int contDvd) {
		this.pontoDvd = dvd[contDvd];
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

	public void setPontoMicroondas(int contMicroondas) {
		this.pontoMicroondas = microondas[contMicroondas];
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

	public void setPontoMotocicletas(int contMotocicletas) {
		this.pontoMotocicletas = motocicletas[contMotocicletas];
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

	public void setPontoSecadoraRoupas(int contSecadoraRoupas) {
		this.pontoSecadoraRoupas = secadoraRoupas[contSecadoraRoupas];
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

	public void setPontoAguaEncanada() {
		switch (getAguaEncanada()) {
		case 'S':
			this.pontoAguaEncanada = 4;
			break;
		case 'N':
			this.pontoAguaEncanada = 0;
		}
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

	public void setPontoRuaPavimentada() {
		switch (getRuaPavimentada()) {
		case 'S':
			this.pontoRuaPavimentada = 2;
			break;
		case 'N':
			this.pontoRuaPavimentada = 0;
		}
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

	public void setPontoInstrucao() {
		switch (getInstrucao()) {
		case ANALFABETO_FUNDAMENTAL_I_INCOMPLETO:
			this.pontoInstrucao = 0;
			break;
		case FUNDAMENTAL_I_COMPLETO_FUNDAMENTAL_II_COMPLETO:
			this.pontoInstrucao = 1;
			break;
		case FUNDAMENTAL_II_COMPLETO_MEDIO_INCOMPLETO:
			this.pontoInstrucao = 2;
			break;
		case MEDIO_COMPLETO_SUPERIOR_INCOMPLETO:
			this.pontoInstrucao = 4;
			break;
		case SUPERIOR_COMPLETO:
			this.pontoInstrucao = 7;
			break;
		default:
			this.pontoInstrucao = 0;
		}
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

	public void setTotalPontos() {
		this.totalPontos = getPontoBanheiros() + getPontoMensalista()  
			+ getPontoAutomovel() 
			+ getPontoMicrocomputador() + getPontoLavaLoucas() 
			+ getPontoGeladeira() + getPontoFreezer() + getPontoLavaRoupas() 
			+ getPontoDvd() + getPontoMicroondas() 
			+ getPontoMotocicletas() + getPontoSecadoraRoupas() 
			+ getPontoAguaEncanada() + getPontoRuaPavimentada() 
			+ getPontoInstrucao();
	}

	public String getCriterio() {
		return criterio;
	}

	public void setCriterio() {
		if(getTotalPontos() <= 16) {
			this.criterio = "D/E"; 
		}else if(getTotalPontos() <= 22) {
			this.criterio = "C2"; 
		}else if(getTotalPontos() <= 28) {
			this.criterio = "C1"; 
		}else if(getTotalPontos() <= 37) {
			this.criterio = "B2"; 
		}else if(getTotalPontos() <= 44) {
			this.criterio = "B1";
		}else if(getTotalPontos() <= 100){
			this.criterio = "A";
		}
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ProjetoDTO getProjetoDTO() {
		return projeto;
	}

	public void setProjetoDTO(ProjetoDTO projeto) {
		this.projeto = projeto;
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

	public ArrayList<IdadeFilhos> getIdadesFilhos() {
		return idadeFilhos;
	}

	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}

	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public ArrayList<Carro> getCarros() {
		return carros;
	}
}
