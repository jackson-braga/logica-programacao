package atividades.lista3;

import java.util.Scanner;

public class Exercicio_09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int entrada;
        int count = 0;
        do {
            System.out.println("Valor de Entrada: ");
            entrada = scan.nextInt();
            if (entrada <= 0) {
                System.out.println("VALOR INVÁLIDO");
            } else {
                for (int i = 1; i <= entrada; i++) {
                    System.out.println(i);
                }
                ++count;
            }
        } while (count < 1);
    }
}
