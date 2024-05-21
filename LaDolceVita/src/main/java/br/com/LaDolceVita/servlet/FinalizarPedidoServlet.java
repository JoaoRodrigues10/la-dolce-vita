package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.EnderecoDao;
import br.com.LaDolceVita.dao.ItensPedidoDao;
import br.com.LaDolceVita.dao.PedidoDao;
import br.com.LaDolceVita.dao.SacolaDao;
import br.com.LaDolceVita.model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet("/finalizar-pedido")
public class FinalizarPedidoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }



}
