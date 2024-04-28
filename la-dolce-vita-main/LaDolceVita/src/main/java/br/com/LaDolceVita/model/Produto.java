package br.com.LaDolceVita.model;

import java.math.BigDecimal;

public class Produto {

    private String id;
    private String name;
    private String categoria;
    private String descricao;
    private BigDecimal preco;

    public Produto(String id, String name, String categoria, String descricao, BigDecimal preco) {
        this.id = id;
        this.name = name;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(String name, String categoria, String descricao, BigDecimal preco) {
        this.name = name;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }
}
