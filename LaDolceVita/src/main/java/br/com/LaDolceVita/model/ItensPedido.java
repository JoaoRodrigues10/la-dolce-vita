package br.com.LaDolceVita.model;


import java.util.List;
import java.util.ArrayList;

public class ItensPedido {
    private String idItensPedido;
    private String idPedido;
    private List<ItemProduto> itensProduto;

    public ItensPedido(String idItensPedido, String idPedido) {
        this.idItensPedido = idItensPedido;
        this.idPedido = idPedido;
        this.itensProduto = new ArrayList<>();
    }

    public String getIdItensPedido() {
        return idItensPedido;
    }

    public String getIdPedido() {
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
