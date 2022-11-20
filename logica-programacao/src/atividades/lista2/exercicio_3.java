package atividades.lista2;

import java.util.Scanner;

public class exercicio_3 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a dimensão do lado A: ");
        a = scanner.nextDouble();
        System.out.println("Digite a dimensão do lado B: ");
        b = scanner.nextDouble();
        System.out.println("Digite a dimensão do lado C: ");
        c = scanner.nextDouble();

        if (a == b && a == c){
            System.out.println("Esse é um triângulo equilátero!");
        } else if (a == b || a == c || b == c) {
            System.out.println("Esse é um triângulo isóceles!");
        }else {
            System.out.println("Esse é um triângulo escaleno!");
        }
    }
}

