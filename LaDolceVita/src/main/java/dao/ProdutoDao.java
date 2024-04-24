package dao;

import model.Produto;

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
            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa","sa");
            System.out.println("success in connection");
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

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

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

            Connection connection = DriverManager.getConnection("jdbc:h2:~/test", "sa", "sa");

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, produtoId);
            preparedStatement.execute();

            System.out.println("success on delete produto with id: " + produtoId);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }


}
