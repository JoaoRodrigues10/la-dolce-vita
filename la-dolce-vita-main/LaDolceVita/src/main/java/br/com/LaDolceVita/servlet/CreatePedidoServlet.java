package br.com.LaDolceVita.servlet;

import br.com.LaDolceVita.dao.ClienteDao;
import br.com.LaDolceVita.dao.ItensPedidoDao;
import br.com.LaDolceVita.model.ItensPedido;
import br.com.LaDolceVita.model.Pedido;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@WebServlet("/create-pedido")
public class CreatePedidoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Recupera o nome de usuário logado da sessão
        String usuarioLogado = (String) req.getSession().getAttribute("usuarioLogado");

        String id_Pedido = gerarIdPedido();
        ClienteDao clienteDao = new ClienteDao();
        String id_Cliente = clienteDao.getClienteIdByUsuario(usuarioLogado);
        String id_Endereco = clienteDao.getEnderecoIdPorClienteId(id_Cliente);
        String id_ItensPedido;
        LocalDateTime dataHoraAtual = LocalDateTime.now();
        String status = "Em Processamento";

        //Pedido pedido = new Pedido(id_Cliente, id_Endereco, id_ItensPedido, valor_Total, dataHoraAtual,status);



    }

    public String gerarIdPedido() {

        return UUID.randomUUID().toString();
    }
}
