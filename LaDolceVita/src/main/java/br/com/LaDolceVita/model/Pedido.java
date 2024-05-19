package br.com.LaDolceVita.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int id_Pedido;
    private int id_Cliente;
    private int id_Endereco;
    private BigDecimal valor_Total;
    private LocalDateTime dataPedido;
    private String status;

    public Pedido(int id_Pedido, int id_Cliente, int id_Endereco, BigDecimal valor_Total, LocalDateTime dataPedido, String status) {
        this.id_Pedido = id_Pedido;
        this.id_Cliente = id_Cliente;
        this.id_Endereco = id_Endereco;
        this.valor_Total = valor_Total;
        this.dataPedido = dataPedido;
        this.status = status;
    }

    public Pedido(int id_Cliente, int id_Endereco, BigDecimal valor_Total, LocalDateTime dataPedido, String status) {
        this.id_Cliente = id_Cliente;
        this.id_Endereco = id_Endereco;
        this.valor_Total = valor_Total;
        this.dataPedido = dataPedido;
        this.status = status;
    }


    public int getId_Pedido() {
        return id_Pedido;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public int getId_Endereco() {
        return id_Endereco;
    }


    public BigDecimal getValor_Total() {
        return valor_Total;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public String getStatus() {
        return status;
    }
}
