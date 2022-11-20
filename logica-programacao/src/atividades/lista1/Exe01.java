package atividades.lista1;

import java.util.Scanner;

public class Exe01 {
    public static void main(String[] args) {

        int base;
        int altura;
        int area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo:");
        base = scanner.nextInt();

        System.out.println("Digite o valor da altura do retângulo:");
        altura = scanner.nextInt();

        area = base * altura;

        System.out.println("A aréa do retângulo é: " + area + ".");

    }

}