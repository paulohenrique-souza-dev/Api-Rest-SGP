package com.apirest.ApiRest.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "produtos")
public class Produto {

    @Id
    private String id;
    private String nome;
    private Double preco;
    private Integer estoque;

    @DBRef
    private Categoria categoria;

    @DBRef
    private Marca marca;

    public Produto() {}

    public Produto(String nome, Double preco, Integer estoque, Categoria categoria, Marca marca) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }
    public Integer getEstoque() { return estoque; }
    public void setEstoque(Integer estoque) { this.estoque = estoque; }
    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
    public Marca getMarca() { return marca; }
    public void setMarca(Marca marca) { this.marca = marca; }
}
