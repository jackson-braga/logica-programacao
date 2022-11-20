package lista3;

import java.util.Scanner;

public class Exercicio7 {
    // Escreva um programa para ler 2 valores e se o segundo valor informado for ZERO, deve ser
    // lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir
    // o resultado da divisão do primeiro valor lido pelo segundo valor lido. Acrescentar uma mensagem
    // de 'VALOR INVÁLIDO' no exercício caso o segundo valor informado seja ZERO.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o primeiro número: ");
        double numero1 = input.nextDouble();
        double numero2 = 0;
        double resultadoDivisao = 0;

        do {
            System.out.println("Insira o segundo número: ");
            numero2 = input.nextDouble();
            if (numero2 <= 0) {
                System.out.println("Valor inválido");
            }
        } while (numero2 <= 0);

        resultadoDivisao = numero1/numero2;

        System.out.println("O resultado da divisão de " + numero1 + " por " + numero2 + " é igual a: " + resultadoDivisao);
    }
}
