package atividades.lista1;

import java.util.Scanner;

public class Exercicio_08 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que retorna a media simples e status de aprovação de aluno.");
        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        // Processamento de Dados
        double media = (nota1 + nota2) / 2;
        String status;
        if (media >= 6) {
            status = "Aprovado";
        } else {
            status = "Reprovado";
        }

        //Saída de Dados
        System.out.println("A média do aluno foi de: " + media + " considerando assim o aluno " + status + ".");
    }
}
