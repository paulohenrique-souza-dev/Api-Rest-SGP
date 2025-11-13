package com.apirest.ApiRest.services;

import com.apirest.ApiRest.entities.Categoria;
import com.apirest.ApiRest.repositories.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {
    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    public List<Categoria> listar() { return repository.findAll(); }
    public Optional<Categoria> buscar(String id) { return repository.findById(id); }
    public Categoria salvar(Categoria c) { return repository.save(c); }
    public Categoria atualizar(String id, Categoria c) {
        return repository.findById(id).map(cat -> {
            cat.setNome(c.getNome());
            cat.setDescricao(c.getDescricao());
            return repository.save(cat);
        }).orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
    }
    public void deletar(String id) { repository.deleteById(id); }
}
