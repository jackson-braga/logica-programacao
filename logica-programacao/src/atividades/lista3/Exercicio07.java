package atividades.lista3;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com dois valores: ");
        double valor1 = sc.nextDouble();
        double valor2 = sc.nextDouble();

        double divisao = valor1 / valor2;

        if (valor2 >= 0){
            System.out.println("Resultado da divisão: " + divisao);
        } else {
            System.out.println("Segundo valor invalido, digite um número maior que zero");
        }

        sc.close();
    }
}
