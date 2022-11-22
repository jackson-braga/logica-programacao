package lista3;

//      9. Ler um valor N e imprimir todos os valores inteiros entre 1 (inclusive) e N (inclusive). Poderá ser aceito somente valores
//      maiores que 0 para N. Caso o valor informado (para N) não seja maior que 0, imprima “VALOR INVÁLIDO” e solicite para ler
//      o valor de N novamente.

import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valorN;
        System.out.println("Informe um número: ");
        valorN = scan.nextInt();
        if (valorN != 0) {
            System.out.println("Estes são os números inteiros positivos até o número informado: ");
            for (int i = 1; i <= valorN; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("VALOR INVÁLIDO");
        }
    }
}