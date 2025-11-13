package com.apirest.ApiRest.repositories;

import com.apirest.ApiRest.entities.ItemVenda;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemVendaRepository extends MongoRepository<ItemVenda, String> {
}
