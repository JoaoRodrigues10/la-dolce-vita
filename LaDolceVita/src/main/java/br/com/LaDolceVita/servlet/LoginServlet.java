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
            req.getSession().setAttribute("clienteAutenticado", clienteAutenticado);
            instaciarObjCliente(req);
            setarInfosNaSessao(req);
            resp.sendRedirect("/index.jsp");
        } else {
            req.setAttribute("message", "Usuario ou senha inválido !");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }


    public void instaciarObjCliente(HttpServletRequest req){
        Integer idClienteAutenticado = (Integer) req.getSession().getAttribute("id");
        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = this.clienteAutenticado;
        this.clienteAutenticado = clienteDao.selectCliente(clienteAutenticado);
        EnderecoDao enderecoDao = new EnderecoDao();
        PedidoDao pedidoDao = new PedidoDao();
        this.clienteAutenticado.setEnderecos(enderecoDao.findEndereco(idClienteAutenticado));
        this.clienteAutenticado.setPedidos(pedidoDao.findPedido(idClienteAutenticado));
    }

    public void setarInfosNaSessao(HttpServletRequest req){
        List<Endereco> enderecos = this.clienteAutenticado.getEnderecos();
        List<Pedido> pedidos = this.clienteAutenticado.getPedidos();

        for (int i = 0; i < enderecos.size(); i++) {
            req.getSession().setAttribute("idEndereco" + i, enderecos.get(i).getId_Endereco());
        }

        for (int i = 0; i < pedidos.size(); i++){
            req.getSession().setAttribute("idPedido" + i, pedidos.get(i).getId_Pedido());
        }
    }



}
