package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ClienteDao;
import br.com.LaDolceVita.dao.EnderecoDao;
import br.com.LaDolceVita.model.Endereco;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-endereco")
public class CreateEnderecoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Recupera o nome de usuário logado da sessão
        String usuarioLogado = (String) req.getSession().getAttribute("usuarioLogado");
        ClienteDao clienteDao = new ClienteDao();

        String id_Cliente = clienteDao.getClienteIdByUsuario(usuarioLogado);
        String id_Endereco = req.getParameter("id_Endereco");
        String cep = req.getParameter("cep");
        String endereco_Rua = req.getParameter("endereco_Rua");
        String cidade = req.getParameter("cidade");
        String bairro = req.getParameter("bairro");
        String estado = req.getParameter("estado");
        String numero = req.getParameter("numero");
        String complemento = req.getParameter("complemento");
        String referencia = req.getParameter("referencia");


        Endereco endereco = new Endereco(id_Endereco, id_Cliente, cep, endereco_Rua, cidade, bairro, estado, numero, complemento, referencia);
        EnderecoDao enderecoDao = new EnderecoDao();;

        if (id_Endereco.isBlank()) {

            enderecoDao.createEndereco(endereco);


        } else {

            enderecoDao.updateEndereco(endereco);
        }

    }
}
