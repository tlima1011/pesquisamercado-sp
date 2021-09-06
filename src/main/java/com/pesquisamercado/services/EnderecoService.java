package com.pesquisamercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesquisamercado.domain.Endereco;
import com.pesquisamercado.domain.Telefone;
import com.pesquisamercado.domain.dto.EnderecoDTO;
import com.pesquisamercado.domain.dto.TelefoneDTO;
import com.pesquisamercado.exception.ObjectNotFoundException;
import com.pesquisamercado.repositories.EnderecoRepository;
import com.pesquisamercado.repositories.TelefoneRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public List<Endereco> findAll(){
		return enderecoRepository.findAll(); 
	}
	
	public Endereco findById(Integer id) {
		Optional<Endereco> obj = enderecoRepository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Telefone não encontrado"));
	}
	
	public Endereco insert(Endereco obj) {
		return enderecoRepository.insert(obj); 
	}
	
	public void delete(Integer id) {
		findById(id);
		enderecoRepository.deleteById(id);
	}
	
	public Endereco update(Endereco obj) {
		Endereco newObj = findById(obj.getId());
		updateData(newObj, obj);
		return enderecoRepository.save(newObj);
	}
	
	private void updateData(Endereco newObj, Endereco obj) {
		newObj.setLogradouro(obj.getLogradouro()); 
		newObj.setNumero(obj.getNumero()); 
		newObj.setBairro(obj.getBairro());
		newObj.setCep(obj.getCep());	
		newObj.setEmpresaDTO(obj.getEmpresaDTO());
	}
	
	public Endereco fromDTO(EnderecoDTO objdto) {
		return new Endereco(
				objdto.getId(),
				objdto.getLogradouro(),
				objdto.getNumero(),
				objdto.getBairro(),
				objdto.getCep(), 
				objdto.getEmpresaDTO()
				); 
	}
	
	/*this.logradouro = logradouro;
	this.numero = numero;
	this.bairro = bairro;
	this.cep = cep;*/

}
