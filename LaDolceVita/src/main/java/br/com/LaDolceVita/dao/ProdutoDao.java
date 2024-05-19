package br.com.LaDolceVita.dao;

import br.com.LaDolceVita.config.ConnectionPoolConfig;
import br.com.LaDolceVita.model.Produto;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProdutoDao {

    public Produto findProdutosID(int id){
        String SQL = "SELECT * FROM PRODUTOS where ID_PRODUTO = ?";
        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
                if(resultSet.next()){
                    int produtoId = resultSet.getInt("ID_PRODUTO");
                    String produtoName = resultSet.getString("NOME");
                    String produtoCategoria = resultSet.getString("CATEGORIA");
                    String produtoDescricao = resultSet.getString("DESCRICAO");
                    String preco = resultSet.getString("PRECO");
                    BigDecimal precoProduto = new BigDecimal(preco);
                    String imagemproduto = resultSet.getString("IMAGE");
                    Produto produto = new Produto(produtoId, produtoName, produtoCategoria, produtoDescricao, precoProduto, imagemproduto);
                    return produto;
                }
            System.out.println("success in select * produto where id: "+id);
            connection.close();
        } catch (Exception e) {
            System.out.println("fail in database connection");
        }
        return null;
    }


    public void createProduto(Produto produto){
        String SQL = "INSERT INTO PRODUTOS (NOME, CATEGORIA, DESCRICAO, PRECO, IMAGE) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, produto.getName());
            preparedStatement.setString(2, produto.getCategoria());
            preparedStatement.setString(3, produto.getDescricao());
            preparedStatement.setBigDecimal(4,produto.getPreco());
            preparedStatement.setString(5, produto.getImage());
            preparedStatement.execute();
            System.out.println("success in insert command");
            connection.close();
        }catch (Exception e){
            System.out.println("error in connection");
        }
    }


    public List<Produto> findAllProdutos(){
        String SQL = "SELECT * FROM PRODUTOS";
        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Produto> produtos = new ArrayList<>();
            while (resultSet.next()) {
                int produtoId = resultSet.getInt("ID_PRODUTO");
                String produtoName = resultSet.getString("NOME");
                String produtoCategoria = resultSet.getString("CATEGORIA");
                String produtoDescricao = resultSet.getString("DESCRICAO");
                String preco = resultSet.getString("PRECO");
                BigDecimal precoProduto = new BigDecimal(preco);
                String imagemproduto = resultSet.getString("IMAGE");
                Produto produto = new Produto(produtoId, produtoName, produtoCategoria, produtoDescricao, precoProduto,imagemproduto);
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


    public List<Produto> findAllProdutosCategoria(String categoria){
        String SQL = "SELECT * FROM PRODUTOS where CATEGORIA = ?";
        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, categoria);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Produto> produtos = new ArrayList<>();
            while (resultSet.next()) {
                int produtoId = resultSet.getInt("ID_PRODUTO");
                String produtoName = resultSet.getString("NOME");
                String produtoCategoria = resultSet.getString("CATEGORIA");
                String produtoDescricao = resultSet.getString("DESCRICAO");
                String preco = resultSet.getString("PRECO");
                BigDecimal precoProduto = new BigDecimal(preco);
                String imagemproduto = resultSet.getString("IMAGE");
                Produto produto = new Produto(produtoId, produtoName, produtoCategoria, produtoDescricao, precoProduto, imagemproduto);
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
        String SQL = "DELETE PRODUTOS WHERE ID_PRODUTO = ?";
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
        String SQL = "UPDATE PRODUTOS SET NOME = ?, CATEGORIA = ?, DESCRICAO = ?, PRECO = ?, IMAGE = ?  WHERE ID_PRODUTO = ?";
        try {
            Connection connection = ConnectionPoolConfig.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, produto.getName());
            preparedStatement.setString(2, produto.getCategoria());
            preparedStatement.setString(3, produto.getDescricao());
            preparedStatement.setBigDecimal(4, produto.getPreco());
            preparedStatement.setString(5, produto.getImage());
            preparedStatement.setInt(6, produto.getId());
            preparedStatement.execute();
            System.out.println("success in update produto");
            connection.close();
        } catch (Exception e) {
            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());
        }
    }


}
