package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EnderecoDao {

    public void createEndereco(Endereco endereco){

        String SQL = "INSERT INTO endereco (id_Cliente, cep, endereco_Rua, cidade, bairro, estado, numero, complemento, referencia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, endereco.getId_Cliente());
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
            System.out.println("error in connection");
        }

    }

    public void updateEndereco(Endereco endereco){

        String SQL = "UPDATE endereco SET cep = ?, endereco_Rua = ?, cidade = ?, bairro = ?, estado = ?, numero = ?, complemento = ?, referencia = ?  WHERE ID = ?";

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
