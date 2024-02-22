package main.java.br.com.alura.comex;

public class Atividade05 {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.nome = "Guilherme Salomão";

        Endereco endereco = new Endereco();
        endereco.cidade = "Araçatuba";

        cliente.endereco = endereco;

        System.out.println(cliente.nome + " reside na cidade de " + cliente.endereco.cidade);
    }
}
