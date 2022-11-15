package atividades.lista1;

import java.util.Scanner;

/**
 * @author CrisMoura on 13/11/2022
 */
    public class Exerc1 {
    public static void main(String[] args) {
        //    1. Escreva um programa para ler as dimensões de um
        //    retângulo (base e altura), calcular e escrever a área do retângulo.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a base do triângulo.");
        double base = leitor.nextDouble();
        System.out.println("Digite a alura do triângulo.");
        double altura = leitor.nextDouble();

        double area = base * altura;

        System.out.printf("A área de um retângulo é  %.0f", area);

}


}
