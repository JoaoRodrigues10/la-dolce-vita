package br.com.LaDolceVita.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-bolo")
public class CreateBoloServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String boloName = request.getParameter("bolo-name");

        System.out.println(boloName);

        request.getRequestDispatcher("index.html").forward(request, response);
    }
}
