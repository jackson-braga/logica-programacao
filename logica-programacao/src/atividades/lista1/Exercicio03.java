package atividades.lista1;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a quantidade de eleitores: ");
        float totalEleitores = sc.nextInt();
        System.out.println("Entre com a quantidade de votos em branco: ");
        float totalBrancos = sc.nextInt();
        System.out.println("Entre com a quantidade de votos nulos: ");
        float totalNulos = sc.nextInt();
        System.out.println("Entre com a quantidade de votos válidos: ");
        float totalValidos = sc.nextInt();

        float somaVotos = totalBrancos + totalNulos + totalValidos;
        if ( somaVotos <=  totalEleitores) {
            float percBrancos = (totalBrancos / totalEleitores) * 100;
            float percNulos = (totalNulos / totalEleitores) * 100;
            float percValidos = (totalValidos / totalEleitores) * 100;

            System.out.printf("A porcentagem de votos brancos é %.2f %n", (percBrancos));
            System.out.printf("A porcentagem de votos nulos é %.2f %n", (percNulos));
            System.out.printf("A porcentagem de votos validos é %.2f %n", (percValidos));
        } else {
            System.out.println("ERRO: Quantidade de votos maior que o número de eleitores.");
        }

        sc.close();
    }
}
