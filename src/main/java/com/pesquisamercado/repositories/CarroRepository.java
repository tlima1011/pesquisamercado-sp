package com.pesquisamercado.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pesquisamercado.domain.Carro;

@Repository
public interface CarroRepository extends MongoRepository<Carro, Integer>{
	
}
