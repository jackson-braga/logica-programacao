//  3. Escreva um programa para ler o número total de eleitores de um município,
//  o número de votos brancos, nulos e válidos. Calcular e escrever o percentual
//  que cada um representa em relação ao total de eleitores.

import java.util.Scanner;

public class exercicio_01_03 {
    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);
        System.out.println("Quantos eleitores existem em seu município?");
        double totalEleitores = scann.nextInt();
        System.out.println("Nesta última eleição, qual foi o total de votos VÁLIDOS?");
        double votosValidos = scann.nextInt();
        System.out.println("Nesta última eleição, qual foi o total de votos BRANCOS?");
        double votosBrancos = scann.nextInt();
        double votosNulos = totalEleitores - votosValidos - votosBrancos;

        double percVValidos = (votosValidos * 100) / totalEleitores;
        double percVBrancos = (votosBrancos * 100) / totalEleitores;
        double percVNulos = (votosNulos * 100) / totalEleitores;

        System.out.println("Seu munípio teve " + percVValidos + "% de votos válidos.");
        System.out.println("Seu munípio teve " + percVBrancos + "% de votos brancos.");
        System.out.println("Seu munípio teve " + percVNulos + "% de votos nulos.");
    }
}