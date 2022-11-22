package atividades.lista3;

import java.util.Scanner;

/**
 * @author CrisMoura on 20/11/2022
 */
public class Exe6 {
    public static void main(String[] args) {
// Faça um programa que apresente o menu de opções a seguir:
// Menu de opções:
//        1. Média aritmética
//        2. Média ponderada
//        3. Sair
//        Digite a opção desejada:
//● Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
//● Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
//● Na opção 3: sair do programa.
//                Verifique a possibilidade de opção inválida, mostrando uma mensagem.
        Scanner input = new Scanner(System.in);
        int opcoesEscolhida = 0;

        do {

            System.out.println("Escolha :");
            System.out.println("1. Média aritmética.");
            System.out.println("2. Média ponderada.");
            System.out.println("3. Sair.\n");

            opcoesEscolhida  = input.nextInt();

            if (opcoesEscolhida == 1){
                System.out.println("Digite Nota 1");
                double nota1 = input.nextDouble();
                System.out.println("Digite Nota2");
                double nota2 = input.nextDouble();
               double resultado = (nota1 + nota2)/ 2;
                System.out.println("Média Aritmética :  " + resultado + "\n\n");

            } else if (opcoesEscolhida == 2) {
                System.out.println("Digite Nota 1");
                double nota1 = input.nextDouble();
                System.out.println("Digite Peso da Nota 1");
                double peso1 = input.nextDouble();

                System.out.println("Digite Nota2");
                double nota2 = input.nextDouble();
                System.out.println("Digite Peso da Nota 2");
                double peso2 = input.nextDouble();

                System.out.println("Digite Nota3");
                double nota3 = input.nextDouble();
                System.out.println("Digite Peso da Nota 3");
                double peso3 = input.nextDouble();

                double resultado = ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
                System.out.printf("Média Ponderada :  %.2f\n\n", resultado);
            }else if (opcoesEscolhida>3){
                System.out.println("\n##########Opção Inválida##########\n");
            }

        }while (opcoesEscolhida !=3);
        System.out.println("**********Saindo do Programa**********\n");


    }
}
