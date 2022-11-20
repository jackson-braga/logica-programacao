package lista3;

import java.util.Scanner;

public class Exercicio9 {
    // Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive).
    // Poderá ser aceito somente valores maiores que 0 para N. Caso o valor informado (para N)
    // não seja maior que 0, imprima “VALOR INVÁLIDO” e solicite para ler o valor de N novamente.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int valorN = 0;

        do {
            System.out.println("Insira um número inteiro: ");
            valorN = input.nextInt();

            if (valorN > 0) {
                for (int i = 1; i <= valorN; i++) {
                    System.out.print(i);
                    if (i < valorN) {
                        System.out.print(", ");
                    }
                }
            } else {
                System.out.println("Valor inválido");
            }
        } while (valorN <= 0);
    }
}

