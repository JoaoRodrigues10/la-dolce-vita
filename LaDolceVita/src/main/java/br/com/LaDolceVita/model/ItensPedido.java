package br.com.LaDolceVita.model;


import java.util.List;
import java.util.ArrayList;

public class ItensPedido {
    private int idItensPedido;
    private int idPedido;
    private List<ItemProduto> itensProduto;

    public ItensPedido(int idItensPedido, int idPedido) {
        this.idItensPedido = idItensPedido;
        this.idPedido = idPedido;
        this.itensProduto = new ArrayList<>();
    }

    public ItensPedido() {
    }

    public int getIdItensPedido() {
        return idItensPedido;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public List<ItemProduto> getItensProduto() {
        return itensProduto;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemProduto itemProduto = new ItemProduto(produto, quantidade);
        itensProduto.add(itemProduto);
    }
}
