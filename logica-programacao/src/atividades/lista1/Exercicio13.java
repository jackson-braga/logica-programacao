package lista1;

import java.util.Scanner;

public class Exercicio13 {
    // Um posto está vendendo combustíveis com a seguinte tabela de descontos:
    // Escreva um programa que leia o número de litros vendidos e o tipo de combustível
    // (codificado da seguinte forma: A-álcool,G-gasolina), calcule e imprima o valor a ser
    // pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4,79 e o preço do litro do álcool é R$ 3,69.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a quantidade de combustível em Litros: ");
        double quantidadeLitros = input.nextDouble();

        System.out.println("Insira o tipo de combustível - A-Alcool | G-Gasolina: ");
        String tipoCombustivel = input.next();

        final double precoGasol = 4.79;
        final double precoAlcool = 3.69;
        double precoFinal = 0.00;

        if ((quantidadeLitros <= 20) && (tipoCombustivel.equalsIgnoreCase("A"))){
            precoFinal = quantidadeLitros*(precoAlcool - (0.02 * precoAlcool));
        } else if ((quantidadeLitros <= 20) && (tipoCombustivel.equalsIgnoreCase("G"))) {
            precoFinal = quantidadeLitros*(precoGasol - (0.03*precoGasol));
        } else if ((quantidadeLitros > 20) && (tipoCombustivel.equalsIgnoreCase("A"))) {
            precoFinal = quantidadeLitros*(precoAlcool - (0.05*precoAlcool));
        } else if ((quantidadeLitros > 20) && (tipoCombustivel.equalsIgnoreCase("G"))) {
            precoFinal = quantidadeLitros*(precoGasol - (0.06*precoGasol));
        } else {
            System.out.println("Opção inválida");
        }
        System.out.println("Total a pagar: R$" + precoFinal);
    }
}
