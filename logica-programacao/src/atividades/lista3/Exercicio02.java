package atividades.lista3;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("A:");
        a = scan.nextDouble();
        System.out.println("B:");
        b = scan.nextDouble();
        System.out.println("C:");
        c = scan.nextDouble();
        System.out.println("VALORES LIDOS:");
        System.out.println("A:" + a + " B:" + b + " C:" + c);

        if ((a >= b) && (b >= c)) {
            System.out.println("ORDEM CRESCENTE:");
            System.out.println("C:" + c + " B:" + b + " A:" + a);
            System.out.println("ORDEM DECRESCENTE:");
            System.out.println("A:" + a + " B:" + b + " C:" + c);

        } else if ((a >= c) && (c >= b)) {
            System.out.println("ORDEM CRESCENTE:");
            System.out.println("B:" + b + " C:" + c + " A:" + a);
            System.out.println("ORDEM DECRESCENTE:");
            System.out.println("A:" + a + " C:" + c + " B:" + b);
        } else if ((b >= c) && (c >= a)) {
            System.out.println("ORDEM CRESCENTE:");
            System.out.println("A:" + a + " C:" + c + " B:" + b);
            System.out.println("ORDEM DECRESCENTE:");
            System.out.println("B:" + b + " C:" + c + " A:" + a);
        } else if ((b >= a) && (a >= c)) {
            System.out.println("ORDEM CRESCENTE:");
            System.out.println("C:" + c + " A:" + a + " B:" + b);
            System.out.println("ORDEM DECRESCENTE:");
            System.out.println("B:" + b + " A:" + a + " C:" + c);
        } else if ((c >= a) && (a >= b)) {
            System.out.println("ORDEM CRESCENTE:");
            System.out.println("B:" + b + " A:" + a + " C:" + c);
            System.out.println("ORDEM DECRESCENTE:");
            System.out.println("C:" + c + " A:" + a + " B:" + b);
        } else if ((c >= b) && (b >= a)) {
            System.out.println("ORDEM CRESCENTE:");
            System.out.println("A:" + a + " B:" + b + " C:" + c);
            System.out.println("ORDEM DECRESCENTE:");
            System.out.println("C:" + c + " B:" + b + " A:" + a);
        }
    }
}
