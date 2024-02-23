package main.java.br.com.alura.comex;

public class Eletronico extends Produto {
    private int voltagem;
    private int potencia;

    public Eletronico(String nome) {
        super(nome);
    }

    public int getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
