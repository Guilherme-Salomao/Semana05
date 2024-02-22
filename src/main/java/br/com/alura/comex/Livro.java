package main.java.br.com.alura.comex;

public class Livro extends Produto implements Identificavel {
    private String isbn;
    private int totalPaginas;

    public Livro(String nome) {
        super(nome);
    }

    public String getIdentificacao() {
        return "O objeto Livro identificável tem o nome: " + this.getNome() +" e ISBN "+ this.getIsbn();
    }
}
