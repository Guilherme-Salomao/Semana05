package br.com.alura.comex;

public class Atividade03 {
    public static void main(String[] args) {

        Produto produtoA = new Produto("Celular");
        produtoA.setDescricao("Iphone 14");

        Produto produtoB= new Produto("Celular");
        produtoB.setDescricao("Iphone 14");

        System.out.println(produtoA == produtoB);
    }
}
