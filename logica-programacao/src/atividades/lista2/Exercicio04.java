package atividades.lista2;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o valor da base do triângulo:");
        int base = sc.nextInt();
        System.out.println("Entre com o valor da altura do triângulo:");
        int altura = sc.nextInt();

        int calcArea = (base * altura) / 2;

        if (calcArea == 90) {
            System.out.println("Triângulo Retângulo");
        } else if (calcArea > 90 && calcArea < 180) {
            System.out.println("Triângulo Obtusângulo");
        } else {
            System.out.println("Triângulo Acutângulo");
        }

        sc.close();
    }
}
