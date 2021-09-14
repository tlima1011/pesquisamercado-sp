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
import com.pesquisamercado.domain.Convidado;
import com.pesquisamercado.domain.dto.ConvidadoDTO;
import com.pesquisamercado.services.ConvidadoService;


@RestController
@RequestMapping(value="/convidados")
public class ConvidadoResource {
	
	@Autowired
	private ConvidadoService service; 
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<ConvidadoDTO>> findAll(){
		List <Convidado> list = service.findAll();
		List<ConvidadoDTO> listDto = list.stream().map(x -> new ConvidadoDTO(x)).collect(Collectors.toList()); 
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value="/{idConvidado}", method=RequestMethod.GET)
	public ResponseEntity<ConvidadoDTO> findById(@PathVariable Integer idConvidado){
		Convidado obj = service.findById(idConvidado); 
		return ResponseEntity.ok().body(new ConvidadoDTO(obj));
	}
		
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody ConvidadoDTO objDto){
		Convidado obj = service.fromDTO(objDto); 
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{idConvidado}").buildAndExpand(obj.getIdConvidado()).toUri(); 
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{idConvidado}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer idConvidado){
		service.delete(idConvidado); 
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/{idConvidado}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody ConvidadoDTO objDto, @PathVariable Integer idConvidado){
		Convidado obj = service.fromDTO(objDto); 
		obj.setIdConvidado(idConvidado);
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}

}
