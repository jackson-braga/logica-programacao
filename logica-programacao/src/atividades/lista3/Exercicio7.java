package atividades.lista3;

import java.util.Scanner;

public class Exercicio7 {
    /**
     * 7. Escreva um programa para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja,
     * para o segundo valor não pode ser aceito o valor zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo
     * valor lido. Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício caso o segundo valor informado seja ZERO.
     */
    static Scanner scann = new Scanner(System.in);
    public static void main(String[] args) {
        double divisor, divisivel, quociente;
        System.out.print("Informe o primeiro valor a ser o divisível: ");
        divisivel = scann.nextDouble();
        do {
            System.out.print("Informe o segundo valor a ser o dividor: ");
            divisor = scann.nextDouble();
            if(divisor==0) System.out.println("Não é possível dividir um número por zero, VALOR INVÁLIDO, informe um número válido.");
        }while (divisor==0);
        quociente = divisivel/divisor;
        System.out.printf("O resultado desta operação é: %.4f",quociente);
    }
}
