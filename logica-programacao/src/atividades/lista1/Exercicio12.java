package atividades.lista1;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a medida dos três lados de um triângulo: ");
        double lA = sc.nextDouble();
        double lB = sc.nextDouble();
        double lC = sc.nextDouble();
        double somaBC = lB + lC;
        double somaAC = lA + lC;
        double somaAB = lA + lB;


        if (lA < somaBC && lB < somaAC && lC < somaAB) {

            System.out.println("O objeto é um triângulo.");
        } else {
            System.out.println("O objeto não é um triângulo.");
        }

        sc.close();


    }
}
