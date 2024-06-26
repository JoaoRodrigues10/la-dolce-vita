package br.com.LaDolceVita.servlet;


import br.com.LaDolceVita.dao.ProdutoDao;
import br.com.LaDolceVita.dao.SacolaDao;
import br.com.LaDolceVita.model.Sacola;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-sacola")
public class DeleteSacolaServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        System.out.println(Integer.parseInt(req.getParameter("idsacoladelete")));
        int sacolaId = Integer.parseInt(req.getParameter("idsacoladelete"));

        new SacolaDao().deleteSacola(sacolaId);
        int idCliente = (Integer) req.getSession().getAttribute("id");
        resp.sendRedirect("/find-all-Sacola?idCliente=" + idCliente);


    }
}

