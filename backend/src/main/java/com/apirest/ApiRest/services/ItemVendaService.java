package com.apirest.ApiRest.services;

import com.apirest.ApiRest.entities.ItemVenda;
import com.apirest.ApiRest.repositories.ItemVendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemVendaService {
    private final ItemVendaRepository repository;

    public ItemVendaService(ItemVendaRepository repository) {
        this.repository = repository;
    }

    public List<ItemVenda> listar() { return repository.findAll(); }
    public Optional<ItemVenda> buscar(String id) { return repository.findById(id); }
    public ItemVenda salvar(ItemVenda i) { return repository.save(i); }
    public void deletar(String id) { repository.deleteById(id); }
}
