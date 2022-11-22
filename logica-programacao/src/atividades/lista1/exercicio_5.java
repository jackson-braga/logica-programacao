package atividades.lista1;

import java.util.Scanner;

public class exercicio_5 {
    // Ler temperatura em graus Fahrenheit
    //Calcular e mostrar temperatura em Celcius

    public static void main(String[] args) {
        double tF;
        double calculo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheits: ");
        tF = scanner.nextDouble();

        calculo = ((tF-32)/9) * 5;

        System.out.println("Essa temperatura em Celsius é: " + calculo + "°");
    }
}
