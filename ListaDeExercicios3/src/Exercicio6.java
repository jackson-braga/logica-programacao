/*Lista de Exercícios 3
Exercício 6:
Faça um programa que apresente o menu de opções a seguir:
Menu de opções:
1. Média aritmética
2. Média ponderada
3. Sair
Digite a opção desejada:
● Na opção 1: receber duas notas, calcular e mostrar a média aritmética.
● Na opção 2: receber três notas e seus respectivos pesos, calcular e mostrar a média ponderada.
● Na opção 3: sair do programa.
Verifique a possibilidade de opção inválida, mostrando uma mensagem.

 */

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int escolha;
        do {
            System.out.println("Selecione o número da operação desejada:");
            System.out.println("1. Média Aritmética");
            System.out.println("2. Média Ponderada");
            System.out.println("3. Sair");

            escolha = scann.nextInt();
            if (escolha < 1 || escolha > 3) {
                System.out.println("Escolha uma opção válida.");

            } else if (escolha == 1) {
                System.out.println("Informe o primeiro número:");
                double valor1 = scann.nextDouble();
                System.out.println("Informe o segundo número:");
                double valor2 = scann.nextDouble();
                double resultado = (valor1 + valor2) / 2;
                System.out.println("O resultado da média aritmética é: " + resultado);

            } else if (escolha == 2) {
                System.out.println("Informe o primeiro número:");
                double valor1 = scann.nextDouble();
                System.out.println("Informe o peso desse valor:");
                double peso1 = scann.nextDouble();
                System.out.println("Informe o segundo número:");
                double valor2 = scann.nextDouble();
                System.out.println("Informe o peso desse valor:");
                double peso2 = scann.nextDouble();
                System.out.println("Informe o terceiro número:");
                double valor3 = scann.nextDouble();
                System.out.println("Informe o peso desse valor:");
                double peso3 = scann.nextDouble();
                double somaPeso = peso1 + peso2 + peso3;
                double resultado = ((valor1 * peso1) + (valor2 * peso2) + (valor3 * peso3)) / somaPeso;

                System.out.println("O resultado da média ponderada é: " + resultado);
            }

        } while (escolha != 3);
        System.out.println("Sistema encerrado.");

    }
}
