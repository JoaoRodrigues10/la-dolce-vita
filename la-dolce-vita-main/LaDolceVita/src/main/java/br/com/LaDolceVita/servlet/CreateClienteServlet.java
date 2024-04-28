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
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String clienteId = req.getParameter("id");
        String email = req.getParameter("email");
        String cpf = req.getParameter("cpf");
        String clienteNome = req.getParameter("cliente-nome");
        String dataNascimentoString = req.getParameter("data-nascimento");
        String senha = req.getParameter("senha");
        String telefone = req.getParameter("telefone");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString, formatter);

        ClienteDao clienteDao = new ClienteDao();
        Cliente cliente = new Cliente(clienteId, email, cpf, clienteNome, dataNascimento, senha, telefone, new ArrayList<>(), new ArrayList<>());

        if (clienteId.isBlank()) {

            clienteDao.createCliente(cliente);


        } else {

            clienteDao.updateCliente(cliente);
        }

    }
}
