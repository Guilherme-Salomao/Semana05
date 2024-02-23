package main.java.br.com.alura.comex;

public class Atividade03 {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setNome("Harry Porter");
        livro.setIsbn("12021");
        System.out.println(livro.Identificar());

        Cliente cliente = new Cliente();
        cliente.setNome("Guilherme");
        cliente.setCpf("12345678900");
        System.out.println(cliente.Identificar());
    }
}
