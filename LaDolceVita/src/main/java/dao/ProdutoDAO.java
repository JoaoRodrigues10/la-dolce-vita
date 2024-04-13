package dao;

import model.Produto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProdutoDAO {

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


}
