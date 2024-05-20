package br.com.LaDolceVita.servlet;


import br.com.LaDolceVita.dao.SacolaDao;
import br.com.LaDolceVita.model.Sacola;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add-to-sacola")
public class CreateSacolaServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int idCliente = (Integer) req.getSession().getAttribute("id");
        int idProduto = Integer.parseInt(req.getParameter("idProdutoSacola"));
        int quantidade = Integer.parseInt(req.getParameter("quantidade"));

        SacolaDao sacolaDao = new SacolaDao();

        Sacola existingSacola = sacolaDao.findByClienteIdAndProdutoId(idCliente, idProduto);
        if (existingSacola != null) {
            int novaQuantidade = existingSacola.getQuantidade() + quantidade;
            sacolaDao.updateSacola(existingSacola.getId(), novaQuantidade);
        } else {
            Sacola sacola = new Sacola(idProduto, idCliente, quantidade);
            sacolaDao.createSacola(sacola);
        }
        resp.sendRedirect("/find-all-Sacola?idCliente=" + idCliente);

    }
}
