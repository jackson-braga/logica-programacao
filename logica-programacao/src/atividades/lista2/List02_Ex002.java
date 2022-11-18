package atividades.lista2;

import java.util.Scanner;

public class List02_Ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Número de lados de um polígono: ");
        int lados = scan.nextInt();
        System.out.println("Qual a medida do lado em (cm): ");
        float medida = scan.nextFloat();

        if (lados == 3) {
            System.out.println("TRIÂNGULO");
            System.out.println("Qual o valor da base do triângulo? ");
            float base = scan.nextFloat();
            System.out.println("Qual o valor da altura do triângulo? ");
            float altura = scan.nextFloat();
            float valorArea = (base * altura) / 2;
            System.out.println("O valor da área do seu triângulo é de: " + valorArea + " cm");
        } else if (lados == 4) {
            System.out.println("QUADRADO");
            float valorArea = medida * medida;
            System.out.println("A valor da área do quadrado é: " + valorArea + " cm");
        } else if (lados == 5) {
            System.out.println("PENTÁGONO");
        } else if (lados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        }
    }
}
