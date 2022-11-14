//  6. Faça um programa que leia as duas notas parciais obtidas por
//  um aluno numa disciplina ao longo de um semestre, e calcule
//  a sua média. A atribuição de conceitos obedece à tabela abaixo:
//  Média de aproveitamento Conceito
//  Entre 9.0 e 10.0        A
//  Entre 7.5 e 9.0         B
//  Entre 6.0 e 7.5         C
//  Entre 4.0 e 6.0         D
//  Entre 4.0 e 0           E
//  O programa deve mostrar na tela as notas, a média, o conceito
//  correspondente e a mensagem “APROVADO” se o conceito for A,
//  B ou C “REPROVADO” se o conceito for D ou E.

import java.util.Scanner;

public class exercicio_02_06 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Entre com sua primeira nota: ");
        double nota1 = scann.nextDouble();
        System.out.println("Entre com sua segunda nota: ");
        double nota2 = scann.nextDouble();
        double media = (nota1 + nota2) / 2;
        String conceito = null;

        System.out.println("Suas notas foram: " + nota1 + " e " + nota2);
        System.out.println("Sua média foi: " + media);

        if (media >= 9 && media <= 10) {
            conceito = "A";
            System.out.println("Seu conceito foi: " + conceito);
            System.out.println("Você está APROVADO");

        } else if (media >= 7.5 && media < 9) {
            conceito = "B";
            System.out.println("Seu conceito foi: " + conceito);
            System.out.println("Você está APROVADO");

        } else if (media >= 6 && media < 7.5) {
            conceito = "C";
            System.out.println("Seu conceito foi: " + conceito);
            System.out.println("Você está APROVADO");

        } else if (media >= 4 && media < 6) {
            conceito = "D";
            System.out.println("Seu conceito foi: " + conceito);
            System.out.println("Você está REPROVADO");

        } else if (media > 4) {
            conceito = "E";
            System.out.println("Seu conceito foi: " + conceito);
            System.out.println("Você está REPROVADO");

        } else {
            System.out.println("Você digitou alguma nota de forma incorreta. Refaça o processo.");
        }

    }
}
