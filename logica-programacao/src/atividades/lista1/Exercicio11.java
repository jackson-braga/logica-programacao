package atividades.lista1;

import java.util.Scanner;

public class Exercicio11 {
    /**
     * 11. Faça um programa para ler: quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque
     * de um produto. Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
     * Se a quantidade em estoque for maior ou igual a quantidade média, escrever a mensagem 'Não efetuar compra', senão
     * escrever a mensagem 'Efetuar compra'.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe a quantidade atual em estoque: ");
        int eAtual = scann.nextInt();
        System.out.print("Informe a quantidade máxima em estoque: ");
        int eMaxima = scann.nextInt();
        System.out.print("Informe a quantidade minima em estoque: ");
        int eMinima = scann.nextInt();
        int media = ((eMaxima + eMinima) / 2);
        if (eAtual >= media) System.out.println("\nNão efetuar compra");
        else System.out.println("\nEfetuar compra");
    }
}
