package com.pesquisamercado.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.pesquisamercado.domain.Empresa;
import com.pesquisamercado.domain.Endereco;
import com.pesquisamercado.domain.Telefone;
import com.pesquisamercado.domain.dto.EmpresaDTO;
import com.pesquisamercado.enums.Status;
import com.pesquisamercado.repositories.EmpresaRepository;
import com.pesquisamercado.repositories.EnderecoRepository;
import com.pesquisamercado.repositories.TelefoneRepository;

@Configuration
public class Config implements CommandLineRunner{
	
	@Autowired 
	private TelefoneRepository telefoneRepository; 
	
	@Autowired
	private EnderecoRepository enderecoRepository; 
	
	@Autowired
	private EmpresaRepository empresaRepository; 
	
	@Override
	public void run(String... args) throws Exception {
		
		telefoneRepository.deleteAll();
		
		enderecoRepository.deleteAll(); 
		
		empresaRepository.deleteAll();
		
		Empresa empr1 = new Empresa(1,"Kyra","Jonana","kyra@kyra.com", Status.ATIVO);
				
		Telefone telefone1 = new Telefone(1, "4441233", new EmpresaDTO (empr1));
		Telefone telefone2 = new Telefone(2, "9998888", new EmpresaDTO (empr1)); 
		
		Endereco endEmpresa1 = new Endereco(1, "Rua Gomes de Carvalho","Vila Olimpia","88","774769", new EmpresaDTO (empr1));
						
		telefoneRepository.saveAll(Arrays.asList(telefone1, telefone2));
		
		enderecoRepository.saveAll(Arrays.asList(endEmpresa1)); 
				
		empr1.getTelefones().addAll(Arrays.asList(telefone1,telefone2));
		empr1.getEnderecos().addAll(Arrays.asList(endEmpresa1)); 
//		empr1.addEndereco(endEmpresa1);
//		empr1.addTelefone(telefone1);
//		empr1.addTelefone(telefone2);
		empresaRepository.saveAll(Arrays.asList(empr1)); 
		
		
		
		
	}
}
