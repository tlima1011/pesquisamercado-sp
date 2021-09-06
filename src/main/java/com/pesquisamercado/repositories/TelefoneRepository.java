package com.pesquisamercado.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.pesquisamercado.domain.Telefone;

@Repository
public interface TelefoneRepository extends MongoRepository<Telefone, Integer>{
	
}
