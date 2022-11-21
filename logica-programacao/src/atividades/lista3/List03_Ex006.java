package atividades.lista3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class List03_Ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("No menu a seguir, escolha uma opção:");
        System.out.println("1. Média aritmética\n" + "2. Média ponderada\n" + "3. Sair\n");
        int opcao = scan.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a primeira nota nota: ");
            float numero1 = scan.nextInt();
            System.out.println("Digite a segunda nota: ");
            float numero2 = scan.nextInt();
            float media = (numero1 + numero2) / 2;
            System.out.println("A média aritmética é: " + new DecimalFormat(".##").format(media));
        } else if (opcao == 2) {
            System.out.println("Digite a primeira nota: ");
            float numero1 = scan.nextInt();
            System.out.println("Qual o peso: ");
            float peso1 = scan.nextFloat();
            System.out.println("Digite a segunda nota: ");
            float numero2 = scan.nextInt();
            System.out.println("Qual o peso: ");
            float peso2 = scan.nextFloat();
            System.out.println("Digite a terceira nota: ");
            float numero3 = scan.nextInt();
            System.out.println("Qual o peso: ");
            float peso3 = scan.nextFloat();
            float media = (((numero1 * peso1) + numero2 * peso2) + numero3 * peso3) / (peso1 + peso2 + peso3);
            System.out.println("A média ponderada é: " + new DecimalFormat(".##").format(media));
        } else {
            System.out.println("Finalizando");
        }
    }
}
