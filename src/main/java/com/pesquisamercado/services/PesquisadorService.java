package com.pesquisamercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesquisamercado.domain.Endereco;
import com.pesquisamercado.domain.Pesquisador;
import com.pesquisamercado.domain.dto.EnderecoDTO;
import com.pesquisamercado.domain.dto.PesquisadorDTO;
import com.pesquisamercado.exception.ObjectNotFoundException;
import com.pesquisamercado.repositories.PesquisadorRepository;

@Service
public class PesquisadorService {

	@Autowired
	private PesquisadorRepository pesquisadorRepository;

	public List<Pesquisador> findAll() {
		return pesquisadorRepository.findAll();
	}

	public Pesquisador findById(Integer idPesquisador) {
		Optional<Pesquisador> obj = pesquisadorRepository.findById(idPesquisador);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Telefone não encontrado"));
	}

	public Pesquisador insert(Pesquisador obj) {
		return pesquisadorRepository.insert(obj);
	}

	public void delete(Integer idPesquisador) {
		findById(idPesquisador);
		pesquisadorRepository.deleteById(idPesquisador);
	}

	public Pesquisador update(Pesquisador obj) {
		Pesquisador newObj = findById(obj.getIdPesquisador());
		updateData(newObj, obj);
		return pesquisadorRepository.save(newObj);
	}

	private void updateData(Pesquisador newObj, Pesquisador obj) {
		newObj.setNomePesquisador(obj.getNomePesquisador());
		newObj.setDataNascimento(obj.getDataNascimento());
		newObj.setIdade(obj.getIdade());
		newObj.setEstadoCivil(obj.getEstadoCivil());
		newObj.setCpf(obj.getCpf());
		newObj.setRg(obj.getRg());
		newObj.setEmail(obj.getEmail());
		newObj.setSenha(obj.getSenha());
		newObj.setStatus(obj.getStatus());
	}

	public Pesquisador fromDTO(PesquisadorDTO objdto) {
		return new Pesquisador(objdto.getIdPesquisador(), 
				objdto.getNomePesquisador(), 
				objdto.getDataNascimento(),
				objdto.getIdade(), 
				objdto.getEstadoCivil(), 
				objdto.getCpf(), 
				objdto.getRg(), 
				objdto.getEmail(),
				objdto.getSenha(), 
				objdto.getStatus());
	}

}
