package atividades.lista1;

import java.util.Scanner;

/* 3. Escreva um programa para ler o número total de eleitores de
um município, o número de votos brancos, nulos e válidos.
Calcular e escrever o percentual que cada um representa em relação
ao total de eleitores.
*/
public class Ex03Votacao {

    private static int percentualVotosValidos;

    public static void main(String[] args) {

        int totalEleitores, votosBranco, votosNulo, votosValidos, totalVotos;
        double percentualVotosBrancos, percentualVotosNulos, percentualVotosValidos;

        Scanner in = new Scanner(System.in);
        do {
            System.out.println(" Digite o total de Eletores: ");
            totalEleitores = in.nextInt();
            System.out.println(" Digite a quantidade de votos Brancos: ");
            votosBranco = in.nextInt();
            System.out.println(" Digite a quantidade de votos Nulos: ");
            votosNulo = in.nextInt();
            System.out.println(" Digite a quantidade de votos Válidos: ");
            votosValidos = in.nextInt();

            totalVotos = votosNulo + votosBranco + votosValidos;
            if (totalVotos != totalEleitores) {
                System.out.println("Refaça a operação! Total de Votos diferente do Total de Eleitores...");
            } else {
                percentualVotosBrancos = (double)votosBranco / totalEleitores * 100;
                percentualVotosNulos = (double)votosNulo / totalEleitores * 100;
                percentualVotosValidos = (double)votosValidos / totalEleitores * 100;
                System.out.printf("O total de eleitores foram %d: \n", totalEleitores);
                System.out.printf("A quantidade de votos Brancos foram %d, que equivale a %.2f%% do total de eleitores; \n", votosBranco, percentualVotosBrancos);
                System.out.printf("A quantidade de votos Nulos foram %d, que equivale a %.2f%% do total de eleitores; \n", votosNulo, percentualVotosNulos);
                System.out.printf("A quantidade de votos Válidos foram %d, que equivale a %.2f%% do total de eleitores; \n", votosValidos, percentualVotosValidos);
            }
        } while (totalVotos != totalEleitores);

    }
}
