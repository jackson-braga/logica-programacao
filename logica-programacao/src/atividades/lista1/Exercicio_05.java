package atividades.lista1;

import java.util.Scanner;

public class Exercicio_05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que converte valores de temperatura de Fahrenheit para Celsius.");
        System.out.println("Informe o valor d temperatura em Fahrenheit: ");
        double fahrenheit = scan.nextDouble();

        //Processamento de Dados
        double celsius = (fahrenheit - 32) / 1.8;

        //Saída de Dados
        System.out.println(fahrenheit + "º Fahrenheit equivalem a " + celsius + "º celsius.");
    }
}
