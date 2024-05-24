package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ClienteDao;
import br.com.LaDolceVita.dao.EnderecoDao;
import br.com.LaDolceVita.dao.PedidoDao;
import br.com.LaDolceVita.model.Cliente;
import br.com.LaDolceVita.model.Endereco;
import br.com.LaDolceVita.model.Pedido;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    private Cliente clienteAutenticado;

    public void setClienteAutenticado(Cliente clienteAutenticado) {
        this.clienteAutenticado = clienteAutenticado;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        Cliente cliente = new Cliente(email,senha);

        clienteAutenticado = new ClienteDao().verifyCredentials(cliente);

        if(clienteAutenticado.isLogged()){
            req.getSession().setAttribute("loggedUser", email);
            req.getSession().setAttribute("id", clienteAutenticado.getId());
            List<Endereco> enderecosUsuario = new EnderecoDao().findEndereco(clienteAutenticado.getId());
            List<Pedido> pedidosUsuario = new PedidoDao().findPedidos(clienteAutenticado.getId());
            this.clienteAutenticado.setEnderecos(enderecosUsuario);
            this.clienteAutenticado.setPedidos(pedidosUsuario);
            req.getSession().setAttribute("clienteAutenticado", clienteAutenticado);
            resp.sendRedirect("/index.jsp");
        } else {
            req.setAttribute("message", "Usuario ou senha inválido !");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }

}
