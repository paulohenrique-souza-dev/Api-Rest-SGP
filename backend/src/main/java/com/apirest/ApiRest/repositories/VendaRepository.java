package com.apirest.ApiRest.repositories;

import com.apirest.ApiRest.entities.Venda;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository extends MongoRepository<Venda, String> {
}
