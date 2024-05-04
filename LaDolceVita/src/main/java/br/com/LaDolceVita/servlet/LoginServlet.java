package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ClienteDao;
import br.com.LaDolceVita.model.Cliente;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/login.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String senha = req.getParameter("senha");

        Cliente cliente = new Cliente(email,senha);

        Cliente clienteAutenticado = new ClienteDao().verifyCredentials(cliente);

        if(clienteAutenticado.isLogged()){
            req.getSession().setAttribute("loggedUser", email);
            req.getSession().setAttribute("id", clienteAutenticado.getId());
            resp.sendRedirect("/find-all-produtos");
        } else {
            req.setAttribute("message", "Invalid Credentials!");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
