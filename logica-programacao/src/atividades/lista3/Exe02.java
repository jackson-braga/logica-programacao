package atividades.lista3;

import java.util.Arrays;
import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {

        int[] valores = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor A:");
        valores[0] = scanner.nextInt();

        System.out.println("Valor B:");
        valores[1] = scanner.nextInt();

        System.out.println("Valor C:");
        valores[2] = scanner.nextInt();

        System.out.println("Ordem digitada:");
        System.out.println(valores[0] + "    " + valores[1] + "    " + valores[2]);

        Arrays.sort(valores);

        System.out.println("Ordem crescente:");

        for (int index = 0; index < valores.length; index++) {
            System.out.print(valores[index] + "    ");

        }

        System.out.println();
        System.out.println("Ordem decrescente:");

        for (int index = valores.length; index != 0; index--) {
            System.out.print(valores[index - 1] + "    ");

        }

    }

}
