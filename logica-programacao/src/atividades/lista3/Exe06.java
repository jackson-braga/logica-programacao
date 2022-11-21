package atividades.lista3;

import java.util.Scanner;

public class Exe06 {
    public static void main(String[] args) {

        int menu;
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------Menu--------");
        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.println("3. Sair");
        System.out.println("---------------------");
        System.out.println("Qual opção deseja?");
        menu = scanner.nextInt();

        if (menu == 1) {

            System.out.println("Digite a primeira nota:");
            double notaUm = scanner.nextDouble();
            System.out.println("Digite a segunda nota:");
            double notaDois = scanner.nextDouble();

            double media = (notaUm + notaDois) / 2;
            System.out.println("Sua média aritmética é: " + media + "!");

        } else if (menu == 2) {

            System.out.println("Digite a primeira nota:");
            double notaUm = scanner.nextDouble();
            System.out.println("Digite o peso:");
            int pesoUm = scanner.nextInt();
            System.out.println("Digite a segunda nota:");
            double notaDois = scanner.nextDouble();
            System.out.println("Digite o peso:");
            int pesoDois = scanner.nextInt();
            System.out.println("Digite a terceira nota:");
            double notaTres = scanner.nextDouble();
            System.out.println("Digite o peso:");
            int pesoTres = scanner.nextInt();

            double media = ((notaUm * pesoUm) + (notaDois * pesoDois) + (notaTres * pesoTres)) / (pesoUm + pesoDois + pesoTres);
            System.out.println("Sua média ponderada é: " + media + "!");

        } else if (menu == 3) {
            System.out.println("Você saiu.");

        } else {
            System.out.println("Opção Inválida!");

        }

    }

}
