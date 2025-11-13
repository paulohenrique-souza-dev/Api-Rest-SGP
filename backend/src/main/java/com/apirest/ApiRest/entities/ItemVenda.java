package com.apirest.ApiRest.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "itens_venda")
public class ItemVenda {

    @Id
    private String id;

    @DBRef
    private Produto produto;

    private Integer quantidade;
    private Double precoUnitario;
    private Double subtotal;

    public ItemVenda() {}

    public ItemVenda(Produto produto, Integer quantidade, Double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.subtotal = quantidade * precoUnitario;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Produto getProduto() { return produto; }
    public void setProduto(Produto produto) { this.produto = produto; }
    public Integer getQuantidade() { return quantidade; }
    public void setQuantidade(Integer quantidade) { this.quantidade = quantidade; }
    public Double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(Double precoUnitario) { this.precoUnitario = precoUnitario; }
    public Double getSubtotal() { return subtotal; }
    public void setSubtotal(Double subtotal) { this.subtotal = subtotal; }
}
