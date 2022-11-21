package atividades.lista1;
/* 13. Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool      até 20 litros, desconto de 2% por litro
            acima de 20 litros, desconto de 5% por litro

Gasolina    até 20 litros, desconto de 3% por litro
            acima de 20 litros, desconto de 6% por litro

Escreva um programa que leia o número de litros vendidos e o tipo de combustível
(codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser
pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 4,79 e o
preço do litro do álcool é R$ 3,69.
* */

import java.util.Scanner;

public class Ex13GasolinaOuAlcool {

    public static void main(String[] args) {

        double litrosVendidos, valorPago = 0, desconto;
        String tipoCombustivel;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println(" Digite a quantidade de litros vendidos: ");
            litrosVendidos = in.nextDouble();
            System.out.println(" Digite o tipo de combustível com um caracter: ");
            System.out.println(" A - para Alcool ou G - para Gasolina");
            tipoCombustivel = in.next().toUpperCase();

            if (tipoCombustivel.equals("A")) {
                if (litrosVendidos <= 20) {
                    desconto = (3.69 * litrosVendidos) * 0.02;
                    valorPago = (3.69 * litrosVendidos) - desconto;
                } else {
                    desconto = (3.69 * litrosVendidos) * 0.05;
                    valorPago = (3.69 * litrosVendidos) - desconto;
                }
            } else if (tipoCombustivel.equals("G")) {
                if(litrosVendidos <= 20) {
                    desconto = (4.79 * litrosVendidos) * 0.03;
                    valorPago = (4.79 * litrosVendidos) - desconto;
                } else {
                    desconto = (4.79 * litrosVendidos) * 0.06;
                    valorPago = (4.79 * litrosVendidos) - desconto;
                }
            } else {
                System.out.println("Digite novamente uma opção válida!");
            }

        } while(!tipoCombustivel.equals("A") && !tipoCombustivel.equals("G"));

        System.out.printf("O valor pago pelo cliente foi R$%.2f.", valorPago);
    }
}
