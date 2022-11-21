package lista3;
//      6. Faça um programa que apresente o menu de opções a seguir:
//          Menu de opções:
//              1. Média aritmética
//              2. Média ponderada
//              3. Sair.
//          Digite a opção desejada:
//              Na opção 1: receber duas notas, calcular e mostrar a média aritmética
//              Na opção 2: receber três notas, e seus respectivos pesos, calcular e mostrar a média ponderada
//              Na opção 3: sair do programa.
//          Verifique a possibilidade de opção inválida, mostrando uma mensagem.

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        // Chamar método do Menu
        int opcao = menu();

        if (opcao == 1) {
            mediaAritmetica();
        } else if (opcao == 2) {
            mediaPonderada();
        } else if (opcao == 3) {
            System.out.println("Saindo do programa.");
        } else {
            System.out.println("Opção inválida.");
        }
    }

    // Método do Menu com retorno
    public static int menu() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Menu de opções: ");
        System.out.println("1. Média aritmética");
        System.out.println("2. Média ponderada");
        System.out.println("3. Sair");
        int opcao = scan.nextInt();
        return opcao;
    }

    public static void mediaAritmetica() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();
        System.out.println("A média aritmética é: " + (nota1 + nota2) / 2);
    }

    public static void mediaPonderada() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota:");
        double nota1 = scan.nextDouble();
        System.out.println("Informe o peso da primeira nota:");
        double pesoNota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota:");
        double nota2 = scan.nextDouble();
        System.out.println("Informe o peso da segunda nota:");
        double pesoNota2 = scan.nextDouble();
        System.out.println("Informe a terceira nota:");
        double nota3 = scan.nextDouble();
        System.out.println("Informe o peso da terceira nota:");
        double pesoNota3 = scan.nextDouble();

        System.out.println("A média ponderada é: " + ((nota1 * pesoNota1) + (nota2 * pesoNota2) + (nota3 * pesoNota3)) / (pesoNota1 + pesoNota2 + pesoNota3));
    }
}
