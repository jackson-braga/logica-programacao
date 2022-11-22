package atividades.lista3;

import java.util.Scanner;

/* 9. Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive)
e N (inclusive). Poderá ser aceito somente valores maiores que 0 para N. Caso
o valor informado (para N) não seja maior que 0, imprima “VALOR INVÁLIDO” e
solicite para ler o valor de N novamente
* */
public class Ex09NumerosInteiros {
    public static void main(String[] args) {


        int n;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Valor de Entrada: ");
            n = in.nextInt();
            if (n <= 0) {
                System.out.println("VALOR INVÁLIDO.");
                continue;
            } else {
                System.out.println("\nContagem dos Números: ");
                for (int i = 1; i <= n; i++) {
                    System.out.println(i);
                }

            }
        } while (n <= 0);
    }
}

