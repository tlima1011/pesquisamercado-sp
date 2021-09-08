package com.pesquisamercado.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pesquisamercado.domain.Convidado;

@Repository
public interface ConvidadoRepository extends MongoRepository<Convidado, Integer>{
	
}
