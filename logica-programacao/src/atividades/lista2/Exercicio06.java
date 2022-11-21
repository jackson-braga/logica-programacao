package atividades.lista2;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        double nota1 = 0, nota2 = 0, media = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nota 1:");
        nota1 = scan.nextDouble();
        while (nota1 < 0) {
            System.out.println("Nota INVÁLIDA!");
            System.out.println("Digite nota 1:");
            nota1 = scan.nextDouble();
        }

        System.out.println("Nota 2:");
        nota2 = scan.nextDouble();
        while (nota2 < 0) {
            System.out.println("Nota INVÁLIDA!");
            System.out.println("Digite nota 2:");
            nota2 = scan.nextDouble();
        }
        media = (nota1 + nota2) / 2;
        if ((media > 9) && (media == 10)) {
            System.out.println("Semestre:");
            System.out.println("Nota 1:" + nota1);
            System.out.println("Nota 2:" + nota2);
            System.out.println("Média:" + media);
            System.out.println("Conceito A: APROVADO");
        } else if ((media > 7.5) && (media == 9)) {
            System.out.println("Semestre:");
            System.out.println("Nota 1:" + nota1);
            System.out.println("Nota 2:" + nota2);
            System.out.println("Média:" + media);
            System.out.println("Conceito B: APROVADO");
        } else if ((media > 6) && (media == 7.5)) {
            System.out.println("Semestre:");
            System.out.println("Nota 1:" + nota1);
            System.out.println("Nota 2:" + nota2);
            System.out.println("Média:" + media);
            System.out.println("Conceito C: APROVADO");
        } else if ((media > 4) && (media == 6)) {
            System.out.println("Semestre:");
            System.out.println("Nota 1:" + nota1);
            System.out.println("Nota 2:" + nota2);
            System.out.println("Média:" + media);
            System.out.println("Conceito D: REPROVADO");
        } else {
            System.out.println("Semestre:");
            System.out.println("Nota 1:" + nota1);
            System.out.println("Nota 2:" + nota2);
            System.out.println("Média:" + media);
            System.out.println("Conceito E: REPROVADO");
        }
    }
}
