package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ItensPedidoDao;
import br.com.LaDolceVita.dao.PedidoDao;
import br.com.LaDolceVita.model.Cliente;
import br.com.LaDolceVita.model.ItensPedido;
import br.com.LaDolceVita.model.Pedido;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet("/create-pedido")
public class CreatePedidoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/cadastroPedido.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer idCliente = (Integer) req.getSession().getAttribute("id");
        Integer idEndereco = (Integer) req.getSession().getAttribute("idEndereco0");
        BigDecimal valor_Total = BigDecimal.valueOf(999.99);
        LocalDateTime dataPedido = LocalDateTime.now();
        String status = "Em processamento";

        Pedido pedido = new Pedido(idCliente,idEndereco,valor_Total,dataPedido,status);

        PedidoDao pedidoDao = new PedidoDao();

        pedidoDao.createPedido(pedido,req);

        Cliente clienteAutenticado = (Cliente) req.getSession().getAttribute("clienteAutenticado");
        List<Pedido> pedidosUsuario = pedidoDao.findPedidos(idCliente);
        clienteAutenticado.setPedidos(pedidosUsuario);
        req.getSession().setAttribute("clienteAutenticado", clienteAutenticado);

        resp.sendRedirect("/cadastroItensPedido.html");
    }
}
