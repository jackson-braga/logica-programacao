package atividades.lista1;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Entre com a segunda nota: ");
        double nota2 = sc.nextDouble();
        double mediaNotas = (nota1 + nota2) / 2;

        if (mediaNotas >= 6) {
            System.out.printf("Aluno aprovado. Média das notas foram " + mediaNotas + ".");
        } else {
            System.out.printf("Aluno reprovado. Média das notas foram " + mediaNotas + ".");
        }

        sc.close();
    }
}
