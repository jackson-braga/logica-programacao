package atividades.lista1;

import java.util.Scanner;

public class Exercicio5 {
    private static final String FAHRENHEIT = "Insira a temperatura Fahrenheit desejado:";
    private static final String RESULTADO = "O resultado em Celsios vale: %.2f";

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double fahrenheit = obterTemperatura(entrada);
        System.out.printf(RESULTADO.concat("ºC"), (fahrenheit - 32)*5/9);
    }

    private static double obterTemperatura(Scanner entrada) {
        System.out.println(FAHRENHEIT);
        return entrada.nextDouble();
    }
}
