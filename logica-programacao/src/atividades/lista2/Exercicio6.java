package atividades.lista2;
import java.util.Scanner;

    public class Exercicio6 {
        public static <string> void main(String[] args) {
            //6. Faça um programa que leia as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule
            //a sua média. A atribuição de conceitos obedece à tabela abaixo:
            // Média de aproveitamento   Conceito
            // Entre 9.0 e 10.0              A
            // Entre 7.5 e 9.0               B
            // Entre 6.0 e 7.5               C
            // Entre 4.0 e 6.0               D
            // Entre 4.0 e 0                 E
            //O programa deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito
            //for A, B ou C “REPROVADO” se o conceito for D ou E.

            Scanner scann = new Scanner(System.in);
            System.out.println("Informe a primeira nota.");
            float primeira = scann.nextFloat();

            System.out.println("Informe a segunda nota.");
            float segunda = scann.nextFloat();

            float media = (primeira+segunda)/2.0f;

            if(media > 9 && media <= 10){
                System.out.println("Primeira nota " + primeira + ", segunda nota " + segunda + ", média " + media + ", conceito A, status APROVADO.");
            } else if (media > 7.5 && media <= 9) {
                System.out.println("Primeira nota " + primeira + ", segunda nota " + segunda + ", média " + media + ", conceito B, status APROVADO.");
            }else if (media > 6 && media <= 7.5) {
                System.out.println("Primeira nota " + primeira + ", segunda nota " + segunda + ", média " + media + ", conceito C, status APROVADO.");
            }else if (media > 4 && media <= 6) {
                System.out.println("Primeira nota " + primeira + ", segunda nota " + segunda + ", média " + media + ", conceito D, status REPROVADO.");
            }else if (media >= 0 && media <= 4) {
                System.out.println("Primeira nota " + primeira + ", segunda nota " + segunda + ", média " + media + ", conceito E, status REPROVADO.");
            }

        }
    }
