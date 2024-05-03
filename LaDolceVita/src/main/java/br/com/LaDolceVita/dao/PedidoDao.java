package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.Pedido;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class PedidoDao {

    public void createPedido(Pedido pedido){

        String SQL = "INSERT INTO PEDIDO (id_Cliente, id_Endereco, id_ItensPedido, valor_Total, data_Pedido, status) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            LocalDateTime dataCompra = pedido.getDataPedido();
            Timestamp timestamp = Timestamp.valueOf(dataCompra);

            preparedStatement.setString(1,pedido.getId_Cliente());
            preparedStatement.setString(2,pedido.getId_Endereco());
            preparedStatement.setString(3,pedido.getId_ItensPedido());
            preparedStatement.setBigDecimal(4,pedido.getValor_Total());
            preparedStatement.setTimestamp(5, timestamp);;
            preparedStatement.setString(6,pedido.getStatus());

            System.out.println("success in insert command");
            connection.close();
        }catch (Exception e){
            System.out.println("error in connection");
        }
    }
}
