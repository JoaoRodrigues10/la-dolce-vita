package br.com.LaDolceVita.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id_Pedido;
    private String id_Cliente;
    private String id_Endereco;
    private String id_ItensPedido;
    private BigDecimal valor_Total;
    private LocalDateTime dataPedido;
    private String status;

    public Pedido(String id_Pedido, String id_Cliente, String id_Endereco, String id_ItensPedido, BigDecimal valor_Total, LocalDateTime dataPedido, String status) {
        this.id_Pedido = id_Pedido;
        this.id_Cliente = id_Cliente;
        this.id_Endereco = id_Endereco;
        this.id_ItensPedido = id_ItensPedido;
        this.valor_Total = valor_Total;
        this.dataPedido = dataPedido;
        this.status = status;
    }

    public Pedido(String id_Cliente, String id_Endereco, String id_ItensPedido, BigDecimal valor_Total, LocalDateTime dataPedido, String status) {
        this.id_Cliente = id_Cliente;
        this.id_Endereco = id_Endereco;
        this.id_ItensPedido = id_ItensPedido;
        this.valor_Total = valor_Total;
        this.dataPedido = dataPedido;
        this.status = status;
    }


    public String getId_Pedido() {
        return id_Pedido;
    }

    public String getId_Cliente() {
        return id_Cliente;
    }

    public String getId_Endereco() {
        return id_Endereco;
    }

    public String getId_ItensPedido() {
        return id_ItensPedido;
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
