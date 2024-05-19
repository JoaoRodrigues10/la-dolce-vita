package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ItensPedidoDao;
import br.com.LaDolceVita.model.ItensPedido;
import br.com.LaDolceVita.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet("/create-itens-pedido")
public class CreateItensPedidoServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/cadastroItensPedido.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer idPedido = (Integer) req.getSession().getAttribute("idPedido");
        String produtoId = ("1");
        String produtoName = ("boloTeste");
        String produtoCategoria = ("categoriaTeste");
        String produtoDescricao = ("descricaoTeste");
        String preco = ("79.99");
        BigDecimal precoProduto = new BigDecimal(preco);
        String image = ("image");
        Produto produtoTeste = new Produto(Integer.parseInt(produtoId),produtoName, produtoCategoria, produtoDescricao, precoProduto, image);
        int idItensPedido = -1;
        ItensPedido itensPedido = new ItensPedido(idItensPedido, idPedido);
        itensPedido.adicionarItem(produtoTeste,3);
        itensPedido.adicionarItem(produtoTeste,6);

        ItensPedidoDao itensPedidoDao = new ItensPedidoDao();

        itensPedidoDao.createItensPedido(itensPedido);

        resp.sendRedirect("/cadastroItensPedido.html");
    }
}
