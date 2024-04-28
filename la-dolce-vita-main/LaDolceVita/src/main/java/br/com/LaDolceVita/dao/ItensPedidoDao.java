package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.ItensPedido;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.time.LocalDate;

public class ItensPedidoDao {

    public void createItensPedido(ItensPedido itensPedido){

        String SQL = "INSERT INTO ITENS_PEDIDO (id_Pedido, id_Produto, quantidade, preco_Unitario) VALUES (?, ?, ?, ?)";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1,itensPedido.getIdPedido());
            preparedStatement.setString(2,itensPedido.getIdProduto());
            preparedStatement.setInt(3, itensPedido.getQuantidade());
            preparedStatement.setBigDecimal(4,itensPedido.getPrecoUnitario());

            System.out.println("success in insert command");
            connection.close();
        }catch (Exception e){
            System.out.println("error in connection");
        }
    }
}
