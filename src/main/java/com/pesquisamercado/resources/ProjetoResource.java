package com.pesquisamercado.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.pesquisamercado.domain.Endereco;
import com.pesquisamercado.domain.Projeto;
import com.pesquisamercado.domain.dto.EnderecoDTO;
import com.pesquisamercado.domain.dto.ProjetoDTO;
import com.pesquisamercado.services.EnderecoService;
import com.pesquisamercado.services.ProjetoService;

public class ProjetoResource {
	
	@RestController
	@RequestMapping(value="/projetos")
	public class EnderecoResource {
		
		@Autowired
		private ProjetoService service; 
		
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<List<ProjetoDTO>> findAll(){
			
			List <Projeto> list = service.findAll();
			List<ProjetoDTO> listDto = list.stream().map(x -> new ProjetoDTO(x)).collect(Collectors.toList()); 
			return ResponseEntity.ok().body(listDto);
		}
		
		@RequestMapping(method=RequestMethod.POST)
		public ResponseEntity<Void> insert(@RequestBody ProjetoDTO objDto){
			Projeto obj = service.fromDTO(objDto); 
			obj = service.insert(obj);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getIdProjeto()).toUri(); 
			return ResponseEntity.created(uri).build();
		}
		
		@RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
		public ResponseEntity<Void> delete(@PathVariable Integer idProjeto){
			service.delete(idProjeto); 
			return ResponseEntity.noContent().build();
		}
		
		@RequestMapping(value = "/{id}", method=RequestMethod.PUT)
		public ResponseEntity<Void> update(@RequestBody ProjetoDTO objDto, @PathVariable Integer idProjeto){
			Projeto obj = service.fromDTO(objDto); 
			obj.setIdProjeto(idProjeto);
			obj = service.update(obj);
			return ResponseEntity.noContent().build();
		}
	
	}
}
