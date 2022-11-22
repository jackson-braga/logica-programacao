package atividades.lista3;

/* 7. Escreva um programa para ler 2 valores e se o segundo valor informado for ZERO,
deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor
zero e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.
Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício caso o segundo valor informado
seja ZERO
* */

import java.util.Scanner;

public class Ex07DivisaoPor0 {

    public static void main(String[] args) {

        double n1, n2, divisao;
        Scanner in = new Scanner(System.in);

        System.out.println(" Digite dois números: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        while (n2 == 0) {
            System.out.println("Valor Inválido. O segundo número terá que ser diferente de 0.");
            System.out.print(" Digite um número diferente de Zero: ");
            n2 = in.nextDouble();
        }


        divisao = n1 / n2;

        System.out.printf("\nA divisãao de %.2f dividido por %.2f é %.2f.\n", n1, n2, divisao);
    }

}

