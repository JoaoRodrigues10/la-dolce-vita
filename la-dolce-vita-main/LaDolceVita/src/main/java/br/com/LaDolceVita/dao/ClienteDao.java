package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.Cliente;
import br.com.LaDolceVita.model.Endereco;

import java.sql.*;
import java.time.LocalDate;

public class ClienteDao {

    public void createCliente(Cliente cliente){

        String SQL = "INSERT INTO clientes (email, cpf, nome, data_Nascimento, senha, telefone) VALUES (?, ?, ?, ?, ?, ?)";

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

    //metodo para recuperar usuario logado, usado para criação de endereços e pedidos associados a um usuario.
    public String getClienteIdByUsuario(String usuario) {
        String clienteId = null;
        // Conexão ao banco de dados e consulta para obter o ID do cliente pelo nome de usuário
        try (Connection conn = ConnectionPoolConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT id_Cliente FROM clientes WHERE email = ?")) {
            stmt.setString(1, usuario);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    clienteId = rs.getString("id_Cliente");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return clienteId;
    }

    //metodo para recuperar endereço do cliente logado, usado para criação de pedidos
    public String getEnderecoIdPorClienteId(String idCliente) {
        String enderecoId = null;
        // Consulta SQL para obter o ID do endereço associado ao cliente
        String query = "SELECT id_endereco FROM clientes WHERE id_Cliente = ?";

        // Conexão ao banco de dados e consulta para obter o ID do endereço
        try (Connection conn = ConnectionPoolConfig.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            // Configura o parâmetro do ID do cliente na consulta
            stmt.setString(1, idCliente);

            // Executa a consulta
            try (ResultSet rs = stmt.executeQuery()) {
                // Verifica se há um resultado
                if (rs.next()) {
                    // Obtém o ID do endereço a partir da coluna `id_endereco`
                    enderecoId = rs.getString("id_endereco");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return enderecoId;
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
