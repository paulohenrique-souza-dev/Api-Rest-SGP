package com.apirest.ApiRest.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "vendas")
public class Venda {

    @Id
    private String id;

    @DBRef
    private Cliente cliente;

    private LocalDateTime dataVenda;
    private Double valorTotal;

    @DBRef
    private List<ItemVenda> itens;

    public Venda() {}

    public Venda(Cliente cliente, LocalDateTime dataVenda, Double valorTotal, List<ItemVenda> itens) {
        this.cliente = cliente;
        this.dataVenda = dataVenda;
        this.valorTotal = valorTotal;
        this.itens = itens;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Cliente getCliente() { return cliente; }
    public void setCliente(Cliente cliente) { this.cliente = cliente; }
    public LocalDateTime getDataVenda() { return dataVenda; }
    public void setDataVenda(LocalDateTime dataVenda) { this.dataVenda = dataVenda; }
    public Double getValorTotal() { return valorTotal; }
    public void setValorTotal(Double valorTotal) { this.valorTotal = valorTotal; }
    public List<ItemVenda> getItens() { return itens; }
    public void setItens(List<ItemVenda> itens) { this.itens = itens; }
}
