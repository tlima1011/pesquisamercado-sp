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

import com.pesquisamercado.domain.Pesquisador;
import com.pesquisamercado.domain.dto.PesquisadorDTO;
import com.pesquisamercado.services.PesquisadorService;

@RestController
@RequestMapping(value="/pesquisadores")
public class PesquisadorResource {
	
	@Autowired
	private PesquisadorService service; 
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<PesquisadorDTO>> findAll(){
		
		List <Pesquisador> list = service.findAll();
		List<PesquisadorDTO> listDto = list.stream().map(x -> new PesquisadorDTO(x)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody PesquisadorDTO objDto){
		Pesquisador obj = service.fromDTO(objDto); 
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idPesquisador}").buildAndExpand(obj.getIdPesquisador()).toUri(); 
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{idPesquisador}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer idPesquisador){
		service.delete(idPesquisador); 
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{idPesquisador}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody PesquisadorDTO objDto, @PathVariable Integer idPesquisador){
		Pesquisador obj = service.fromDTO(objDto); 
		obj.setIdPesquisador(idPesquisador);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
}

}
