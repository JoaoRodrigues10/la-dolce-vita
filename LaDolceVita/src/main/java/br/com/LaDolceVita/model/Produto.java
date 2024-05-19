package br.com.LaDolceVita.model;

import java.math.BigDecimal;

public class Produto {

    private int id;
    private String name;
    private String categoria;
    private String descricao;
    private BigDecimal preco;
    private String image;

    public Produto(int id, String name, String categoria, String descricao, BigDecimal preco , String image) {
        this.id = id;
        this.name = name;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.image = image;
    }

    public Produto(String name, String categoria, String descricao, BigDecimal preco, String image) {
        this.name = name;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.image = image;
    }






    public int getId() {
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

    public String getImage() {
        return image;}
}
