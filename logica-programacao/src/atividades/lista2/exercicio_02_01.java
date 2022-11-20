//  1. Para doar sangue é necessário ter entre 18 e 67 anos. Faça um
//  aplicativo que pergunte a idade de uma pessoa e diga se ela
//  pode doar sangue ou não.

import java.util.Scanner;

public class exercicio_02_01 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Qual sua idade? ");
        int idade = scann.nextInt();

        if (idade >= 18 && idade <= 67) {
            System.out.println("Você pode doar sangue.");
        } else {
            System.out.println("Você não pode doar sangue.");
        }
    }
}