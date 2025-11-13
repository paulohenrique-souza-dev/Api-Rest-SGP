package com.apirest.ApiRest.controllers;

import com.apirest.ApiRest.entities.ItemVenda;
import com.apirest.ApiRest.services.ItemVendaService;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.tags.Tag;

import java.util.List;

@RestController
@Tag(name="Item Venda",description = "Itens vendidos")
@RequestMapping("/api/itensvenda")
@CrossOrigin(origins = "*")
public class ItemVendaController {
    private final ItemVendaService service;

    public ItemVendaController(ItemVendaService service) {
        this.service = service;
    }

    @GetMapping public List<ItemVenda> listar() { return service.listar(); }
    @PostMapping public ItemVenda criar(@RequestBody ItemVenda i) { return service.salvar(i); }
    @DeleteMapping("/{id}") public void deletar(@PathVariable String id) { service.deletar(id); }
}
