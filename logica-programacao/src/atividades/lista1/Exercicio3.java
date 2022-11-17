package lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        // Escreva um programa para ler o número total de eleitores de um município,
        // o número de votos brancos, nulos e válidos.
        // Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o número total de eleitores: ");
        double totalEleitores = input.nextInt();

        System.out.println("Insira o número de votos brancos: ");
        double votosBrancos = input.nextInt();

        System.out.println("Insira o número de votos nulos: ");
        double votosNulos = input.nextInt();

        System.out.println("Insira o número de votos válidos: ");
        double votosValidos = input.nextInt();

        double brancos = (votosBrancos/totalEleitores) * 100;
        double nulos = (votosNulos/totalEleitores) * 100;
        double validos = (votosValidos/totalEleitores) * 100;

        System.out.printf("Porcentagem votos brancos = %.2f %n", (brancos));
        System.out.printf("Porcentagem votos nulos: %.2f %n", (nulos));
        System.out.printf("Porcentagem votos válidos: %.2f %n", (validos));

    }
}
