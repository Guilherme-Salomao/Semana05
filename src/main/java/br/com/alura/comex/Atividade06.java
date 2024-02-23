package main.java.br.com.alura.comex;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        try {
            Scanner leitura = new Scanner(System.in);
            System.out.println("Digite um número:");
            int numero = leitura.nextInt();

            String endereco = "https://fakestoreapi.com/products/"+numero;
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            System.out.println("NÃO PODE SER LETRAS");
            System.out.println("RECOMECE");
        }
    }
}
