package atividades.lista2;

import java.util.Scanner;

public class List02_Ex007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um ano: ");
        int ano = scan.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            System.out.println("O ano é Bissexto");
        } else {
            System.out.println("O ano não é Bissexto");
        }
    }
}
