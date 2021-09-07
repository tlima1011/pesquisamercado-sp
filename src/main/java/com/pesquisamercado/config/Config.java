package com.pesquisamercado.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.pesquisamercado.domain.Empresa;
import com.pesquisamercado.domain.Endereco;
import com.pesquisamercado.domain.Idade;
import com.pesquisamercado.domain.Pesquisador;
import com.pesquisamercado.domain.Projeto;
import com.pesquisamercado.domain.Telefone;
import com.pesquisamercado.domain.dto.EmpresaDTO;
import com.pesquisamercado.domain.dto.PesquisadorDTO;
import com.pesquisamercado.enums.EstadoCivil;
import com.pesquisamercado.enums.Status;
import com.pesquisamercado.repositories.EmpresaRepository;
import com.pesquisamercado.repositories.EnderecoRepository;
import com.pesquisamercado.repositories.PesquisadorRepository;
import com.pesquisamercado.repositories.ProjetoRepository;
import com.pesquisamercado.repositories.TelefoneRepository;

@Configuration
public class Config implements CommandLineRunner{
	
	@Autowired 
	private TelefoneRepository telefoneRepository; 
	
	@Autowired
	private EnderecoRepository enderecoRepository; 
	
	@Autowired
	private EmpresaRepository empresaRepository; 
	
	@Autowired
	private ProjetoRepository projetoRepository; 
	
	@Autowired
	private PesquisadorRepository pesquisadorRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy"); 
		formataData.setTimeZone(TimeZone.getTimeZone("GMT"));
		SimpleDateFormat formataDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		formataDataHora.setTimeZone(TimeZone.getTimeZone("GMT")); 
		
		telefoneRepository.deleteAll();
		
		enderecoRepository.deleteAll(); 
		
		empresaRepository.deleteAll();
		
		projetoRepository.deleteAll(); 
		
		pesquisadorRepository.deleteAll(); 
				
		Empresa empr1 = new Empresa(1,"Kyra","Jonana","kyra@kyra.com", Status.ATIVO);
				
		Telefone telefone1 = new Telefone(1, "4441233", new EmpresaDTO (empr1));
		Telefone telefone2 = new Telefone(2, "9998888", new EmpresaDTO (empr1)); 
		
		Endereco endEmpresa1 = new Endereco(1, "Rua Gomes de Carvalho","Vila Olimpia","88","774769", new EmpresaDTO (empr1));
		
		//Integer idProjeto, String numProjeto, String descProjeto, Date dataRecrutamento, Double valorPagar, Double beneficio,
		//Date dataHoraEntrevista, EmpresaDTO empresaDTO
		Projeto proj1 = new Projeto(1, "999987/03", "BomBOM Bom +QD+", formataData.parse("12/02/2021"), 120.00, 60.00,  formataDataHora.parse("15/02/2021 13:00"), new EmpresaDTO (empr1)); 
						
		Pesquisador p1 = new Pesquisador(1,"Joel", formataData.parse("22/05/1982"), Idade.calcularIdade(formataData.parse("22/05/1982")), EstadoCivil.SOLTEIRO, "2223354", "2222","contato2pesquisa@gmeil.com", "senha", Status.ATIVO);
		
		Telefone telPesq1 = new Telefone(3,"11122233", new PesquisadorDTO(p1)); 
		Telefone telPesq2 = new Telefone(4,"962423333", new PesquisadorDTO(p1)); 
		
		Endereco e1 = new Endereco(3, "rua guaicurus","7788","Lapense","33333", new PesquisadorDTO(p1)); 
		
		empr1.getTelefones().addAll(Arrays.asList(telefone1,telefone2));
		empr1.getEnderecos().addAll(Arrays.asList(endEmpresa1)); 	
		empr1.getProjetos().addAll(Arrays.asList(proj1));
		
		p1.getTelefones().addAll(Arrays.asList(telPesq1, telPesq2));	
		
		p1.getEnderecos().addAll(Arrays.asList(e1)); 
		
		telefoneRepository.saveAll(Arrays.asList(telefone1, telefone2, telPesq1, telPesq2));
		
		enderecoRepository.saveAll(Arrays.asList(endEmpresa1, e1)); 
				
		projetoRepository.saveAll(Arrays.asList(proj1));
		
		empresaRepository.saveAll(Arrays.asList(empr1)); 
		
		pesquisadorRepository.saveAll(Arrays.asList(p1)); 
	}
}
