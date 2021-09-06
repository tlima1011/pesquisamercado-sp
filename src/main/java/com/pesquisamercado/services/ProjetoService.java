package com.pesquisamercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesquisamercado.domain.Projeto;
import com.pesquisamercado.domain.dto.ProjetoDTO;
import com.pesquisamercado.exception.ObjectNotFoundException;
import com.pesquisamercado.repositories.ProjetoRepository;

@Service
public class ProjetoService {
	
	@Autowired
	private ProjetoRepository projetoRepository;
	
	public List<Projeto> findAll(){
		return projetoRepository.findAll(); 
	}
	
	public Projeto findById(Integer idProjeto) {
		Optional<Projeto> obj = projetoRepository.findById(idProjeto); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Projeto não encontrado"));
	}
	
	public Projeto insert(Projeto obj) {
		return projetoRepository.insert(obj); 
	}
	
	public void delete(Integer idProjeto) {
		findById(idProjeto);
		projetoRepository.deleteById(idProjeto);
	}
	
	public Projeto update(Projeto obj) {
		Projeto newObj = findById(obj.getIdProjeto());
		updateData(newObj, obj);
		return projetoRepository.save(newObj);
	}
	
	private void updateData(Projeto newObj, Projeto obj) {
		newObj.setNumProjeto(obj.getNumProjeto()); 
		newObj.setDescProjeto(obj.getDescProjeto()); 
		newObj.setDataRecrutamento(obj.getDataRecrutamento());
		newObj.setValorPagar(obj.getValorPagar());
		newObj.setBeneficio(obj.getBeneficio());
		newObj.setDataHoraEntrevista(obj.getDataHoraEntrevista());
		newObj.setEmpresaDTO(obj.getEmpresaDTO());
	}
	
	public Projeto fromDTO(ProjetoDTO objdto) {
		return new Projeto(
				objdto.getIdProjeto(),
				objdto.getNumProjeto(),
				objdto.getDescProjeto(),
				objdto.getDataRecrutamento(),
				objdto.getValorPagar(), 
				objdto.getBeneficio(), 
				objdto.getDataHoraEntrevista(),
				objdto.getEmpresaDTO()
				); 
	}
	
	/*this.logradouro = logradouro;
	this.numero = numero;
	this.bairro = bairro;
	this.cep = cep;*/

}
