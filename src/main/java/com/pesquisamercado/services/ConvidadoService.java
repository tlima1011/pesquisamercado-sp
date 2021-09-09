package com.pesquisamercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesquisamercado.domain.Convidado;
import com.pesquisamercado.domain.dto.ConvidadoDTO;
import com.pesquisamercado.exception.ObjectNotFoundException;
import com.pesquisamercado.repositories.ConvidadoRepository;

@Service
public class ConvidadoService {
	
	@Autowired
	private ConvidadoRepository convidadoRepository;
	
	public List<Convidado> findAll(){
		return convidadoRepository.findAll(); 
	}
	
	public Convidado findById(Integer idConvidado) {
		Optional<Convidado> obj = convidadoRepository.findById(idConvidado); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Convidado não encontrado"));
	}
	
	public Convidado insert(Convidado obj) {
		return convidadoRepository.insert(obj); 
	}
	
	public void delete(Integer idConvidado) {
		findById(idConvidado);
		convidadoRepository.deleteById(idConvidado);
	}
	
	public Convidado update(Convidado obj) {
		Convidado newObj = findById(obj.getIdConvidado());
		updateData(newObj, obj);
		return convidadoRepository.save(newObj);
	}
	
	private void updateData(Convidado newObj, Convidado obj) {
		newObj.setNomeConvidado(obj.getNomeConvidado()); 
		newObj.setRg(obj.getRg()); 
		newObj.setDataNascimento(obj.getDataNascimento()); 
		newObj.setCpf(obj.getCpf()); 
		newObj.setEmail(obj.getEmail()); 
		newObj.setNacionalidade(obj.getNacionalidade()); 
		newObj.setTempoMoradia(obj.getTempoMoradia()); 
		newObj.setIdade(obj.getIdade()); 
		newObj.setEstadoCivil(obj.getEstadoCivil()); 
		newObj.setTemFilhos(obj.getTemFilhos()); 
		newObj.setTrabalha(obj.getTrabalha()); 
		newObj.setQtdeFilhos(obj.getQtdeFilhos());
		newObj.setFaculdade(obj.getFaculdade()); 
		newObj.setCurso(obj.getCurso());
		newObj.setProfissao(obj.getProfissao());
		newObj.setEstuda(obj.getEstuda());
		newObj.setContBanheiro(obj.getContBanheiro());
		newObj.setPontoBanheiros(obj.getPontoBanheiros());
		newObj.setContMensalista(obj.getContMensalista());
		newObj.setPontoMensalista(obj.getPontoMensalista());
		newObj.setContAutomovel(obj.getContAutomovel());
		newObj.setPontoAutomovel(obj.getPontoAutomovel());
		newObj.setContMicrocomputador(obj.getContMicrocomputador());
		newObj.setPontoMicrocomputador(obj.getPontoMicrocomputador());
		newObj.setContLavaLoucas(obj.getContLavaLoucas());
		newObj.setPontoLavaLoucas(obj.getPontoLavaLoucas());
		newObj.setContGeladeira(obj.getContGeladeira());
		newObj.setPontoGeladeira(obj.getPontoGeladeira());
		newObj.setContFreezer(obj.getContFreezer());
		newObj.setPontoFreezer(obj.getPontoFreezer());
		newObj.setContLavaRoupa(obj.getContLavaRoupa());
		newObj.setPontoLavaRoupas(obj.getPontoLavaRoupas());
		newObj.setContDvd(obj.getContDvd());
		newObj.setPontoDvd(obj.getPontoDvd());
		newObj.setContMicroondas(obj.getContMicroondas());
		newObj.setPontoMicroondas(obj.getPontoMicroondas());
		newObj.setContMotocicleta(obj.getContMotocicleta());
		newObj.setPontoMotocicletas(obj.getPontoMotocicletas());
		newObj.setContSecadoraRoupas(obj.getContSecadoraRoupas());
		newObj.setPontoSecadoraRoupas(obj.getPontoSecadoraRoupas());
		newObj.setAguaEncanada(obj.getAguaEncanada());
		newObj.setPontoAguaEncanada();
		newObj.setRuaPavimentada(obj.getRuaPavimentada());
		newObj.setPontoRuaPavimentada();
		newObj.setInstrucao(obj.getInstrucao());
		newObj.setPontoInstrucao();
		newObj.setProfissaoChefe(obj.getProfissaoChefe());
		newObj.setEmpresaChefe(obj.getEmpresaChefe()); 
		newObj.setTotalPontos();
		newObj.setCriterio();
		newObj.setStatus(obj.getStatus());
		newObj.setPesquisadorDTO(obj.getPesquisadorDTO()); 
		newObj.setProjetoDTO(obj.getProjetoDTO());
		newObj.setEmpresaDTO(obj.getEmpresaDTO());
	}
	
	public Convidado fromDTO(ConvidadoDTO objdto) {
		return new Convidado(
				objdto.getIdConvidado(),
				objdto.getNomeConvidado(),
				objdto.getRg(), 
				objdto.getDataNascimento(),
				objdto.getCpf(),
				objdto.getEmail(),
				objdto.getNacionalidade(), 
				objdto.getTempoMoradia(), 
				objdto.getIdade(),  
				objdto.getEstadoCivil(), 
				objdto.getTemFilhos(), 
				objdto.getQtdeFilhos(), 
				objdto.getTrabalha(), 
				objdto.getFaculdade(),  
				objdto.getCurso(), 
				objdto.getProfissao(), 
				objdto.getEstuda(), 
				objdto.getContBanheiro(), 
				objdto.getPontoBanheiros(), 
				objdto.getContMensalista(), 
				objdto.getPontoMensalista(),
				objdto.getContAutomovel(), 
				objdto.getPontoAutomovel(), 
				objdto.getContMicrocomputador(), 
				objdto.getPontoMicrocomputador(), 
				objdto.getContLavaLoucas(), 
				objdto.getPontoLavaLoucas(), 
				objdto.getContGeladeira(), 
				objdto.getPontoGeladeira(),
				objdto.getContFreezer(), 
				objdto.getPontoFreezer(), 
				objdto.getContLavaRoupa(),
				objdto.getPontoLavaRoupas(), 
				objdto.getContDvd(), 
				objdto.getPontoDvd(), 
				objdto.getContMicroondas(), 
				objdto.getPontoMicroondas(), 
				objdto.getContMotocicleta(), 
				objdto.getPontoMotocicletas(), 
				objdto.getContSecadoraRoupas(),
				objdto.getPontoSecadoraRoupas(), 
				objdto.getAguaEncanada(), 
				objdto.getPontoAguaEncanada(), 
				objdto.getRuaPavimentada(), 
				objdto.getPontoRuaPavimentada(), 
				objdto.getInstrucao(),
				objdto.getPontoInstrucao(), 
				objdto.getProfissaoChefe(),
				objdto.getEmpresaChefe(),  
				objdto.getTotalPontos(),
				objdto.getCriterio(),
				objdto.getStatus(),
				objdto.getPesquisadorDTO(), 
				objdto.getProjetoDTO(), 
				objdto.getEmpresaDTO()
				); 
		}
}
