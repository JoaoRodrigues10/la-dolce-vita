package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ClienteDao;
import br.com.LaDolceVita.dao.EnderecoDao;
import br.com.LaDolceVita.model.Cliente;
import br.com.LaDolceVita.model.Endereco;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/create-endereco")
public class CreateEnderecoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/cadastroEndereco.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer idDoUsuarioLogado = (Integer) req.getSession().getAttribute("id");
        ClienteDao clienteDao = new ClienteDao();

        int id_Cliente = idDoUsuarioLogado;
        String id_Endereco = req.getParameter("id_Endereco");
        String cep = req.getParameter("cep");
        String endereco_Rua = req.getParameter("endereco_Rua");
        String cidade = req.getParameter("cidade");
        String bairro = req.getParameter("bairro");
        String estado = req.getParameter("estado");
        String numero = req.getParameter("numero");
        String complemento = req.getParameter("complemento");
        String referencia = req.getParameter("referencia");


        Endereco endereco = new Endereco(id_Cliente, cep, endereco_Rua, cidade, bairro, estado, numero, complemento, referencia);
        EnderecoDao enderecoDao = new EnderecoDao();;

        Cliente clienteAutenticado = (Cliente) req.getSession().getAttribute("clienteAutenticado");
        List<Endereco> enderecosUsuario = new EnderecoDao().findEndereco(idDoUsuarioLogado);
        clienteAutenticado.setEnderecos(enderecosUsuario);
        req.getSession().setAttribute("clienteAutenticado", clienteAutenticado);

        enderecoDao.createEndereco(endereco);
        resp.sendRedirect("/find-Endereco");





    }
}
