package atividades.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //2. Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). Calcular e imprimir o
        //seguinte:
        //● Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
        //● Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
        //● Se o número de lados for igual a 5 escrever PENTÁGONO.
        //● se o número de lados for inferior a 3 escrever NÃO É UM POLÍGONO.
        //● se o número de lados for superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.
        Scanner scann = new Scanner(System.in);
        System.out.println("Informe o número de lados.");
        int lados = scann.nextInt();

        System.out.println("Informe a medida.");
        int medida = scann.nextInt();

        if(lados < 3){System.out.println("NÃO É UM POLÍGONO.");}
        else if (lados > 5){System.out.println("POLÍGONO NÃO IDENTIFICADO.");}

        if(lados == 3){
            System.out.println("É um TRIÂNGULO. Sua área é de " + lados * medida +".");
        }else if(lados == 4){
            System.out.println("É um QUADRADO. Sua área é de " + lados * medida +".");
        }else if(lados == 5){
        System.out.println("É um PENTÁGONO. Sua área é de " + lados * medida +".");
    }

        }

    }
