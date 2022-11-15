package atividades.lista1;

import java.util.Scanner;

public class Exercicio3 {
    /**
     * 3. Escreva um programa para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
     * Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.
     */
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.print("Insira o número de eleitores do município: ");
        double eleitores = scann.nextDouble();
        System.out.print("Insira o número de votos brancos: ");
        double brancos = scann.nextDouble();
        System.out.print("Insira o número de votos nulos: ");
        double nulos = scann.nextDouble();
        System.out.print("Insira o número de votos válidos: ");
        double validos = scann.nextDouble();
        //lógica
        double totalVotos = brancos + nulos + validos;
        if (totalVotos == eleitores) {
            brancos = (brancos * 100) / eleitores;
            nulos = (nulos * 100) / eleitores;
            validos = (validos * 100) / eleitores;
            System.out.printf("\nTotal de votos computados: %.0f votos", totalVotos );
            System.out.printf("\nVotos brancos: " + brancos + "%");
            System.out.println("Votos nulos: " + nulos + "%");
            System.out.println("Votos válidos: " + validos + "%");
            System.out.println("Total de eleitores: " + eleitores );
        } else if (totalVotos < eleitores) {
            System.out.println("Nem todos os votos foram computados, favor revalidar.");
        } else {
            System.out.println("Foram contabilizados mais votos que eleitores, favor revalidar.");
        }
    }
}
