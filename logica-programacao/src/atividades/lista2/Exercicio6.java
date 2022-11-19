package lista2;

import java.util.Scanner;

public class Exercicio6 {
    // Faça um programa que leia as duas notas parciais obtidas por um aluno numa disciplina ao
    // longo de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
    // O programa deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO”
    // se o conceito for A, B ou C “REPROVADO” se o conceito for D ou E.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira a nota da avaliação 1: ");
        double nota1 = input.nextDouble();

        System.out.println("Insira a nota da avaliação 2: ");
        double nota2 = input.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        if (media >= 9.0) {
            System.out.println("Conceito A");
            System.out.println("APROVADO");
        } else if (media >= 7.5) {
            System.out.println("Conceito B");
            System.out.println("APROVADO");
        } else if (media >= 6.0) {
            System.out.println("Conceito C");
            System.out.println("APROVADO");
        } else if (media >= 4.0) {
            System.out.println("Conceito D");
            System.out.println("REPROVADO");
        } else {
            System.out.println("Conceito E");
            System.out.println("REPROVADO");
        }
    }
}

