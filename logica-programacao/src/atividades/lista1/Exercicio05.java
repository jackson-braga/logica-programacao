package atividades.lista1;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.print("Entre com a temperatura em Fahrenheit: ");
        int tempFahr = sc.nextInt();

        int tempCelsius = ((tempFahr -32) / 9) * 5;

        System.out.println("A temperatura em Celsius é " + tempCelsius + " graus.");



        sc.close();
    }
}
