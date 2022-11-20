//  11. Faça um programa para ler: quantidade atual em estoque, quantidade máxima em
//  estoque e quantidade mínima em estoque de um produto. Calcular e escrever a
//  quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
//  Se a quantidade em estoque for maior ou igual a quantidade média, escrever a
//  mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.

import java.util.Scanner;

public class exercicio_01_11 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Favor informar a quantidade MÁXIMA do estoque: ");
        int qtdMax = scann.nextInt();
        System.out.println("Favor informar a quantidade MÍNIMA do estoque: ");
        int qtdMin = scann.nextInt();
        System.out.println("Favor informar a quantidade ATUAL do estoque: ");
        int qtdAtual = scann.nextInt();
        int qtdMedia = (qtdMax + qtdMin) / 2;

        if (qtdAtual >= qtdMedia) {
            System.out.println("Não efetuar compra.");
        } else {
            System.out.println("Efetuar compra!");
        }

    }
}
