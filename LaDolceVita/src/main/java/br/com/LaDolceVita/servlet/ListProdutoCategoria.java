package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ProdutoDao;
import br.com.LaDolceVita.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/find-all-categorias")
public class ListProdutoCategoria extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // pega a categoria que o usuário selecionou na páagina web
        String categoria = req.getParameter("categoria");

        // cria uma nova instância da DAO
        ProdutoDao produtodao = new ProdutoDao();

        // chama o método findAllCategoria que devolve uma lista de Produto
        List<Produto> allProdutosCategoria = produtodao.findAllProdutosCategoria(categoria);

        // coloca uma varíavel para ser acessada na página web cujo o nome da variável é categorias
        req.setAttribute("categorias", allProdutosCategoria);

        // aqui é defindo para qual página o usuário será direcionado
        req.getRequestDispatcher("/produtos.jsp").forward(req, resp);


    }
}
