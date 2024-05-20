package br.com.LaDolceVita.servlet;


import br.com.LaDolceVita.dao.SacolaDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update-sacola")
public class UptadeSacolaServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int idSacola = Integer.parseInt(req.getParameter("idSacola"));
        int quantidade = Integer.parseInt(req.getParameter("quantidade"));

        new SacolaDao().updateSacola(idSacola, quantidade);

        int idCliente = (Integer) req.getSession().getAttribute("id");
        resp.sendRedirect("/find-all-Sacola?idCliente=" + idCliente);
    }
}
