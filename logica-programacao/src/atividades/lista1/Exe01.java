package atividades.lista1;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {

        int base;
        int altura;
        int area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do ret�ngulo:");
        base = scanner.nextInt();

        System.out.println("Digite o valor da altura do ret�ngulo:");
        altura = scanner.nextInt();

        area = base * altura;

        System.out.println("A ar�a do ret�ngulo �: " + area + ".");

    }

}