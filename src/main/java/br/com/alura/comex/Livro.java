package main.java.br.com.alura.comex;

public class Livro extends Produto implements Identificar {
    private String isbn;
    private int totalPaginas;
    public Livro() {super(nome);}
    public String getIsbn() {return isbn;}
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getTotalPaginas() {
        return totalPaginas;
    }
    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }
    @Override
    public String Identificar() {
        return "O objeto Livro identificável tem o nome: " + this.getNome() +" e ISBN "+ this.getIsbn();
    }
}
