package atividades.lista2;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {

        int nLados;
        double tamLado;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número de lados do polígono: ");
        nLados = scanner.nextInt();

        if (nLados <3 ){
            System.out.println("Não é caracterizado como polígono!");
        } else if (nLados == 3) {
            System.out.println("Digite o tamanho do lado do polígono: ");
            tamLado = scanner.nextDouble();
            area = ((Math.sqrt(3))/4)*(tamLado*tamLado);
            System.out.println("Esse polígono é um triângulo e sua área é: " + area + " centímetros quadrados.");
        } else if (nLados == 4) {
            System.out.println("Digite o tamanho do lado do polígono: ");
            tamLado = scanner.nextDouble();
            area = (tamLado*tamLado);
            System.out.println("Esse polígono é um quadrado e sua área é: " + area + " centímetros quadrados.");
        } else if (nLados == 5 ){
            System.out.println("Esse polígono é um pentágono!");
        }else {
            System.out.println("Esse polígono não foi identificado!");
        }
    }
}
