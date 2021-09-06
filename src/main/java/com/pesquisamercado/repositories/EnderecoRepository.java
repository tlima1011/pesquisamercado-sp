package com.pesquisamercado.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pesquisamercado.domain.Endereco;

@Repository
public interface EnderecoRepository extends MongoRepository<Endereco, Integer>{
	
}
