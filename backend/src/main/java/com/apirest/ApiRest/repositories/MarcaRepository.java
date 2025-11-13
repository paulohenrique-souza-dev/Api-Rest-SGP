package com.apirest.ApiRest.repositories;

import com.apirest.ApiRest.entities.Marca;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepository extends MongoRepository<Marca, String> {
}
