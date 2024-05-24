    package br.com.LaDolceVita.dao;

    import br.com.LaDolceVita.config.ConnectionPoolConfig;
    import br.com.LaDolceVita.model.*;

    import java.math.BigDecimal;
    import java.sql.*;
    import java.time.LocalDateTime;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.List;


    public class ItensPedidoDao {

        public List<ItensPedido> findItensPedido(int idDoPedido) {
            String SQL = "SELECT * FROM ITENS_DO_PEDIDO where ID_PEDIDO = ?";
            try {
                Connection connection = ConnectionPoolConfig.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                preparedStatement.setInt(1, idDoPedido);
                ResultSet resultSet = preparedStatement.executeQuery();
                List<ItensPedido> itensDoPedidoUsuario = new ArrayList<>();
                ProdutoDao produtoDao = new ProdutoDao();
                while (resultSet.next()) {
                    int idItensPedido = resultSet.getInt("ID_ITENS_DO_PEDIDO");
                    int idPedido = resultSet.getInt("ID_PEDIDO");
                    int idProduto = resultSet.getInt("ID_PRODUTO");
                    String nomeDoProduto = resultSet.getString("NOME_DO_PRODUTO");
                    int quantidade = resultSet.getInt("QUANTIDADE");
                    Produto produto = produtoDao.findProdutosID(idProduto);
                    ItensPedido itensPedido = new ItensPedido(idItensPedido,idPedido);
                    itensPedido.adicionarItem(produto,quantidade);
                    itensDoPedidoUsuario.add(itensPedido);
                }
                System.out.println("success in select * itens do pedido do usuario");
                connection.close();
                return itensDoPedidoUsuario;
            } catch (Exception e) {
                System.out.println("fail in database connection");
                return Collections.emptyList();
            }
        }

        public void createItensPedido(ItensPedido itensPedido){
            String SQL = "INSERT INTO ITENS_DO_PEDIDO (ID_PEDIDO, ID_PRODUTO, NOME_DO_PRODUTO, QUANTIDADE, PRECO_UNIDADE) VALUES (?, ?, ?, ?, ?)";
            try {
                Connection connection = ConnectionPoolConfig.getConnection();
                for (ItemProduto itemProduto : itensPedido.getItensProduto()) {
                    PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                    Produto produto = itemProduto.getProduto();
                    preparedStatement.setInt(1, itensPedido.getIdPedido());
                    preparedStatement.setInt(2, produto.getId());
                    preparedStatement.setString(3, produto.getName());
                    preparedStatement.setInt(4, itemProduto.getQuantidade());
                    preparedStatement.setBigDecimal(5,produto.getPreco());
                    preparedStatement.execute();
                    System.out.println("success in insert itens_pedido");
                }
                connection.close();
            }catch (Exception e){
                System.out.println("error in connection: "+e.getMessage());
            }
        }


        public List<ItensPedido> findItensPedidoPorCliente(int idCliente) {
            String SQL = "SELECT IP.* FROM PEDIDOS P " +
                    "INNER JOIN ITENS_DO_PEDIDO IP ON P.ID_PEDIDO = IP.ID_PEDIDO " +
                    "WHERE P.ID_CLIENTE = ?";
            try {
                Connection connection = ConnectionPoolConfig.getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(SQL);
                preparedStatement.setInt(1, idCliente);
                ResultSet resultSet = preparedStatement.executeQuery();
                List<ItensPedido> itensDoPedidoUsuario = new ArrayList<>();
                ProdutoDao produtoDao = new ProdutoDao();
                while (resultSet.next()) {
                    int idItensPedido = resultSet.getInt("ID_ITENS_DO_PEDIDO");
                    int idPedido = resultSet.getInt("ID_PEDIDO");
                    int idProduto = resultSet.getInt("ID_PRODUTO");
                    String nomeDoProduto = resultSet.getString("NOME_DO_PRODUTO");
                    int quantidade = resultSet.getInt("QUANTIDADE");
                    Produto produto = produtoDao.findProdutosID(idProduto);
                    ItensPedido itensPedido = new ItensPedido(idItensPedido, idPedido);
                    itensPedido.adicionarItem(produto, quantidade);
                    itensDoPedidoUsuario.add(itensPedido);
                }
                System.out.println("success in select * itens do pedido do usuario");
                connection.close();
                return itensDoPedidoUsuario;
            } catch (Exception e) {
                System.out.println("fail in database connection");
                return Collections.emptyList();
            }
        }

    }
