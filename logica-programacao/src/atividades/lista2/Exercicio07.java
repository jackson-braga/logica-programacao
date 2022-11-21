package atividades.lista2;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int ano = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ano:");
        ano = scan.nextInt();
        while (ano <= 0) {
            System.out.println("ANO INVÁLIDA!");
            System.out.println("Digite ANO:");
            ano = scan.nextInt();
        }

        if (((ano % 4 == 0) && (ano % 100 != 0)) || (ano % 400 == 0)) {
            System.out.println("BISSEXTO!");
        } else {
            System.out.println("Não é BISSEXTO");
        }
    }

}
