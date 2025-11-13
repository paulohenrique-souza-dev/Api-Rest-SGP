package com.apirest.ApiRest.repositories;

import com.apirest.ApiRest.entities.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends MongoRepository<Categoria, String> {
}
