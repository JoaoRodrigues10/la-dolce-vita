package model;

public class Produto {

    private String name;
    private String id;

    public Produto(String name){
        this.name = name;
    }

    public Produto(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
