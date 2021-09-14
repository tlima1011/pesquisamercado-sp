package com.pesquisamercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesquisamercado.domain.Empresa;
import com.pesquisamercado.domain.dto.EmpresaDTO;
import com.pesquisamercado.exception.ObjectNotFoundException;
import com.pesquisamercado.repositories.EmpresaRepository;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	public List<Empresa> findAll(){
		return empresaRepository.findAll(); 
	}
	
	public Empresa findById(Integer id) {
		Optional<Empresa> obj = empresaRepository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Empresa não encontrado"));
	}
	
	public Empresa insert(Empresa obj) {
		return empresaRepository.insert(obj); 
	}
	
	public void delete(Integer idEmpresa) {
		findById(idEmpresa);
		empresaRepository.deleteById(idEmpresa);
	}
	
	public Empresa update(Empresa obj) {
		Empresa newObj = findById(obj.getIdEmpresa());
		updateData(newObj, obj);
		return empresaRepository.save(newObj);
	}
	
	private void updateData(Empresa newObj, Empresa obj) {
		newObj.setNomeEmpresa(obj.getNomeEmpresa()); 
		newObj.setNomeContato(obj.getNomeContato()); 
		newObj.setEmail(obj.getEmail());
		newObj.setStatus(obj.getStatus());	
	}
	
	public Empresa fromDTO(EmpresaDTO objdto) {
		return new Empresa(
				objdto.getIdEmpresa(),
				objdto.getNomeEmpresa(),
				objdto.getNomeContato(),
				objdto.getEmail(),
				objdto.getStatus()
		); 
	}
	
	/*this.logradouro = logradouro;
	this.numero = numero;
	this.bairro = bairro;
	this.cep = cep;*/

}
