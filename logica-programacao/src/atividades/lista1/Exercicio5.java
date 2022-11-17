package lista1;

import java.util.Scanner;

public class Exercicio5 {

    // Escreva um programa para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor
    // correspondente em graus Celsius, conforme fórmula.

    public static void main(String[] args) {

        String continuar;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Informa a temperatura em graus Fahrenheit que deseja converter para graus Celsius: ");
            double grausF = input.nextDouble();

            double grausC = ((grausF - 32) / 9) * 5;

            System.out.println(grausF + " graus Fahrenheit é igual a " + grausC + " graus Celsius");

            System.out.println("Deseja converter outra temperatura? - s/n");
            continuar = input.next();

        } while (continuar.equalsIgnoreCase("s"));
    }
}
