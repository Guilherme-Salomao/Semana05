package main.java.br.com.alura.comex;

public class Cliente implements Identificar {
    private String nome;
    private String cpf;
    private String email;
    private String profissao;
    private String telefone;
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
    @Override
    public String Identificar() {
        return "O objeto Cliente identificável tem o nome: " + this.getNome() + " e CPF " + this.getCPF();
    }
}
