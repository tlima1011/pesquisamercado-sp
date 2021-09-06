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

import com.pesquisamercado.domain.Telefone;
import com.pesquisamercado.domain.dto.TelefoneDTO;
import com.pesquisamercado.services.TelefoneService;

@RestController
@RequestMapping(value="/telefones")
public class TelefoneResource {
	
	@Autowired
	private TelefoneService service; 
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<TelefoneDTO>> findAll(){
		
		List <Telefone> list = service.findAll();
		List<TelefoneDTO> listDto = list.stream().map(x -> new TelefoneDTO(x)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody TelefoneDTO objDto){
		Telefone obj = service.fromDTO(objDto); 
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
	public ResponseEntity<Void> update(@RequestBody TelefoneDTO objDto, @PathVariable Integer id){
		Telefone obj = service.fromDTO(objDto); 
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
}
