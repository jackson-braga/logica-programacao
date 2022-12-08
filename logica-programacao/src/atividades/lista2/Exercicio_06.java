package atividades.lista2;

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Programa que retorna status de aluno");
        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        //Processamento de Dados

        String conceito;
        double media = (nota1 + nota2) / 2;
        if (media >= 9 && media <= 10) {
            conceito = "A - Aprovado";
        } else if (media < 9 && media >= 7.5) {
            conceito = "B - Aprovado";
        } else if (media < 7.5 && media >= 6) {
            conceito = "C - Aprovado";
        } else if (media < 6 && media >= 4) {
            conceito = "D - Reprovado";
        } else {
            conceito = "E - Reprovado";
        }

        //Saída de Dados
        System.out.println("Sua média foi " + media + " e seu conceito foi " + conceito);
    }
}
