package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ClienteDao;
import br.com.LaDolceVita.model.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/update-cliente")
public class UpdateClienteServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
        String clienteIdString = req.getParameter("clienteId");
        int clienteId = Integer.parseInt(clienteIdString);
        String email = req.getParameter("email");
        String cpf = req.getParameter("cpf");
        String clienteNome = req.getParameter("nome-cliente");
        String dataNascimentoString = req.getParameter("data-nascimento");
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoString);
        String telefone = req.getParameter("telefone");
        String senha = req.getParameter("senha");

        Cliente cliente = new Cliente();

        ClienteDao clienteDAO = new ClienteDao();
        clienteDAO.updateCliente(cliente);

        Cliente clienteAtualizado = clienteDAO.selectCliente(cliente);

        req.setAttribute("cliente", clienteAtualizado);
        req.getRequestDispatcher("perfil.jsp").forward(req, response);
    }
}
