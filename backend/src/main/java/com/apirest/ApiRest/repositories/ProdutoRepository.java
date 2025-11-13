package com.apirest.ApiRest.repositories;

import com.apirest.ApiRest.entities.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
