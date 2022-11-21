package atividades.lista2;

import java.util.Scanner;

/* 6. Faça um programa que leia as duas notas parciais obtidas por um aluno numa disciplina ao longo de
um semestre, e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
            Média de aproveitamento Conceito
            Entre 9.0 e 10.0 A
            Entre 7.5 e 9.0 B
            Entre 6.0 e 7.5 C
            Entre 4.0 e 6.0 D
            Entre 4.0 e 0 E
O programa deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito
for A, B ou C “REPROVADO” se o conceito for D ou E
* */
public class Ex06ConceitoNota {

    public static void main(String[] args) {

        double nota1, nota2, media;
        String conceito, msg;

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a 1º nota: ");
        nota1 = in.nextDouble();
        System.out.print("\nDigite a 2º nota: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2) / 2;

        if(media >= 9) {
            conceito = "A";
            msg = "Aprovado";

        } else if (media >= 7.5) {
            conceito = "B";
            msg = "Aprovado";

        } else if (media >= 6) {

            conceito = "C";
            msg = "Aprovado";

        } else if (media >= 4) {

            conceito = "D";
            msg = "Reprovado";

        } else {

            conceito = "E";
            msg = "Reprovado";
        }

        System.out.printf("As notas do aluno foram %.1f e %.1f, totalizando a média %.1f e conceito %s, portanto, o aluno está %s.", nota1, nota2, media, conceito, msg);
    }
}
