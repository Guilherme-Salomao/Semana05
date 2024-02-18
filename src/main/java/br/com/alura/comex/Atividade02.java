package br.com.alura.comex;

public class Atividade02 {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular");
        produto.setDescricao("Iphone 14");

        System.out.println(produto.getNome());
    }
}
