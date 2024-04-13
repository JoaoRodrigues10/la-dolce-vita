package servlet;

import dao.ProdutoDAO;
import model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-produto")
public class CreateProdutoServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nomeProduto = req.getParameter("nome-produto");

        Produto produto = new Produto();
        produto.setName(nomeProduto);

        new ProdutoDAO().createProduto(produto);

        req.getRequestDispatcher("index.html").forward(req,resp);

    }
}
