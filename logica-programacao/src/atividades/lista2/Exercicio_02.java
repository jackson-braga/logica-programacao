package atividades.lista2;

import java.util.Scanner;

public class Exercicio_02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que informa o tipo e area de um polígono.");
        System.out.println("Quantos lados o polígono possui?");
        int lados = scan.nextInt();
        System.out.println("Qual a medida dos seus lados?");
        int medida = scan.nextInt();

        //Processamento de Dados
        String mensagem ="";
        double area;
        if (lados < 3) {
            mensagem = "NÃO É UM POLÍGONO.";
        } else if (lados == 3) {
            double base = medida / 2;
            double altura = medida;
            area = (base * altura) / 2;
            mensagem = "TRIÂNGULO - " + area + "cm² de área.";
        } else if (lados == 4) {
            area = medida * medida;
            mensagem = "QUADRADO - " + area + "cm² de área.";
        } else if (lados == 5) {
            mensagem = "PENTAGONO";
        }else {
            mensagem = "POLÍGONO NÃO IDENTIFICADO.";
        }

        //Saída de Dados
        System.out.println(mensagem);
    }
}
