package br.com.LaDolceVita.model;

public class Endereco {
    private String id_Endereco;
    private String id_Cliente;
    private String cep;
    private String endereco_Rua;
    private String cidade;
    private String bairro;
    private String estado;
    private String numero;
    private String complemento;
    private String referencia;

    public Endereco(String id_Endereco, String id_Cliente, String cep, String endereco_Rua, String cidade, String bairro, String estado, String numero, String complemento, String referencia) {
        this.id_Endereco = id_Endereco;
        this.id_Cliente = id_Cliente;
        this.cep = cep;
        this.endereco_Rua = endereco_Rua;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.numero = numero;
        this.complemento = complemento;
        this.referencia = referencia;
    }

    public Endereco(String id_Cliente, String cep, String endereco_Rua, String cidade, String bairro, String estado, String numero, String complemento, String referencia) {
        this.id_Cliente = id_Cliente;
        this.cep = cep;
        this.endereco_Rua = endereco_Rua;
        this.cidade = cidade;
        this.bairro = bairro;
        this.estado = estado;
        this.numero = numero;
        this.complemento = complemento;
        this.referencia = referencia;
    }

    public String getId_Endereco() {
        return id_Endereco;
    }

    public String getId_Cliente() {
        return id_Cliente;
    }

    public String getEndereco_Rua() {
        return endereco_Rua;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getNumero() {
        return numero;
    }

    public String getEstado() {
        return estado;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getReferencia() {
        return referencia;
    }
}
