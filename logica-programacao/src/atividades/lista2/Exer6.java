package atividades.lista2;

/**
 * @author CrisMoura on 20/11/2022
 */
import java.util.Scanner;

public class Exer6 {
    public static void main(String[] args) {
//6. Faça um programa que leia as duas notas parciais obtidas por um aluno numa disciplina ao longo
//de um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
//Média de aproveitamentoConceito
//    Entre 9.0 e 10.0A
//    Entre 7.5 e 9.0 B
//    Entre 6.0 e 7.5 C
//    Entre 4.0 e 6.0 D
//    Entre 4.0 e 0   E
//O programa deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito
//for A, B ou C “REPROVADO” se o conceito for D ou E

        Scanner input = new Scanner(System.in);
        System.out.println("Digite 1 nota: ");
        float nota1 = input.nextFloat();
        System.out.println("Digite 2 nota");
        float nota2 = input.nextFloat();
        float media = (nota1 + nota2) / 2.0F;
        System.out.println("Média:  " + media);
        System.out.println("Nota 1:  " + nota1);
        System.out.println("Nota 2:  " + nota2);
        String conceito = "";
        if ((double)media >= 9.0 && (double)media <= 10.0) {
            conceito = "A";
        } else if ((double)media >= 7.5 && (double)media < 9.0) {
            conceito = "B";
        } else if ((double)media >= 6.0 && (double)media < 7.5) {
            conceito = "C";
        } else if ((double)media >= 4.0 && (double)media < 6.0) {
            conceito = "D";
        } else if (media >= 0.0F && (double)media <= 4.0) {
            conceito = "E";
        }

        System.out.println("Conceito:  " + conceito);
        if (media >= 6.0F && (double)media <= 10.0) {
            System.out.println("\n********APROVADO********");
        } else {
            System.out.println("\n********REPROVADO********");
        }

    }
}
