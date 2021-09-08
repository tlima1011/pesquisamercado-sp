package com.pesquisamercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesquisamercado.domain.Empresa;
import com.pesquisamercado.domain.IdadeFilhos;
import com.pesquisamercado.domain.dto.EmpresaDTO;
import com.pesquisamercado.domain.dto.IdadeFilhosDTO;
import com.pesquisamercado.exception.ObjectNotFoundException;
import com.pesquisamercado.repositories.IdadeFilhosRepository;

@Service
public class IdadeFilhosService {
	
	@Autowired
	private IdadeFilhosRepository idadeFilhosRepository;
	
	public List<IdadeFilhos> findAll(){
		return idadeFilhosRepository.findAll(); 
	}
	
	public IdadeFilhos findById(Integer id) {
		Optional<IdadeFilhos> obj = idadeFilhosRepository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Idade dos filhos não encontrado"));
	}
	
	public IdadeFilhos insert(IdadeFilhos obj) {
		return idadeFilhosRepository.insert(obj); 
	}
	
	public void delete(Integer id) {
		findById(id);
		idadeFilhosRepository.deleteById(id);
	}
	
	public IdadeFilhos update(IdadeFilhos obj) {
		IdadeFilhos newObj = findById(obj.getId());
		updateData(newObj, obj);
		return idadeFilhosRepository.save(newObj);
	}
	
	private void updateData(IdadeFilhos newObj, IdadeFilhos obj) {
		newObj.setId(obj.getId()); 
		newObj.setIdade(obj.getIdade()); 
		newObj.setConvidadoDTO(obj.getConvidadoDTO()); 

	}
	
	public IdadeFilhos fromDTO(IdadeFilhosDTO objdto) {
		return new IdadeFilhos(
				objdto.getId(),
				objdto.getIdade(),
				objdto.getConvidadoDTO()
				); 
	}
	
	/*this.logradouro = logradouro;
	this.numero = numero;
	this.bairro = bairro;
	this.cep = cep;*/

}
