package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.Produto;
import br.com.LaDolceVita.model.Sacola;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SacolaDao {
    public List<Sacola> findSacolaByClienteId(int idCliente) {
        String SQL = "SELECT SACOLA.ID_SACOLA, SACOLA.ID_CLIENTE, SACOLA.ID_PRODUTO, SACOLA.QUANTIDADE, PRODUTOS.NOME, PRODUTOS.CATEGORIA, PRODUTOS.DESCRICAO, PRODUTOS.PRECO, PRODUTOS.IMAGE FROM SACOLA INNER JOIN PRODUTOS ON SACOLA.ID_PRODUTO = PRODUTOS.ID_PRODUTO WHERE SACOLA.ID_CLIENTE = ?";

        List<Sacola> sacolas = new ArrayList<>();

        try (Connection connection = ConnectionPoolConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setInt(1, idCliente);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                while (resultSet.next()) {
                    int produtoId = resultSet.getInt("ID_PRODUTO");
                    int clienteId = resultSet.getInt("ID_CLIENTE");
                    String produtoNome = resultSet.getString("NOME");
                    String produtoCategoria = resultSet.getString("CATEGORIA");
                    String produtoDescricao = resultSet.getString("DESCRICAO");
                    BigDecimal preco = resultSet.getBigDecimal("PRECO");
                    String imagemProduto = resultSet.getString("IMAGE");
                    int quantidade = resultSet.getInt("QUANTIDADE");

                    Produto produto = new Produto(produtoId, produtoNome, produtoCategoria, produtoDescricao, preco, imagemProduto);
                    Sacola sacola = new Sacola(resultSet.getInt("ID_SACOLA"), produtoId, clienteId, quantidade, produto);
                    sacolas.add(sacola);

                }
            }

        } catch (Exception e) {
            System.out.println("Erro na conexão com o banco de dados: " + e.getMessage());
        }
        return sacolas;
    }

    public Sacola findByClienteIdAndProdutoId(int idCliente, int idProduto) {
        String SQL = "SELECT * FROM SACOLA WHERE ID_CLIENTE = ? AND ID_PRODUTO = ?";
        try (Connection connection = ConnectionPoolConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setInt(1, idCliente);
            preparedStatement.setInt(2, idProduto);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int idSacola = resultSet.getInt("ID_SACOLA");
                    int quantidade = resultSet.getInt("QUANTIDADE");
                    return new Sacola(idSacola, idProduto, idCliente, quantidade);
                }
            }
        } catch (Exception e) {
            System.out.println("Erro na conexão com o banco de dados: " + e.getMessage());
        }
        return null;
    }

    public void createSacola(Sacola sacola) {
        String SQL = "INSERT INTO SACOLA (ID_CLIENTE, ID_PRODUTO, QUANTIDADE) VALUES (?, ?, ?)";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, sacola.getIdCliente());
            preparedStatement.setInt(2, sacola.getIdProduto());
            preparedStatement.setInt(3, sacola.getQuantidade());

            preparedStatement.execute();
            System.out.println("success in insert command");
            connection.close();
        } catch (Exception e) {
            System.out.println("Erro ao inserir na tabela SACOLA: " + e.getMessage());
        }
    }

    public void deleteSacola(int idSacola) {
        String SQL = "DELETE FROM SACOLA WHERE ID_SACOLA = ?";

        try (Connection connection = ConnectionPoolConfig.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {

            preparedStatement.setInt(1, idSacola);
            preparedStatement.executeUpdate();
            System.out.println("Sucesso ao excluir da tabela SACOLA.");
        } catch (Exception e) {
            System.out.println("Erro ao excluir da tabela SACOLA: " + e.getMessage());
        }
    }

    public void updateSacola(int idSacola, int quantidade) {
        String SQL = "UPDATE SACOLA SET QUANTIDADE = ? WHERE ID_SACOLA = ?";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, quantidade);
            preparedStatement.setInt(2, idSacola);
            preparedStatement.executeUpdate();
            System.out.println("Sucesso ao atualizar a quantidade na tabela SACOLA.");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar a tabela SACOLA: " + e.getMessage());
        }
    }
    public void LimparSacolaByClienteId(int clienteId) {
        String SQL = "DELETE FROM SACOLA WHERE ID_CLIENTE = ?";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, clienteId);
            preparedStatement.executeUpdate();
            System.out.println("Sacola cleared for ID_CLIENTE: " + clienteId);
        } catch (Exception e) {
            System.out.println("Error in connection: " + e.getMessage());
        }
    }
}