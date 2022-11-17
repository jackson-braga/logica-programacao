package atividades.lista1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class List01_Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Votação município: São Paulo ");
        System.out.println("Total de eleitores: ");
        float eleitores = scan.nextFloat();
        System.out.println("Total de votos em BRANCO: ");
        float branco = scan.nextFloat();
        System.out.println("Total de votos NULOS: ");
        float nulos = scan.nextFloat();
        System.out.println("Total de votos VÁLIDOS: ");
        float validos = scan.nextFloat();

        float porcentagemBranco = (branco / eleitores) * 100;
        float porcentagemNulos = (nulos / eleitores) * 100;
        float porcentagemValidos = (validos / eleitores) * 100;

        System.out.println("Total de votos em BRANCO: " + new DecimalFormat(".##").format(porcentagemBranco) + "% do Total de eleitores");
        System.out.println("Total de votos NULOS: " + new DecimalFormat(".##").format(porcentagemNulos) + "% do Total de eleitores");
        System.out.println("Total de votos VÁLIDOS: " + new DecimalFormat(".##").format(porcentagemValidos) + "% do Total de eleitores");
    }
}
