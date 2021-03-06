package com.pesquisamercado.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pesquisamercado.domain.Carro;
import com.pesquisamercado.domain.dto.CarroDTO;
import com.pesquisamercado.exception.ObjectNotFoundException;
import com.pesquisamercado.repositories.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository carroRepository;
	
	public List<Carro> findAll(){
		return carroRepository.findAll(); 
	}
	
	public Carro findById(Integer id) {
		Optional<Carro> obj = carroRepository.findById(id); 
		return obj.orElseThrow(() -> new ObjectNotFoundException("Carro não encontrado"));
	}
	
	public Carro insert(Carro obj) {
		return carroRepository.insert(obj); 
	}
	
	public void delete(Integer id) {
		findById(id);
		carroRepository.deleteById(id);
	}
	
	public Carro update(Carro obj) {
		Carro newObj = findById(obj.getId());
		updateData(newObj, obj);
		return carroRepository.save(newObj);
	}
	
	private void updateData(Carro newObj, Carro obj) {
		newObj.setModelo(obj.getModelo()); 
		newObj.setMarca(obj.getMarca()); 
		newObj.setAno(obj.getAno());
		newObj.setConvidadoDTO(obj.getConvidado());
	}
	
	public Carro fromDTO(CarroDTO objdto) {
		return new Carro(
				objdto.getId(),
				objdto.getModelo(),
				objdto.getMarca(),
				objdto.getAno(),
				objdto.getConvidadoDTO()
		); 
	}
}
