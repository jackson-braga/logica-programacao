package lista1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Escreva um programa para ler as dimensões de um retângulo (base e altura),
        //calcular e escrever a área do retângulo.

        String continuar;

        do {
            Scanner input = new Scanner(System.in);

            System.out.println("Insira a base do retângulo: ");
            double baseRetangulo = input.nextDouble();

            System.out.println("Insira a altura do retângulo: ");
            double alturaRetangulo = input.nextDouble();

            double areaRetangulo = baseRetangulo * alturaRetangulo;

            System.out.println("A área do retângulo é: " + areaRetangulo);

            System.out.println("Deseja realizar outro cálculo de área? - s/n");
            continuar = input.next();

        } while (continuar.equalsIgnoreCase("s"));
    }
}
