package atividades.lista3;

import java.util.Scanner;

public class Exercicio_06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Menu de opções:");
        System.out.println("1 - Média Aritmética");
        System.out.println("2 - Média Ponderada");
        System.out.println("3 - Sair");
        int opcao = scan.nextInt();

        System.out.println("Primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Segunda nota: ");
        double nota2 = scan.nextDouble();

        // Processamento e Saída de Dados
        if (opcao == 1) {
            System.out.println("A média aritmética é: " + ((nota1 + nota2) / 2));
        } else if (opcao == 2) {
            System.out.println("Terceira nota: ");
            double nota3 = scan.nextDouble();
            System.out.println("Peso da primeira nota: ");
            int peso1 = scan.nextInt();
            System.out.println("Peso da segunda nota: ");
            int peso2 = scan.nextInt();
            System.out.println("Peso da terceira nota: ");
            int peso3 = scan.nextInt();
            int somaDosPesos = peso1 + peso2 + peso3;
            System.out.println("A média ponderada e´: " + ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / somaDosPesos);
        } else if (opcao == 3) {
            System.out.println("Saíndo do programa.");
        }
    }
}
