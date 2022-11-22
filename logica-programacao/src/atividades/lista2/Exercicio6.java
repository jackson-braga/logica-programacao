package atividades.lista2;

import java.util.Scanner;

public class Exercicio6 {
    /**
     * Faça um programa que leia as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule
     * a sua média. A atribuição de conceitos obedece à tabela abaixo:
     * Média de aproveitamento Conceito
     * Entre 9.0 e 10.0 A
     * Entre 7.5 e 9.0 B
     * Entre 6.0 e 7.5 C
     * Entre 4.0 e 6.0 D
     * Entre 4.0 e 0 E
     * O programa deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito
     * for A, B ou C “REPROVADO” se o conceito for D ou E.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Insira a primeira nota: ");
        float notaUm = scann.nextFloat();
        System.out.print("Insira a segunda nota: ");
        float notaDois = scann.nextFloat();
        System.out.print("Insira a terceira nota: ");
        float notaTres = scann.nextFloat();
        float media = (notaUm+notaDois+notaTres)/3;
        if (media >= 9 && media <=10){
            System.out.printf("\nA média do aluno é de: %.2f", media);
            System.out.println("\nNota A - APROVADO");
        }else if (media >= 7.5f && media<9){
            System.out.printf("\nA média do aluno é de: %.2f", media);
            System.out.println("\nNota B - APROVADO");
        }else if(media >=6 && media<7.5f){
            System.out.printf("\nA média do aluno é de: %.2f", media);
            System.out.println("\nNota C - APROVADO");
        }else if(media >=4 && media<6){
            System.out.printf("\nA média do aluno é de: %.2f", media);
            System.out.println("\nNota D - REPROVADO");
        }else if(media >=0 && media<4){
            System.out.printf("\nA média do aluno é de: %.2f", media);
            System.out.println("\nNota E - REPROVADO");
        }
    }
}
