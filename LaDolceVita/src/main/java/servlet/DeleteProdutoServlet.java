package servlet;

import dao.ProdutoDao;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/delete-produto")
public class DeleteProdutoServlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String produtoId = req.getParameter("id");

        new ProdutoDao().deleteProdutoById(produtoId);

        resp.sendRedirect("/find-all-produtos");

    }
}
