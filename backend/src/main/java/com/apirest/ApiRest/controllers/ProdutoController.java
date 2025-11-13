package com.apirest.ApiRest.controllers;

import com.apirest.ApiRest.entities.Produto;
import com.apirest.ApiRest.services.ProdutoService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@Tag(name = "Produtos", description = "CRUD de Produtos do sistema")
@RequestMapping("/api/produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {
    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @GetMapping public List<Produto> listar() { return service.listar(); }
    @PostMapping public Produto criar(@RequestBody Produto p) { return service.salvar(p); }
    @PutMapping("/{id}") public Produto atualizar(@PathVariable String id, @RequestBody Produto p) { return service.atualizar(id, p); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable String id) { service.deletar(id); }
}
