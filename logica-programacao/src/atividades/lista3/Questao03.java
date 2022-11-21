package lista3;
//      3. Faça um programa que receba a idade de dez pessoas e que calcule e
//      mostre a quantidade de pessoas com idade maior ou igual a 18 anos.

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Criar lista para receber idades do usuário.
        int[] idades;
        idades = new int[10];

        // Criar variavel para contar idades maiores que 18 anos
        int contador = 0;

        //  Criar laço de repetição para receber idades de dez pessoas, adicionando valores ao contador se maior que 18 anos.
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a idade da " + (i + 1) + "ª pessoa: ");
            idades[i] = scan.nextInt();
            if (idades[i] >= 18) {
                contador++;
            }
        }

        // Exibir o resultado
        System.out.println("Entre as pessoas informadas, há um total de " + contador + " pessoas com idade maior ou igual a 18 anos");
    }
}
