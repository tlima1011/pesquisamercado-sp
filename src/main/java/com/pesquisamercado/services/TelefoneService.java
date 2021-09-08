package com.pesquisamercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesquisamercado.domain.Telefone;
import com.pesquisamercado.domain.dto.TelefoneDTO;
import com.pesquisamercado.exception.ObjectNotFoundException;
import com.pesquisamercado.repositories.TelefoneRepository;

@Service
public class TelefoneService {
	
	@Autowired
	private TelefoneRepository telefoneRepository;
	
	public List<Telefone> findAll(){
		return telefoneRepository.findAll(); 
	}
	
	public Telefone findById(Integer id) {
		Optional<Telefone> obj = telefoneRepository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Telefone não encontrado"));
	}
	
	public Telefone insert(Telefone obj) {
		return telefoneRepository.insert(obj); 
	}
	
	public void delete(Integer id) {
		findById(id);
		telefoneRepository.deleteById(id);
	}
	
	public Telefone update(Telefone obj) {
		Telefone newObj = findById(obj.getId());
		updateData(newObj, obj);
		return telefoneRepository.save(newObj);
	}
	
	private void updateData(Telefone newObj, Telefone obj) {
		newObj.setNumero(obj.getNumero());	
	}
	
	public Telefone fromDTO(TelefoneDTO objdto) {
		return new Telefone(
				objdto.getId(),
				objdto.getNumero(), 
				objdto.getEmpresaDTO()
				); 
	}

}
