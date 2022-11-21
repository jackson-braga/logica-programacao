package lista3;

//      3. Faça um programa que receba a idade de dez pessoas e que calcule e mostre:
//          a. A quantidade de pessoas em cada faixa etária;
//          b. A percentagem de pessoas nas faixas etárias, com relação ao total de pessoas:
//              . Até 15 anos
//              . de 16 a 30 anos
//              . de 31 a 45 anos
//              . de 46 a 60 anos
//              . Acima de 61 anos

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Criar lista para receber idades do usuário.
        int[] idades;
        idades = new int[10];

        // Criar variaveis para contar idades em cada faixa etária
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        //  Criar laço de repetição para receber idades de dez pessoas, adicionando valores ao contador se maior que 18 anos.
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a idade da " + (i + 1) + "ª pessoa: ");
            idades[i] = scan.nextInt();
            if (idades[i] <= 15) {
                contador1++;
            } else if (idades[i] >= 16 && idades[i] <= 30) {
                contador2++;
            } else if (idades[i] >= 31 && idades[i] <= 45) {
                contador3++;
            } else if (idades[i] >= 46 && idades[i] <= 60) {
                contador4++;
            } else if (idades[i] >= 61) {
                contador5++;
            }
        }

        // Exibir os resultados
        System.out.println("Entre as pessoas informadas, há um total de:");
        System.out.println(contador1 + " pessoa(s) com idade menor ou igual a 15 anos, o que equivale a " + (contador1 * 10) + "% do total de pessoas.");
        System.out.println(contador2 + " pessoa(s) com idade de 16 a 30 anos, o que equivale a " + (contador2 * 10) + "% do total de pessoas.");
        System.out.println(contador3 + " pessoa(s) com idade de 31 a 45 anos, o que equivale a " + (contador3 * 10) + "% do total de pessoas.");
        System.out.println(contador4 + " pessoa(s) com idade de 46 a 60 anos, o que equivale a " + (contador4 * 10) + "% do total de pessoas.");
        System.out.println(contador5 + " pessoa(s) com idade acima de 61 anos, o que equivale a " + (contador5 * 10) + "% do total de pessoas.");
    }
}