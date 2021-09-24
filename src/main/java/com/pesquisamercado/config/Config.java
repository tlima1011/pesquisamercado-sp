package com.pesquisamercado.config;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.pesquisamercado.domain.Carro;
import com.pesquisamercado.domain.Convidado;
import com.pesquisamercado.domain.Empresa;
import com.pesquisamercado.domain.Endereco;
import com.pesquisamercado.domain.Idade;
import com.pesquisamercado.domain.IdadeFilhos;
import com.pesquisamercado.domain.Pesquisador;
import com.pesquisamercado.domain.Projeto;
import com.pesquisamercado.domain.Telefone;
import com.pesquisamercado.domain.dto.ConvidadoDTO;
import com.pesquisamercado.domain.dto.EmpresaDTO;
import com.pesquisamercado.domain.dto.PesquisadorDTO;
import com.pesquisamercado.domain.dto.ProjetoDTO;
import com.pesquisamercado.enums.EstadoCivil;
import com.pesquisamercado.enums.Instrucao;
import com.pesquisamercado.enums.Status;
import com.pesquisamercado.repositories.CarroRepository;
import com.pesquisamercado.repositories.ConvidadoRepository;
import com.pesquisamercado.repositories.EmpresaRepository;
import com.pesquisamercado.repositories.EnderecoRepository;
import com.pesquisamercado.repositories.IdadeFilhosRepository;
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
	
	@Autowired
	private ConvidadoRepository convidadoRepository; 
	
	@Autowired
	private IdadeFilhosRepository idadeFilhosRepository; 
	
	@Autowired 
	private CarroRepository carroRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy"); 
		DateTimeFormatter formatadorData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		formataData.setTimeZone(TimeZone.getTimeZone("GMT"));
		SimpleDateFormat formataDataHora = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		formataDataHora.setTimeZone(TimeZone.getTimeZone("GMT")); 
		
		telefoneRepository.deleteAll();
		
		enderecoRepository.deleteAll(); 
		
		empresaRepository.deleteAll();
		
		projetoRepository.deleteAll(); 
		
		pesquisadorRepository.deleteAll(); 
		
		convidadoRepository.deleteAll(); 
		
		idadeFilhosRepository.deleteAll(); 
	
		carroRepository.deleteAll();  
		
		Empresa empr1 = new Empresa(1,"Kyra","Jonana","kyra@kyra.com", Status.ATIVO);
				
		Telefone telefone1 = new Telefone(1, "4441233", new EmpresaDTO (empr1));
		Telefone telefone2 = new Telefone(2, "9998888", new EmpresaDTO (empr1)); 
		
		Endereco endEmpresa1 = new Endereco(1, "Rua Gomes de Carvalho","Vila Olimpia","88","774769", new EmpresaDTO (empr1));
		
		LocalDate nascimento = LocalDate.parse("1982-05-22"); 
		
		Pesquisador p1 = new Pesquisador(1,"Joel", LocalDate.parse("1982-05-22"), Idade.calcularIdade(LocalDate.parse("22/05/1982", formatadorData)), EstadoCivil.SOLTEIRO, "2223354", "2222","contato2pesquisa@gmeil.com", "senha", Status.ATIVO);
		
		Projeto proj1 = new Projeto(1, "999987/03", "BomBOM Bom +QD+", formataData.parse("12/02/2021"), 120.00, 60.00,  formataDataHora.parse("15/02/2021 13:00"), new EmpresaDTO (empr1), new PesquisadorDTO(p1));
		
		Telefone telPesq1 = new Telefone(3,"11122233", new PesquisadorDTO(p1)); 
		Telefone telPesq2 = new Telefone(4,"962423333", new PesquisadorDTO(p1)); 
		
		Endereco e1 = new Endereco(2, "Rua guaicurus","7788","Lapense","33333", new PesquisadorDTO(p1)); 
				
		empr1.getTelefones().addAll(Arrays.asList(telefone1,telefone2));
		empr1.getEnderecos().addAll(Arrays.asList(endEmpresa1)); 	
		empr1.getProjetos().addAll(Arrays.asList(proj1));
		
		p1.getTelefones().addAll(Arrays.asList(telPesq1, telPesq2));	
		p1.getEnderecos().addAll(Arrays.asList(e1)); 
		p1.getProjetos().addAll(Arrays.asList(proj1));
		p1.getEmpresas().addAll(Arrays.asList(empr1)); 
		
		LocalDate nasc = LocalDate.parse("2001-04-01");
		
		Convidado c1 = new Convidado(
				1,"Luis Astolfo", "777777778", nasc, "9964568", "luismane@gkmail.net",
				"Brasileiro", "15 anos", Idade.calcularIdade(nasc),EstadoCivil.CASADO,
				'S',2,'S',"Auxiliar Administrativo", 'S',"Medicina","Uninove", 1, 1,
				1, 1, 2, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1,
				'S', 'S', Instrucao.MEDIO_COMPLETO_SUPERIOR_INCOMPLETO, "Oficial Administrativo","Itau", Status.ATIVO, new PesquisadorDTO(p1), new ProjetoDTO(proj1), new EmpresaDTO(empr1));
		
		LocalDate nasc1 = LocalDate.parse("1955-07-22");
		
		Convidado c = new Convidado(
				2,"Joao Penca", "777777778", nasc1, "222222", "joaoapenca@gkmal.com",
				"Brasileiro", "30 anos", Idade.calcularIdade(nasc1),EstadoCivil.SOLTEIRO,
				'N',0,'S',"Programador jr", 'N',"-","-", 3, 0,
				1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1,
				'S', 'S', Instrucao.SUPERIOR_COMPLETO, "Analista","-", Status.ATIVO, new PesquisadorDTO(p1), new ProjetoDTO(proj1), new EmpresaDTO(empr1)); 
		
		IdadeFilhos i1 = new IdadeFilhos(1, "3", new ConvidadoDTO(c1)); 
		IdadeFilhos i2 = new IdadeFilhos(2, "5", new ConvidadoDTO(c1));
		Carro carro1 = new Carro(1, "Uno", "Fiat", 2010, new ConvidadoDTO(c1));
		Telefone t1 = new Telefone(5,"11122233", new ConvidadoDTO(c1)); 
		Telefone t2 = new Telefone(6,"962423333", new ConvidadoDTO(c1));
		
		//Integer id, String logradouro,  String bairro, String numero, String cep, ConvidadoDTO convidadoDTO
		Endereco endConv1 = new Endereco(3,"Rua Joao Cabreuva","Cidade Tiradentes", "88", "22222", new ConvidadoDTO(c1));
		
		proj1.getConvidados().addAll(Arrays.asList(c1,c));
		
		p1.getConvidados().addAll(Arrays.asList(c1,c)); 
		empr1.getConvidados().addAll(Arrays.asList(c1,c)); 
		c1.getEnderecos().addAll(Arrays.asList(endConv1));
		c1.getTelefones().addAll(Arrays.asList(t1, t2)); 
		c1.getCarros().addAll(Arrays.asList(carro1)); 
		c1.getIdadesFilhos().addAll(Arrays.asList(i1, i2));
				
		idadeFilhosRepository.saveAll(Arrays.asList(i1, i2)); 
		
		telefoneRepository.saveAll(Arrays.asList(telefone1, telefone2, telPesq1, telPesq2, t1, t2));
		
		enderecoRepository.saveAll(Arrays.asList(e1, endEmpresa1, endConv1));  
		
		projetoRepository.saveAll(Arrays.asList(proj1));
		
		empresaRepository.saveAll(Arrays.asList(empr1)); 
		
		pesquisadorRepository.saveAll(Arrays.asList(p1)); 
		
		carroRepository.saveAll(Arrays.asList(carro1)); 
		
		convidadoRepository.saveAll(Arrays.asList(c1,c)); 
	}
}
