package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ItensPedidoDao;
import br.com.LaDolceVita.model.ItensPedido;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-ItensPedidos")
public class ListItensPedido extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int idCliente = (Integer) req.getSession().getAttribute("id");

        // Instanciando o DAO dos itens do pedido
        ItensPedidoDao itensPedidoDao = new ItensPedidoDao();

        // Buscando os itens do pedido com base no ID do cliente
        List<ItensPedido> itensPedidoList = itensPedidoDao.findItensPedidoPorCliente(idCliente);

        // Verificar se a lista está sendo populada corretamente
        System.out.println("Tamanho da lista de itens do pedido: " + itensPedidoList.size());
        for (ItensPedido itensPedido : itensPedidoList) {
            System.out.println("ID do Pedido: " + itensPedido.getIdPedido());
            // Você pode adicionar mais logs para verificar outros atributos se necessário
        }

        // Setando os atributos para serem utilizados no JSP
        req.setAttribute("itensPedidoList", itensPedidoList);
        req.getRequestDispatcher("perfil.jsp").forward(req, resp);
    }
}
