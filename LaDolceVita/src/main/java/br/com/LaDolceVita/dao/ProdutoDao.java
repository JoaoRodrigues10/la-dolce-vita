package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProdutoDao {

    public void createProduto(Produto produto){

        String SQL = "INSERT INTO PRODUTO (NAME) VALUES (?)";

        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, produto.getName());
            preparedStatement.execute();
            System.out.println("success in insert command");
            connection.close();
        }catch (Exception e){
            System.out.println("error in connection");
        }
    }

    public List<Produto> findAllProdutos(){

        String SQL = "SELECT * FROM PRODUTO";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Produto> produtos = new ArrayList<>();

            while (resultSet.next()) {

                String produtoId = resultSet.getString("id");
                String produtoName = resultSet.getString("name");

                Produto produto = new Produto(produtoId, produtoName);

                produtos.add(produto);

            }

            System.out.println("success in select * produto");

            connection.close();

            return produtos;

        } catch (Exception e) {

            System.out.println("fail in database connection");

            return Collections.emptyList();

        }
    }

    public void deleteProdutoById(String produtoId){

        String SQL = "DELETE PRODUTO WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, produtoId);
            preparedStatement.execute();

            System.out.println("success on delete produto with id: " + produtoId);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }

    public void updateProduto(Produto produto){

        String SQL = "UPDATE PRODUTO SET NAME = ? WHERE ID = ?";

        try {

            Connection connection = ConnectionPoolConfig.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, produto.getName());
            preparedStatement.setString(2, produto.getId());
            preparedStatement.execute();

            System.out.println("success in update produto");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }
    }


}
