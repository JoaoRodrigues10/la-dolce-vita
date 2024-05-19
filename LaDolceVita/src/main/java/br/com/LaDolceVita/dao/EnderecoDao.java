package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.Cliente;
import br.com.LaDolceVita.model.Endereco;
import br.com.LaDolceVita.model.Produto;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EnderecoDao {


    public Cliente selectEnderecoUsuarioLogado(Cliente cliente){
        String SQL = "SELECT * FROM ENDERECOS WHERE ID_CLIENTE = ?";
        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, cliente.getId());
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id_Endereco = resultSet.getInt("ID_ENDERECO");
                int id_Cliente = cliente.getId();
                String cep = resultSet.getString("CEP");
                String endereco_Rua = resultSet.getString("RUA");
                String cidade = resultSet.getString("CIDADE");
                String bairro = resultSet.getString("BAIRRO");
                String estado = resultSet.getString("ESTADO");
                String numero = resultSet.getString("NUMERO");
                String complemento = resultSet.getString("COMPLEMENTO");
                String referencia = resultSet.getString("REFERENCIA");
                Endereco endereco = new Endereco(id_Endereco,id_Cliente,cep,endereco_Rua,cidade,bairro,estado,numero,complemento,referencia);
                cliente.adicionarEndereco(endereco);
            }
            System.out.println("success in select * enderecos de: "+cliente.getNome());
            connection.close();
            return cliente;
        } catch (SQLException e) {
            System.out.println("error in connection: "+e.getMessage());

            return cliente;
        }
    }

    public void createEndereco(Endereco endereco){

        String SQL = "INSERT INTO ENDERECOS (ID_CLIENTE, CEP, RUA, CIDADE , BAIRRO, ESTADO, NUMERO, COMPLEMENTO, REFERENCIA) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setInt(1, endereco.getId_Cliente());
            preparedStatement.setString(2, endereco.getCep());
            preparedStatement.setString(3, endereco.getEndereco_Rua());
            preparedStatement.setString(4, endereco.getCidade());
            preparedStatement.setString(5, endereco.getBairro());
            preparedStatement.setString(6, endereco.getEstado());
            preparedStatement.setString(7, endereco.getNumero());
            preparedStatement.setString(8, endereco.getComplemento());
            preparedStatement.setString(9, endereco.getReferencia());
            preparedStatement.execute();

            System.out.println("success in insert command");
            connection.close();

        }catch (Exception e){
            System.out.println("error in connection: "+e.getMessage());
        }

    }

    public void updateEndereco(Endereco endereco){

        String SQL = "UPDATE ENDERECOS SET CEP = ?, RUA = ?, CIDADE = ?, BAIRRO = ?, ESTADO = ?, NUMERO = ?, COMPLEMENTO = ?, REFERENCIA = ?  WHERE ID_ENDERECO = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, endereco.getCep());
            preparedStatement.setString(2, endereco.getEndereco_Rua());
            preparedStatement.setString(3, endereco.getCidade());
            preparedStatement.setString(4, endereco.getBairro());
            preparedStatement.setString(5, endereco.getEstado());
            preparedStatement.setString(6, endereco.getNumero());
            preparedStatement.setString(7, endereco.getComplemento());
            preparedStatement.setString(8, endereco.getReferencia());
            preparedStatement.execute();

            System.out.println("success in update endereco");
            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }
    }
}
