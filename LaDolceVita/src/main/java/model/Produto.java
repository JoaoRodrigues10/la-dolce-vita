package model;

public class Produto {

    private String id;
    private String name;


    public Produto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Produto(String nomeProduto) {
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
