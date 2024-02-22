package main.java.br.com.alura.comex;

public class Produto {
    //VARIAVEIS
    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto(String nome) {
        this.nome = nome;
    }

    //METODOS
    public String toString() {
        return ">> Dados do produto \n" +
                ":: Nome: " + this.nome + "\n" +
                ":: Descrição: " + this.descricao;
    }
}
