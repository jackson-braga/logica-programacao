package atividades.lista3;

import java.util.Scanner;

public class Exercicio06xx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Média aritmética\n" +
                "2. Média ponderada\n" +
                "3. Sair");

        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Entre com as duas notas: ");
                double nota1 = sc.nextDouble();
                double nota2 = sc.nextDouble();
                double arit = (nota1 + nota2) / 2;
                System.out.println("Média das duas notas é: " + arit);
                break;

            case 2:
                System.out.println("Entre com a nota e seu respectivo peso: ");
                double valor1 = sc.nextDouble();
                double peso1 = sc.nextDouble();
                double valor2 = sc.nextDouble();
                double peso2 = sc.nextDouble();
                double valor3 = sc.nextDouble();
                double peso3 = sc.nextDouble();
                double pond = (valor1 + valor2 + valor3) / (peso1 + peso2 + peso3);
                System.out.println("Média ponderada das três notas é: " + pond);
                break;
            case 3:
                System.out.println("Programa finalizado.");
                break;

        }


        sc.close();
    }
}
