package main.java.br.com.alura.comex;

public class Cliente implements Identificavel {
    String nome;
    String cpf;
    String email;
    String profissao;
    String telefone;
    Endereco endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    private String getCPF() {
        return cpf;
    }

    public String getIdentificacao() {
        return "Essa é a identificação: Nome " + this.getNome() + " e CPF " + this.getCPF();
    }

}
