package atividades.lista2;

import java.util.Scanner;

public class exercicio_4 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do ângulo A: ");
        a = scanner.nextDouble();
        System.out.println("Digite o valor do ângulo B: ");
        b = scanner.nextDouble();
        System.out.println("Digite o valor do ângulo C: ");
        c = scanner.nextDouble();

        if (a == 90 || b == 90 || c == 90){
            System.out.println("Esse é um triângulo Retângulo!");
        } else if (a < 90 && b < 90 && c < 90) {
            System.out.println("Esse é um triângulo Acutângulo!");
        }else {
            System.out.println("Esse é um triângulo Obtusângulo!");
        }
    }
}
