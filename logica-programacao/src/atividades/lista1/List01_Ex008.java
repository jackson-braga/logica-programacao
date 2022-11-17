package atividades.lista1;

import java.util.Scanner;

public class List01_Ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual a nota da primeira avaliação: ");
        float nota1 = scan.nextFloat();
        System.out.println("Qual a nota da segunda avaliação: ");
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media <= 5) {
            System.out.println("Aluno Reprovado!");
        } else {
            System.out.println("Aluno Aprovado");
        }
        System.out.println("Média calculada: " + media);
    }
}

