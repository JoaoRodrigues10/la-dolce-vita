package br.com.LaDolceVita.model;

import java.util.ArrayList;
import java.util.List;
import java.math.BigDecimal;


public class Sacola {
    private List<ItensPedido>itensPedido;

    public Sacola() {
    }

    public Sacola(List<ItensPedido> itensPedido) {
        this.itensPedido = new ArrayList<>();
    }

    public void adicionarItens(ItensPedido itensPedido){
        this.itensPedido.add(itensPedido);
    }

    public void removerItens(int posicao){
        this.itensPedido.remove(posicao);
    }

    public void limparSacola() {
        this.itensPedido.clear();
    }

    public void atualizarQuantidade(int posicao, int novaQuantidade) {
        this.itensPedido.get(posicao).setQuantidade(novaQuantidade);
    }

    public BigDecimal calcularTotal() {
        BigDecimal total = BigDecimal.ZERO;
        for (ItensPedido itemPedido : itensPedido) {
            BigDecimal preco = itemPedido.getPrecoUnitario();
            BigDecimal quantidade = BigDecimal.valueOf(itemPedido.getQuantidade());
            BigDecimal totalItem = preco.multiply(quantidade);

            total = total.add(totalItem);
        }
        return total;
    }

    public List<ItensPedido> converterParaItensPedido(String idPedido) {
        List<ItensPedido> itensPedidoList = new ArrayList<>();
        for (ItensPedido itemPedido : itensPedido) {
            ItensPedido novoItemPedido = new ItensPedido(
                    idPedido,
                    itemPedido.getIdProduto(),
                    itemPedido.getQuantidade(),
                    itemPedido.getPrecoUnitario()
            );
            itensPedidoList.add(novoItemPedido);
        }
        return itensPedidoList;
    }


}
