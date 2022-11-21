package atividades.lista1;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args){

        //1. Escreva um programa para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.

        Scanner scann = new Scanner(System.in);

        System.out.println("Informe a base do retângulo.");
        float base = scann.nextFloat();

        System.out.println("Informe a altura do retângulo.");
        float altura = scann.nextFloat();

        System.out.println("A área do retângulo é " + (base*altura) + ".");
    }
}
