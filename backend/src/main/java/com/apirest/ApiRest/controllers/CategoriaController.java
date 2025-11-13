package com.apirest.ApiRest.controllers;

import com.apirest.ApiRest.entities.Categoria;
import com.apirest.ApiRest.services.CategoriaService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@RestController
@Tag(name = "Categoria", description = "Categoria do Produto")

@RequestMapping("/api/categorias")
@CrossOrigin(origins = "*")
public class CategoriaController {
    private final CategoriaService service;

    public CategoriaController(CategoriaService service) {
        this.service = service;
    }

    @GetMapping public List<Categoria> listar() { return service.listar(); }
    @PostMapping public Categoria criar(@RequestBody Categoria c) { return service.salvar(c); }
    @PutMapping("/{id}") public Categoria atualizar(@PathVariable String id, @RequestBody Categoria c) { return service.atualizar(id, c); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable String id) { service.deletar(id); }
}
