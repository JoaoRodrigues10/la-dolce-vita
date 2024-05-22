package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ItensPedidoDao;
import br.com.LaDolceVita.dao.PedidoDao;
import br.com.LaDolceVita.model.ItensPedido;
import br.com.LaDolceVita.model.Pedido;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-Pedidos")
public class ListPedidos extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer idDoUsuarioLogado = (Integer) req.getSession().getAttribute("id");
        List<Pedido> pedidosCliente = new PedidoDao().findPedido(idDoUsuarioLogado);
        req.setAttribute("pedidosCliente",pedidosCliente);
        super.doGet(req, resp);
    }
}
