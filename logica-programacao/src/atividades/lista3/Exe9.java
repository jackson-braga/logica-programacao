package atividades.lista3;

import java.util.Scanner;

/**
 * @author CrisMoura on 20/11/2022
 */
public class Exe9 {
    public static void main(String[] args) {
//        Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Poderá ser
//        aceito somente valores maiores que 0 para N. Caso o valor informado (para N) não seja maior que 0,
//        imprima “VALOR INVÁLIDO” e solicite para ler o valor de N novamente.

        int N;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Digite o valor de N");
            N = input.nextInt();
            if (N <= 0) {
                System.out.println("VALOR INVÁLIDO");
            } else {
                for (int i = 1; i <= N; i++) {
                    System.out.println(i);
                }
            }
        } while (N <= 0);
    }
}
