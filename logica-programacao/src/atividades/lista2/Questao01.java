package lista2;

//      1. Para doar sangue é necessário ter entre 18 e 67 anos.
//      Faça um aplicativo que pergunte a idade de uma pessoa
//      e diga se ela pode doar sangue ou não.

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

        // Criar variável e receber idade do usuário
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a sua idade: ");
        int idade = scan.nextInt();

        // Calcular e informar se o usuário pode doar sangue

        if(idade >= 18 && idade <= 67) {
            System.out.println("Você pode doar sangue.");
        } else {
            System.out.println("Você não pode doar sangue.");
        }
    }
}
