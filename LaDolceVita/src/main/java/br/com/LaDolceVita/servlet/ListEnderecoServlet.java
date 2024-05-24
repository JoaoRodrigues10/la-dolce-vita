package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.EnderecoDao;
import br.com.LaDolceVita.model.Endereco;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/find-Endereco")
public class ListEnderecoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer idDoUsuarioLogado = (Integer) req.getSession().getAttribute("id");
        List<Endereco> enderecosUsuario = new EnderecoDao().findEndereco(idDoUsuarioLogado);
        req.setAttribute("enderecosUsuario",enderecosUsuario);
        req.getRequestDispatcher("tabelaEnderecos.jsp").forward(req, resp);
    }
}
