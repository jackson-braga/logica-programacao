package atividades.lista1;

import java.util.Scanner;

public class Exe05 {
    public static void main(String[] args) {

        float tempFahrenheit;
        float tempCelsius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a temperatura Fahrenheit?");
        tempFahrenheit = scanner.nextFloat();

        tempCelsius = ((tempFahrenheit - 32) / 9) * 5;

        System.out.println("A temperatura em Celsius é: " + tempCelsius + "ºC.");

    }

}
