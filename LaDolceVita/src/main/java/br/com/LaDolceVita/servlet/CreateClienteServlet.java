package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ClienteDao;
import br.com.LaDolceVita.model.Cliente;
import br.com.LaDolceVita.model.Endereco;
import br.com.LaDolceVita.model.Pedido;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

@WebServlet("/create-cliente")
public class CreateClienteServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/cadastroCliente.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String clienteId= req.getParameter("id");
        String email = req.getParameter("email");
        String cpf = req.getParameter("cpf");
        String clienteNome = req.getParameter("nome-cliente");
        String dataNascimentoString = req.getParameter("data-nascimento");
        String telefone = req.getParameter("celular");
        String senha = req.getParameter("senha");


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, formatter);

        ClienteDao clienteDao = new ClienteDao();


        Cliente cliente = new Cliente(email, cpf, clienteNome, dataNascimento, senha, telefone, new ArrayList<>(), new ArrayList<>());

        clienteDao.createCliente(cliente);
        req.getRequestDispatcher("/login.jsp").forward(req,resp);
        //resp.sendRedirect("index.html");

        //clienteDao.updateCliente(cliente);

    }
}
