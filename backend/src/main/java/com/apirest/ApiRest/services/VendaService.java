package com.apirest.ApiRest.services;

import com.apirest.ApiRest.entities.Venda;
import com.apirest.ApiRest.repositories.VendaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class VendaService {
    private final VendaRepository repository;

    public VendaService(VendaRepository repository) {
        this.repository = repository;
    }

    public List<Venda> listar() { return repository.findAll(); }
    public Optional<Venda> buscar(String id) { return repository.findById(id); }

    public Venda salvar(Venda v) {
        v.setDataVenda(LocalDateTime.now());
        v.setValorTotal(v.getItens().stream()
                .mapToDouble(i -> i.getSubtotal())
                .sum());
        return repository.save(v);
    }

    public void deletar(String id) { repository.deleteById(id); }
}
