//  7. Escreva um programa para ler 2 valores e se o segundo valor
//  informado for ZERO, deve ser lido um novo valor, ou seja, para
//  o segundo valor não pode ser aceito o valor zero e imprimir o
//  resultado da divisão do primeiro valor lido pelo segundo valor
//  lido. Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício
//  caso o segundo valor informado seja ZERO.

import java.util.Scanner;

public class exercicio_03_07 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Vamos dividir!");
        System.out.println("Informe o valor a ser dividido: ");
        double dividendo = scann.nextDouble();

        double divisor;
        do {
            System.out.println("Digite qual será o divisor: ");
            divisor = scann.nextDouble();

            if (divisor == 0) {
                System.out.println("VALOR INVÁLIDO");
            }

            } while (divisor == 0);

        double resultado = dividendo / divisor;
        System.out.println("O resultado da divisão é " + resultado);
    }
}
