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
import java.util.ArrayList;
import java.util.List;

@WebServlet("/finalizar-pedido")
public class FinalizarPedidoServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PedidoDao pedidoDao = new PedidoDao();

        // Obtendo o ID do cliente da sessão
        int idCliente = (Integer) request.getSession().getAttribute("id");

        // Obtendo o ID do endereço selecionado
        int idEndereco = Integer.parseInt(request.getParameter("enderecoSelecionado"));

        SacolaDao sacolaDao = new SacolaDao();
        List<Sacola> sacolaCliente = sacolaDao.findSacolaByClienteId(idCliente);
        BigDecimal valorTotal = calcularValorTotal(sacolaCliente);

        // Data da compra
        LocalDateTime dataCompra = LocalDateTime.now();

        // Status inicial do pedido
        String status = "Em andamento";

        // Criando o objeto Pedido
        Pedido pedido = new Pedido(idCliente, idEndereco, valorTotal, dataCompra, status);

        // Criando o pedido no banco de dados
        pedidoDao.createPedido(pedido, request);

        //intancia objeto pedido com o id do pedido
        int idPedido = (Integer) request.getSession().getAttribute("idPedido");
        ItensPedido itensPedido = new ItensPedido(idPedido);

        //itera a sacola adicionando produto e quantidade a lista "itemProduto"
        //dentro da classe itensPedido
        for(Sacola item : sacolaCliente){
            Produto produto = item.getProduto();
            int quantidade = item.getQuantidade();
            itensPedido.adicionarItem(produto,quantidade);
        }

        //instancia itensPedidoDao e faz o insert de ItensPedido no banco de dados
        //mandando itensPedido como parametro
        ItensPedidoDao itensPedidoDao = new ItensPedidoDao();
        itensPedidoDao.createItensPedido(itensPedido);

        // Limpando a sacola do cliente
        sacolaDao.LimparSacolaByClienteId(idCliente);

        response.sendRedirect("/pagina-de-confirmacao.jsp");
    }

    private BigDecimal calcularValorTotal(List<Sacola> sacolaCliente) {
        BigDecimal valorTotal = BigDecimal.ZERO;
        for (Sacola item : sacolaCliente) {
           BigDecimal precoItem = item.getProduto().getPreco();
            valorTotal = valorTotal.add(precoItem.multiply(BigDecimal.valueOf(item.getQuantidade())));
        }
        return valorTotal;
    }



}
