package atividades.lista1;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double n1 = 0, n2 = 0, n3 = 0, media = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nota 1:");
        n1 = scan.nextInt();
        System.out.println("Nota 2:");
        n2 = scan.nextInt();
        System.out.println("Nota 3:");
        n3 = scan.nextInt();
        media = ((n1*2)+(n2*3)+(n3*5))/(2+3+5);
        System.out.println("Média Final:" + media);
    }
}
