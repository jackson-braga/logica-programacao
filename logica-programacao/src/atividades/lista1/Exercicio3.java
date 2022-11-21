package atividades.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        //3. Escreva um programa para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos.
        //Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

        Scanner scann = new Scanner(System.in);

        System.out.println("Informe o número de eleitores.");
        int eleitores = scann.nextInt();
        float unidadePercentual = (eleitores/100);

        System.out.println("Informe o número de votos brancos.");
        int votosBrancos = scann.nextInt();
        float votosBrancosPecentuais = votosBrancos/unidadePercentual;

        System.out.println("Informe o número de votos nulos.");
        int votosNulos = scann.nextInt();
        float votosNulosPecentuais = votosNulos/unidadePercentual;

        System.out.println("Informe o número de votos válidos.");
        int votosValidos = scann.nextInt();
        float votosValidosPecentuais = votosValidos/unidadePercentual;

        System.out.println("O município teve os percentuais de " + votosBrancosPecentuais + "% votos brancos, " + votosNulosPecentuais + "% votos nulos e " + votosValidosPecentuais +"% votos válidos em relacão ao total de eleitores.");


    }
}
