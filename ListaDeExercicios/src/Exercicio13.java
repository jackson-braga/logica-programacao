/*Lista de Exercícios 1
Exercício 13:
 Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 -
Álcool até 20 litros, desconto de 2% por litro
acima de 20 litros, desconto de 5% por litro
Gasolina
até 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 6% por litro
-
Escreva um programa que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool,
G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4,79 e o
preço do litro do álcool é R$ 3,69.

 */

import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o tipo de combustível: \nA-Alcool\nG-Gasolina");
        String combustivel = scan.next();
        System.out.println("Informe a quantidade de litros: ");
        double quantidadeLitros = scan.nextDouble();
        double valorTotal = 0;
        double desconto = 0;
        double valorGasolina = 4.79;
        double valorAlcool = 3.69;
        if (combustivel.toUpperCase().startsWith("G")) {
            if (quantidadeLitros <= 20) {
                desconto = (quantidadeLitros * valorGasolina) * 0.02;
                valorTotal = (quantidadeLitros * valorGasolina) - desconto;
            } else {
                desconto = (quantidadeLitros * valorGasolina) * 0.05;
                valorTotal = (quantidadeLitros * valorGasolina) - desconto;
            }
        } else if (combustivel.toUpperCase().startsWith("A")) {
            if (quantidadeLitros <= 20) {
                desconto = (quantidadeLitros * valorAlcool) * 0.03;
                valorTotal = (quantidadeLitros * valorAlcool) - desconto;
            } else {
                desconto = (quantidadeLitros * valorAlcool) * 0.06;
                valorTotal = (quantidadeLitros * valorAlcool) - desconto;
            }
        }
        System.out.println("O valor a ser pago é R$:" + valorTotal);

    }
}
