package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.Cliente;

import java.sql.*;
import java.time.LocalDate;

public class ClienteDao {

    public Cliente verifyCredentials(Cliente clienteAvalidar){

        String SQL = "SELECT * FROM CLIENTES WHERE EMAIL = ?";

        try{
            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, clienteAvalidar.getEmail());
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println("Success in select email");
            Cliente cliente;
            while (resultSet.next()){
                String senha = resultSet.getString("SENHA");
                int id = resultSet.getInt("ID_CLIENTE");

                if(senha.equals(clienteAvalidar.getSenha())){
                    cliente = new Cliente(id, true);
                    return cliente;
                }
            }

            connection.close();
            return new Cliente(0, false);

        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return new Cliente(0, false);
        }

    }


    public void createCliente(Cliente cliente){

        String SQL = "INSERT INTO CLIENTES (EMAIL, CPF, NOME, DATA_NASCIMENTO, SENHA, TELEFONE) VALUES (?, ?, ?, ?, ?, ?)";

        try {

            LocalDate dataNascimento = cliente.getDataNascimento();
            Date dataSQL = Date.valueOf(dataNascimento);

            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cliente.getEmail());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getNome());
            preparedStatement.setDate(4, dataSQL);
            preparedStatement.setString(5, cliente.getSenha());
            preparedStatement.setString(6, cliente.getTelefone());
            preparedStatement.execute();

            System.out.println("success in insert command");
            connection.close();

        }catch (Exception e){
            System.out.println("error in connection");
        }
    }


    public void updateCliente(Cliente cliente){

        String SQL = "UPDATE cliente SET email = ?, cpf = ?, nome = ?, data_Nascimento = ?, senha = ?, telefone = ? WHERE ID = ?";

        try {

            LocalDate dataNascimento = cliente.getDataNascimento();
            Date dataSQL = Date.valueOf(dataNascimento);

            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cliente.getEmail());
            preparedStatement.setString(2, cliente.getCpf());
            preparedStatement.setString(3, cliente.getNome());
            preparedStatement.setDate(4, dataSQL);
            preparedStatement.setString(5, cliente.getSenha());
            preparedStatement.setString(6, cliente.getTelefone());

            System.out.println("success in update cliente");
            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }
    }

}
