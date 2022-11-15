package atividades.lista2;

import java.util.Scanner;

public class Exercicio1 {
    /**
     * 1. Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte a idade de uma pessoa e diga se ela
     * pode doar sangue ou não.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Informe a idade do doador: ");
        int idade = scann.nextInt();
        if (idade >= 18 && idade <= 67) {
            System.out.println("Pode ser doador.");
        } else {
            System.out.println("Não pode ser doador.");
        }
    }
}
