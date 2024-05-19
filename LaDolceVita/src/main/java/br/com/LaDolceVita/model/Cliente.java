package br.com.LaDolceVita.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id;
    private String email;
    private String cpf;
    private String nome;
    private LocalDate dataNascimento;
    private String senha;
    private String telefone;
    private List<Endereco> enderecos;
    private List<Pedido> pedidos;
    private boolean logged;

    public Cliente() {
        this.enderecos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public Cliente(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Cliente(int id, boolean logged){
        this.id =  id;
        this.logged = logged;
    }

    public Cliente(int id, String email, String cpf, String nome, LocalDate dataNascimento, String senha, String telefone, List<Endereco> enderecos, List<Pedido> pedidos) {
        this.id = id;
        this.email = email;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.telefone = telefone;
        this.enderecos = enderecos;
        this.pedidos = pedidos;
    }

    public Cliente(String email, String cpf, String nome, LocalDate dataNascimento, String senha, String telefone, List<Endereco> enderecos, List<Pedido> pedidos) {
        this.email = email;
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.telefone = telefone;
        this.enderecos = enderecos;
        this.pedidos = pedidos;
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public boolean isLogged() {
        return logged;
    }
}
