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

import com.pesquisamercado.domain.Carro;
import com.pesquisamercado.domain.dto.CarroDTO;
import com.pesquisamercado.services.CarroService;

@RestController
@RequestMapping(value="/carros")
public class CarroResource {
	
	@Autowired
	private CarroService service; 
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<CarroDTO>> findAll(){
		List <Carro> list = service.findAll();
		List<CarroDTO> listDto = list.stream().map(x -> new CarroDTO(x)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	public ResponseEntity<Carro> findById(@PathVariable Integer id){
		Carro obj = service.findById(id); 
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody CarroDTO objDto){
		Carro obj = service.fromDTO(objDto); 
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
	public ResponseEntity<Void> update(@RequestBody CarroDTO objDto, @PathVariable Integer id){
		Carro obj = service.fromDTO(objDto); 
		obj.setId(id);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
}
