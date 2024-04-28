package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ProdutoDao;
import br.com.LaDolceVita.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet("/create-produto")
public class CreateProdutoServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String produtoId = req.getParameter("id");
        String produtoName = req.getParameter("name-produto");
        String produtoCategoria = req.getParameter("categoria-produto");
        String produtoDescricao = req.getParameter("descricao-produto");
        String preco = req.getParameter("preco-produto");
        BigDecimal precoProduto = new BigDecimal(preco);


        ProdutoDao produtoDao = new ProdutoDao();

        Produto produto = new Produto(produtoId, produtoName, produtoCategoria, produtoDescricao, precoProduto);

        if (produtoId.isBlank()) {

            produtoDao.createProduto(produto);


        } else {

            produtoDao.updateProduto(produto);
        }

        resp.sendRedirect("/find-all-produtos");

    }
}
