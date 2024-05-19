package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.*;

import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class ItensPedidoDao {

    public ItensPedido selecionarItensPedido(Cliente cliente) {
        String SQL = "SELECT * FROM ITENS_DO_PEDIDO WHERE ID_PEDIDO = ?";
        ItensPedido itensPedido = new ItensPedido();
        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, cliente.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int idItensPedido = resultSet.getInt("ID_ITENS_DO_PEDIDO");
                int idPedido = resultSet.getInt("ID_PEDIDO");
                int idProduto = resultSet.getInt("ID_PRODUTO");
                String nomeProduto = resultSet.getString("NOME_DO_PRODUTO");
                int quantidade = resultSet.getInt("QUANTIDADE");
                BigDecimal preco = resultSet.getBigDecimal("PRECO_UNIDADE");

                ProdutoDao produtoDao = new ProdutoDao();
                Produto produto = produtoDao.findProdutosID(idProduto);
                itensPedido.adicionarItem(produto, quantidade);
            }
            System.out.println("success in select * pedidos de: "+cliente.getNome());
            connection.close();
            return itensPedido;
        } catch (SQLException e) {
            System.out.println("error in connection: "+e.getMessage());
            return itensPedido;
        }
    }


    public void createItensPedido(ItensPedido itensPedido){
        String SQL = "INSERT INTO ITENS_DO_PEDIDO (ID_PEDIDO, ID_PRODUTO, NOME_DO_PRODUTO, QUANTIDADE, PRECO_UNIDADE) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            for (ItemProduto itemProduto : itensPedido.getItensProduto()) {
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                Produto produto = itemProduto.getProduto();
                preparedStatement.setInt(1, itensPedido.getIdPedido());
                preparedStatement.setInt(2, produto.getId());
                preparedStatement.setString(3, produto.getName());
                preparedStatement.setInt(4, itemProduto.getQuantidade());
                preparedStatement.setBigDecimal(5,produto.getPreco());
                preparedStatement.execute();
                System.out.println("success in insert itens_pedido");
            }
            connection.close();
        }catch (Exception e){
            System.out.println("error in connection: "+e.getMessage());
        }
    }


}
