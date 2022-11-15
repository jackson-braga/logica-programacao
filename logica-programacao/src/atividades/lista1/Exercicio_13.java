package atividades.lista1;

import java.util.Scanner;

public class Exercicio_13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que informa desconto com base na quantidade e tipo de combustível");
        System.out.println("Quantos litros de combustivel serão abastecidos?");
        int litros = scan.nextInt();
        System.out.println("Qual tipo de combustível? (A - Álcool ou G - Gasolina)30");
        String tipo = scan.next();

        //Processamento de Dados
        double valorAlcool = 3.69;
        double valorGasolina = 4.79;
        double valorAPagar = 0;
        String combustivel = "";
        switch (tipo.toLowerCase()) {
            case "a":
                if (litros <= 20) {
                    combustivel = "álcool";
                    valorAPagar = (litros * valorAlcool) * 0.98;
                } else {
                    combustivel = "álcool";
                    valorAPagar = (litros * valorAlcool) * 0.95;
                }
                break;

            case "g":
                if (litros <= 20) {
                    combustivel = "gasolina";
                    valorAPagar = (litros * valorGasolina) * 0.97;
                } else {
                    combustivel = "gasolina";
                    valorAPagar = (litros * valorGasolina) * 0.94;
                }
                break;

            default:
                break;
        }

        //Saída de Dados
        System.out.println("O valor a ser pago por " + litros + " litros de " + combustivel + " é R$ " + valorAPagar + ".");
    }
}
