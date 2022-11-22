package atividades.lista1;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com as três notas do aluno: ");
        System.out.print("Entre com a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.print("Entre com a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.print("Entre com a terceira nota: ");
        double n3 = sc.nextDouble();

        double somaNotas = ((n1 * 2) + (n2 * 3) + (n3 + 5)) / (2 + 3 + 5);

        System.out.println("A média final é: " + somaNotas);


        sc.close();

    }
}
