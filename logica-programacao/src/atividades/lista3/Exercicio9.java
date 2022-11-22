package atividades.lista3;

import java.util.Scanner;

public class Exercicio9 {
    /**
     * 9. Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Poderá ser aceito somente valores
     * maiores que 0 para N. Caso o valor informado (para N) não seja maior que 0, imprima “VALOR INVÁLIDO” e solicite para ler
     * o valor de N novamente.
     */
    static Scanner scann = new Scanner(System.in);

    public static void main(String[] args) {
        int n, valor = 0;
        do {
            System.out.print("Informe o valor N para gerar a lista: ");
            n = scann.nextInt();
            if (n <= 0) System.out.println("VALOR INVÁLIDO. Inseira um valor válido (maior que zero).");
        } while (n <= 0);
        double numeros[] = new double[n];
        for (int i = 0; i < numeros.length; ++i) numeros[i] = ++valor;
        for (double numero : numeros) System.out.printf("%.0f \n", numero);
    }
}
