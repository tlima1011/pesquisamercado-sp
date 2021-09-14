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
import com.pesquisamercado.domain.IdadeFilhos;
import com.pesquisamercado.domain.dto.EnderecoDTO;
import com.pesquisamercado.domain.dto.IdadeFilhosDTO;
import com.pesquisamercado.services.IdadeFilhosService;

@RestController
@RequestMapping(value="/idadeFilhos")
public class IdadeFilhosResource {
	
	@Autowired
	private IdadeFilhosService service; 
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<IdadeFilhosDTO>> findAll(){
		
		List <IdadeFilhos> list = service.findAll();
		List<IdadeFilhosDTO> listDto = list.stream().map(x -> new IdadeFilhosDTO(x)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<IdadeFilhosDTO> findById(@PathVariable Integer id){
		IdadeFilhos obj = service.findById(id); 
		return ResponseEntity.ok().body(new IdadeFilhosDTO(obj));
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody IdadeFilhosDTO objDto){
		IdadeFilhos obj = service.fromDTO(objDto); 
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri(); 
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id); 
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody IdadeFilhosDTO objDto, @PathVariable Integer id){
		IdadeFilhos obj = service.fromDTO(objDto); 
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}

}
