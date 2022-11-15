package atividades.lista1;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double altura = sc.nextDouble();

        double resultado = base * altura;

        System.out.println("Área do retangulo é: "+resultado);

        sc.close();
    }

}