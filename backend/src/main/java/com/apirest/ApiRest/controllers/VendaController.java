package com.apirest.ApiRest.controllers;

import com.apirest.ApiRest.entities.Venda;
import com.apirest.ApiRest.services.VendaService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;

@RestController
@Tag(name="Vendas",description = "Vendas Realizadas")
@RequestMapping("/api/vendas")
@CrossOrigin(origins = "*")
public class VendaController {
    private final VendaService service;

    public VendaController(VendaService service) {
        this.service = service;
    }

    @GetMapping public List<Venda> listar() { return service.listar(); }
    @PostMapping public Venda criar(@RequestBody Venda v) { return service.salvar(v); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable String id) { service.deletar(id); }
}
