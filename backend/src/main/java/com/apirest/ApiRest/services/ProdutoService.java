package com.apirest.ApiRest.services;

import com.apirest.ApiRest.entities.Produto;
import com.apirest.ApiRest.repositories.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listar() { return repository.findAll(); }
    public Optional<Produto> buscar(String id) { return repository.findById(id); }
    public Produto salvar(Produto p) { return repository.save(p); }
    public Produto atualizar(String id, Produto p) {
        return repository.findById(id).map(prod -> {
            prod.setNome(p.getNome());
            prod.setPreco(p.getPreco());
            prod.setEstoque(p.getEstoque());
            prod.setCategoria(p.getCategoria());
            prod.setMarca(p.getMarca());
            return repository.save(prod);
        }).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }
    public void deletar(String id) { repository.deleteById(id); }
}
