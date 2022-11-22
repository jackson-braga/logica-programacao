package atividades.lista3;

import java.util.Scanner;

/* 6. Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada:
● Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
● Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
● Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.
* */

public class Ex06MediaSimplesPonderada {

    public static void main(String[] args) {

        int op = 0;
        double media, somaNota, somaPesos;
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("\nMenu de opções:\n 1. Média aritmética\n 2. Média ponderada\n 3. Sair\n");
            System.out.print("Digite a opção desejada: ");
            op = in.nextInt();
            System.out.println();

            switch (op) {
                case 1:
                    somaNota = 0;
                    double[] nota = new double[2];
                    for (int i = 0; i < nota.length; i++) {
                        System.out.printf("Digite a %dº nota: ", (i + 1));
                        nota[i] = in.nextDouble();
                        somaNota += nota[i];
                    }

                    media = (somaNota / nota.length);
                    System.out.printf("A média Aritmética das notas %.1f e %.1f é %.1f.\n", nota[0], nota[1], media);
                    break;

                case 2:
                    somaNota = 0;
                    somaPesos = 0;
                    double[] notas = new double[3];
                    double[] pesos = new double[3];
                    for (int i = 0; i < notas.length; i++) {
                        System.out.printf("Digite a %dº nota: ", (i + 1));
                        notas[i] = in.nextDouble();
                        System.out.printf("Digite o peso da %dº nota: ", (i + 1));
                        pesos[i] = in.nextDouble();
                        somaPesos += pesos[i];
                        somaNota += notas[i] * pesos[i];
                    }

                    media = (somaNota / somaPesos);
                    System.out.printf(" A média Aritmética das notas %.1f %.1f e %.1f é %.1f.\n", notas[0], notas[1], notas[2], media);
                    break;
                case 3:
                    System.out.println("Saindo da Aplicação! Obrigado e volte sempre!\n");
                    break;
                default:
                    System.out.println("Opção Inválida. Tente novamente!\n");
            }

        } while (op != 3);


    }
}
