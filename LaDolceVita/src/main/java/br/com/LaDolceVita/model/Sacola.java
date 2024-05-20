package br.com.LaDolceVita.model;

public class Sacola {
    private int id;
    private int idProduto;
    private int idCliente;
    private int quantidade;
    private Produto produto;



    public Sacola(int id, int idProduto, int idCliente, int quantidade, Produto produto) {
        this.id = id;
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public Sacola(int idProduto, int idCliente, int quantidade) {
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.quantidade = quantidade;
    }

    public Sacola(int id, int idProduto, int idCliente, int quantidade) {
        this.id = id;
        this.idProduto = idProduto;
        this.idCliente = idCliente;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto getProduto() {
        return produto;
    }
}
