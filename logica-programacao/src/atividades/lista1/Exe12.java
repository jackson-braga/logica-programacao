package atividades.lista1;

import java.util.Scanner;

public class Exe12 {
    public static void main(String[] args) {

        int ladoA;
        int ladoB;
        int ladoC;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor lado A:");
        ladoA = scanner.nextInt();

        System.out.println("Valor lado B:");
        ladoB = scanner.nextInt();

        System.out.println("Valor lado C:");
        ladoC = scanner.nextInt();

        if ((ladoA < (ladoB + ladoC)) && (ladoB < (ladoA + ladoC)) && (ladoC < (ladoA + ladoB))) {
            System.out.println("� um tri�ngulo!");

        } else {
            System.out.println("N�o � um tri�ngulo!");

        }

    }

}
