package br.com.LaDolceVita.model;

public class ItemProduto {
    private Produto produto;
    private int quantidade;

    public ItemProduto(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }


}
