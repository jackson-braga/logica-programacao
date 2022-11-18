package atividades.lista2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class List02_Ex006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = scan.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println("Primeira nota: " + new DecimalFormat(".#").format(nota1));
        System.out.println("Segunda nota: " + new DecimalFormat(".#").format(nota2));
        System.out.println("Média: " + new DecimalFormat(".#").format(media));

        if (media <= 4) {
            System.out.println("Conceito: E");
            System.out.println("REPROVADO");
        } else if (media > 4 && media <= 5.9) {
            System.out.println("Conceito: D");
            System.out.println("REPROVADO");
        } else if (media >= 6 && media <= 7.4) {
            System.out.println("Conceito: C");
            System.out.println("APROVADO");
        } else if (media >= 7.5 && media <= 8.9) {
            System.out.println("Conceito: B");
            System.out.println("APROVADO");
        } else if (media >= 9 && media <= 10) {
            System.out.println("Conceito: A");
            System.out.println("APROVADO");
        } else {
            System.out.println("Corrigir notas");
        }
    }
}
