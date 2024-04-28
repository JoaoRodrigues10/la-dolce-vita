package br.com.LaDolceVita.model;

import java.math.BigDecimal;

public class ItensPedido {
    private String idItensPedido;
    private String idPedido;
    private String idProduto;
    private int quantidade;
    private BigDecimal precoUnitario;

    public ItensPedido(String idItensPedido, String idPedido, String idProduto, int quantidade, BigDecimal precoUnitario) {
        this.idItensPedido = idItensPedido;
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public ItensPedido(String idPedido, String idProduto, int quantidade, BigDecimal precoUnitario) {
        this.idPedido = idPedido;
        this.idProduto = idProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getIdItensPedido() {
        return idItensPedido;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public BigDecimal getPrecoUnitario() {
        return precoUnitario;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
