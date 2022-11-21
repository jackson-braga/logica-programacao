/*Lista de Exercícios 3
Exercício 7:
Escreva um programa para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja,
para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo
valor lido. Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício caso o segundo valor informado seja ZERO.
 */

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        double valor1 = scann.nextDouble();

        double valor2;
        do {
            System.out.println("Informe o segundo valor: ");
            valor2 = scann.nextDouble();

            if (valor2 == 0) {
                System.out.println("Digite um valor válido.");
            }

        } while (valor2 == 0);

        double resultado = valor1 / valor2;
        System.out.println("O resultado da divisão é " + resultado);
    }

    }
