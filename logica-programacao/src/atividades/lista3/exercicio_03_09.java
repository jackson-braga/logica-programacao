//  9. Ler um valor N e imprimir todos os valores inteiros entre
//  1 (inclusive) e N (inclusive). Poderá ser aceito somente
//  valores maiores que 0 para N. Caso o valor informado (para N)
//  não seja maior que 0, imprima “VALOR INVÁLIDO” e solicite
//  para ler o valor de N novamente.

import java.util.Scanner;

public class exercicio_03_09 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        int numero;
        do {

            System.out.println("Digite um número inteiro e positivo: ");
            numero = scann.nextInt();
            if (numero <= 0) {
                System.out.println("Valor Inválido");

            } else {
                while (numero >= 0) {
                    System.out.println(numero);
                    numero--;
                }
                break;
            }

        } while (numero <= 0);
    }
}