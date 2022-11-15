package atividades.lista1;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Programa para informar a porcentagem de votos de um município.");
        double count = 0;
        double totalDeEleitores;
        double totalDeVotosBrancos;
        double totalDeVotosNulos;
        do {
            System.out.println("Quantos eleitores existem no município? ");
            totalDeEleitores = scan.nextInt();
            System.out.println("Quantas pessoas votaram em branco no município?");
            totalDeVotosBrancos = scan.nextInt();
            System.out.println("Quantas pessoas anularam o voto no município?");
            totalDeVotosNulos = scan.nextInt();

            if ((totalDeVotosBrancos + totalDeVotosNulos) > totalDeEleitores) {
                System.out.println("Dados inseridos estão incorretos: número de votos nulos e brancos " +
                        "é maior que número de votos. Por favor, informe os dados novamente.");
            } else {
                count++;
            }
        }
        while (count == 0);

        //Processamento de Dados
        double porcentagemVotosNulos = totalDeVotosNulos / (totalDeEleitores / 100);
        double porcentagemVotosBrancos = totalDeVotosBrancos / ( totalDeEleitores / 100);
        double porcentagemVotosValidos = 100 - porcentagemVotosBrancos - porcentagemVotosNulos;

        //Saída de Dados
        System.out.println("Em um município com " + totalDeEleitores + " eleitores, os votos foram" +
                " computados da seguinte forma:");
        System.out.println("Votos válidos: " + porcentagemVotosValidos + "% dos votos.");
        System.out.println("Votos nulos: " + porcentagemVotosNulos + "% dos votos.");
        System.out.println("Votos em branco: " + porcentagemVotosBrancos + "% dos votos.");

    }
}
