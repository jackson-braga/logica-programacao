package atividades.lista3;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Menu de opções:");
        System.out.printf("1 - Média Aritmética\n2 - Média ponderada\n3 - Sair\n");
        int numero = scan.nextInt();
        switch (numero) {
            case 1:
                double nota1 = 0, nota2 = 0, media = 0;
                System.out.println("Nota 1:");
                nota1 = scan.nextDouble();
                while (nota1 < 0) {
                    System.out.println("Nota INVÁLIDA!");
                    System.out.println("Digite NOTA 1:");
                    nota1 = scan.nextDouble();
                }
                System.out.println("Nota 2:");
                nota2 = scan.nextDouble();
                while (nota2 < 0) {
                    System.out.println("Nota INVÁLIDA!");
                    System.out.println("Digite NOTA 2:");
                    nota2 = scan.nextDouble();
                }
                media = ((nota1 + nota2) / 2);
                System.out.println("Média Aritmética:" + media);
                break;
            case 2:
                double nota3 = 0, media_ponderada = 0;
                int peso1 = 0, peso2 = 0, peso3 = 0;
                System.out.println("Nota 1:");
                nota1 = scan.nextDouble();
                while (nota1 < 0) {
                    System.out.println("Nota INVÁLIDA!");
                    System.out.println("Digite NOTA 1:");
                    nota1 = scan.nextDouble();
                }
                System.out.println("Peso Nota 1:");
                peso1 = scan.nextInt();
                while (peso1 <= 0) {
                    System.out.println("Peso de Nota INVÁLIDA!");
                    System.out.println("Digite Peso Nota 1:");
                    peso1 = scan.nextInt();
                }

                System.out.println("Nota 2:");
                nota2 = scan.nextDouble();
                while (nota2 < 0) {
                    System.out.println("Nota INVÁLIDA!");
                    System.out.println("Digite NOTA 2:");
                    nota2 = scan.nextDouble();
                }
                System.out.println("Peso Nota 2:");
                peso2 = scan.nextInt();
                while (peso2 <= 0) {
                    System.out.println("Peso de Nota INVÁLIDA!");
                    System.out.println("Digite Peso Nota 2:");
                    peso2 = scan.nextInt();
                }

                System.out.println("Nota 3:");
                nota3 = scan.nextDouble();
                while (nota3 < 0) {
                    System.out.println("Nota INVÁLIDA!");
                    System.out.println("Digite NOTA 3:");
                    nota3 = scan.nextDouble();
                }
                System.out.println("Peso Nota 3:");
                peso3 = scan.nextInt();
                while (peso3 <= 0) {
                    System.out.println("Peso de Nota INVÁLIDA!");
                    System.out.println("Digite Peso Nota 3:");
                    peso3 = scan.nextInt();
                }

                media_ponderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
                System.out.println("Média Ponderada:" + media_ponderada);
                break;
            case 3:
                break;
            default:
                System.out.println("Opção INVÁLIDA!");
        }
    }
}
