package servlet;

import dao.ProdutoDAO;
import model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/find-all-produtos")
public class ListProdutoServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Produto> produtos = new ProdutoDAO().findAllProdutos();
        req.setAttribute("produtos", produtos);
        req.getRequestDispatcher("dashboard.jsp").forward(req,resp);

    }
}
