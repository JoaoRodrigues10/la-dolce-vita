package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.ItemProduto;
import br.com.LaDolceVita.model.ItensPedido;
import br.com.LaDolceVita.model.Produto;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class ItensPedidoDao {

    public void createItensPedido(ItensPedido itensPedido){

        String SQL = "INSERT INTO ITENS_PEDIDO (id_Pedido, id_Produto, nome_Produto, quantidade, preco_Unitario) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            for (ItemProduto itemProduto : itensPedido.getItensProduto()) {
                Produto produto = itemProduto.getProduto();
                preparedStatement.setString(1, itensPedido.getIdPedido());
                preparedStatement.setString(2, produto.getId());
                preparedStatement.setString(3, produto.getName());
                preparedStatement.setInt(4, itemProduto.getQuantidade());
                preparedStatement.setBigDecimal(5,produto.getPreco());
            }

            System.out.println("success in insert command");
            connection.close();

        }catch (Exception e){
            System.out.println("error in connection");
        }
    }
}
