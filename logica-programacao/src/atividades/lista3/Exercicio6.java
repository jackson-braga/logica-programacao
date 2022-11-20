package lista3;

import java.util.Scanner;

public class Exercicio6 {
    // Faça um programa que apresente o menu de opções a seguir:
    //Menu de opções:
    //1. Média aritmética
    //2. Média ponderada
    //3. Sair
    //Digite a opção desejada:
    //● Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
    //● Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
    //● Na opção 3: sair do programa.
    //Verifique a possibilidade de opção inválida, mostrando uma mensagem.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1 - Média Aritmética");
        System.out.println("2 - Média Ponderada");
        System.out.println("3 - Sair");
        System.out.println("Escolha uma das operações acima: ");
        int indexOp = input.nextInt();

        if ((indexOp < 1) || (indexOp > 3)) {
            System.out.println("\nOperação inválida!\n");
        }

        if (indexOp == 1) {
            System.out.println("Informe a primeira nota:");
            double nota1 = input.nextDouble();
            System.out.println("Informe a segunda nota:");
            double nota2 = input.nextDouble();
            double mediaAritmetica = (nota1 + nota2) / 2;
            System.out.println("Média Aritmética = " + mediaAritmetica);
        }

        double[] notas = new double[3];
        double[] pesos = new double[3];
        double mediaPonderada = 0;

        if (indexOp == 2) {
            System.out.println("Informe as três notas:");
            for (int i = 0; i < notas.length; i++) {
                notas[i] = input.nextDouble();
            }
            System.out.println("Informe os três pesos:");
            for (int i = 0; i < pesos.length; i++) {
                pesos[i] = input.nextDouble();
            }
            mediaPonderada = (notas[0] * pesos[0] + notas[1] * pesos[1] + notas[2] * pesos[2]) / (pesos[0] + pesos[1] + pesos[2]);

            System.out.println("Média Ponderada = " + mediaPonderada);
        }

        if(indexOp == 3) {
            return;
        }
    }
}
