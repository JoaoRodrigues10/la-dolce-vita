package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.Cliente;
import br.com.LaDolceVita.model.Endereco;
import br.com.LaDolceVita.model.Pedido;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PedidoDao {

    public List<Pedido> findPedidos(int idUsuario){
        String SQL = "SELECT * FROM PEDIDOS where ID_CLIENTE = ?";
        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, idUsuario);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Pedido> pedidosUsuario = new ArrayList<>();
            while (resultSet.next()) {
                int id_Pedido = resultSet.getInt("ID_PEDIDO");
                int id_Cliente = resultSet.getInt("ID_CLIENTE");
                int id_Endereco = resultSet.getInt("ID_ENDERECO");
                BigDecimal valor_Total = resultSet.getBigDecimal("VALOR_TOTAL");
                Timestamp timestamp = resultSet.getTimestamp("DATA_COMPRA");
                String status = resultSet.getString("STATUS");
                LocalDateTime dataCompra = timestamp.toLocalDateTime();
                Pedido pedido = new Pedido(id_Pedido,id_Cliente,id_Endereco,valor_Total,dataCompra,status);
                pedidosUsuario.add(pedido);
            }
            System.out.println("success in select * pedidos do usuario");
            connection.close();
            return pedidosUsuario;
        } catch (Exception e) {
            System.out.println("fail in database connection");
            return Collections.emptyList();
        }
    }


        public void createPedido(Pedido pedido, HttpServletRequest req){
        String SQL = "INSERT INTO PEDIDOS (ID_CLIENTE, ID_ENDERECO, VALOR_TOTAL, DATA_COMPRA, STATUS) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            LocalDateTime dataCompra = pedido.getDataPedido();
            Timestamp timestamp = Timestamp.valueOf(pedido.getDataPedido());
            preparedStatement.setInt(1,pedido.getId_Cliente());
            preparedStatement.setInt(2,pedido.getId_Endereco());
            preparedStatement.setBigDecimal(3,pedido.getValor_Total());
            preparedStatement.setTimestamp(4, timestamp);
            preparedStatement.setString(5,pedido.getStatus());
            preparedStatement.execute();
            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            System.out.println("success in insert pedido");
            int novoID = 0;
            if (generatedKeys.next()) {
                novoID = generatedKeys.getInt(1);
                System.out.println("Novo ID do pedido: " + novoID);
            } else {
                System.out.println("Failed to retrieve generated ID.");
            }
            connection.close();
            req.getSession().setAttribute("idPedido",novoID);
            System.out.println(req.getSession().getAttribute("idPedido"));
        } catch (Exception e) {
            System.out.println("error in connection: "+e.getMessage());
        }
    }


}
