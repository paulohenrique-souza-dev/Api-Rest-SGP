package com.apirest.ApiRest.services;

import com.apirest.ApiRest.entities.Marca;
import com.apirest.ApiRest.repositories.MarcaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MarcaService {

    private final MarcaRepository repository;

    public MarcaService(MarcaRepository repository) {
        this.repository = repository;
    }

    public List<Marca> listarTodas() {
        return repository.findAll();
    }

    public Optional<Marca> buscarPorId(String id) {
        return repository.findById(id);
    }

    public Marca salvar(Marca marca) {
        return repository.save(marca);
    }

    public Marca atualizar(String id, Marca novaMarca) {
        return repository.findById(id)
                .map(m -> {
                    m.setNome(novaMarca.getNome());
                    m.setDescricao(novaMarca.getDescricao());
                    return repository.save(m);
                })
                .orElseThrow(() -> new RuntimeException("Marca não encontrada: " + id));
    }

    public void deletar(String id) {
        repository.deleteById(id);
    }
}

