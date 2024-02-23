package main.java.br.com.alura.comex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite um número:");
            int numero = leitura.nextInt();
            System.out.println("Número capturado");
        } catch(InputMismatchException e) {
            System.out.println("NÃO PODE SER LETRAS");
            System.out.println("RECOMECE");
        }
    }
}
