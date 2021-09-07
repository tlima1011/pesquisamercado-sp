package com.pesquisamercado.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pesquisamercado.domain.IdadeFilhos;

@Repository
public interface IdadeFilhosRepository extends MongoRepository<IdadeFilhos, Integer>{
	
}
