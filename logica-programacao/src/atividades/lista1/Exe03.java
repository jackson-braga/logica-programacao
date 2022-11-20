package atividades.lista1;

import java.util.Scanner;

public class Exe03 {
    public static void main(String[] args) {

        double votosBranco;
        double votosNulo;
        double votosValidos;
        double totalVotos;

        double pctgVotosBranco;
        double pctgVotosNulo;
        double pctgVotosValidos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número total de eleitores?");
        totalVotos = scanner.nextDouble();

        System.out.println("Qual o número de votos em branco?");
        votosBranco = scanner.nextDouble();

        System.out.println("Qual o número de votos nulos?");
        votosNulo = scanner.nextDouble();

        System.out.println("Qual o número de votos válidos?");
        votosValidos = scanner.nextDouble();

        pctgVotosBranco = (votosBranco * 100) / totalVotos;
        pctgVotosNulo = (votosNulo * 100) / totalVotos;
        pctgVotosValidos = (votosValidos * 100) / totalVotos;

        System.out.println("Porcentagem de votos em branco: " + pctgVotosBranco + "%.");
        System.out.println("Porcentagem de votos nulo: " + pctgVotosNulo + "%.");
        System.out.println("Porcentagem de votos válidos: " + pctgVotosValidos + "%.");

    }

}
