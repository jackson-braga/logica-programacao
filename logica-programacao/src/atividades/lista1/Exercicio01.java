package atividades.lista1;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double b = 0, h = 0;
        double a = 0;
        do {
            System.out.println("Base:");
            b = scan.nextDouble();
            System.out.println("Altura:");
            h = scan.nextDouble();
            if ((b <= 0) || (h <= 0)) {
                System.out.println("Valor Inválido!");
            }
        } while ((b <= 0) || (h <= 0));
        a = b * h;
        System.out.println("Area:" + a);
    }
}
