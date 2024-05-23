package br.com.LaDolceVita.servlet;


import br.com.LaDolceVita.dao.EnderecoDao;
import br.com.LaDolceVita.dao.SacolaDao;
import br.com.LaDolceVita.model.Endereco;
import br.com.LaDolceVita.model.Produto;
import br.com.LaDolceVita.model.Sacola;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-Sacola")
public class ListSacolaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        // pega a categoria que o usuário selecionou na páagina web
        String idClienteStr = req.getParameter("idCliente");

        //transforma em inteiro
        int idCliente = Integer.parseInt(idClienteStr);

        EnderecoDao enderecoDao = new EnderecoDao();
        List<Endereco> enderecosUsuario = enderecoDao.findEndereco(idCliente);
        req.setAttribute("enderecos", enderecosUsuario);
        // cria uma nova instância da DAO
        SacolaDao sacolaDao = new SacolaDao();

        // chama o método findAllCategoria que devolve uma lista de Produto
        List<Sacola> findSacolaByClienteId = sacolaDao.findSacolaByClienteId(idCliente);

        // coloca uma varíavel para ser acessada na página web cujo o nome da variável é categorias
        req.setAttribute("sacolas", findSacolaByClienteId);

        // aqui é defindo para qual página o usuário será direcionado
        req.getRequestDispatcher("/carrinho.jsp").forward(req, resp);



    }
}
