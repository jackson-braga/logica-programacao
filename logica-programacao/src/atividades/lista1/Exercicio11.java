package lista1;

import java.util.Scanner;

public class Exercicio11 {
    // Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque
    // de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
    // Se a quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem 'Não efetuar compra', senão
    // escrever a mensagem 'Efetuar compra'.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantidade atual em estoque: ");
        int quantAtual = input.nextInt();

        System.out.println("Quantidade máxima: ");
        int quantMaxima = input.nextInt();

        System.out.println("Quantidade mínima: ");
        int quantMinima = input.nextInt();

        double quantMedia = (quantMaxima + quantMinima)/2;
        System.out.println("Quantidade média: " + quantMedia);

        if (quantAtual >= quantMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }
    }
}
