package lista2;

//     2. Escreva um programa para ler o número de lados de um
//     polígono regular e a medida do lado (em cm).
//     Calcular e imprimir o seguinte:
//          ● Se o número de lados for igual a 3 escrever
//              TRIÂNGULO e o valor da área
//          ● Se o número de lados for igual a 4 escrever
//              QUADRADO e o valor da sua área.
//          ● Se o número de lados for igual a 5 escrever
//              PENTÁGONO.
//          ● se o número de lados for inferior a 3 escrever
//              NÃO É UM POLÍGONO.
//          ● se o número de lados for superior a 5 escrever
//              POLÍGONO NÃO IDENTIFICADO.

import java.util.Scanner;

public class Questao02 {

    public static void main(String[] args) {

        // Criar variáveis de quantidade e medida dos lados
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade de lados do polígono: ");
        int qtdLados = scan.nextInt();
        System.out.println("Informe a medida do lado do polígono (em cm): ");
        double medidaLado = scan.nextDouble();

        // Calcular e informar o tipo de polígono e a área

        if(qtdLados == 3) {
            System.out.println("O polígono é um TRIANGULO.");

            double raizQuadrada3 = Math.sqrt(3);
            double areaTriangulo = (medidaLado * medidaLado * raizQuadrada3) / 4;
            System.out.println("Sua área é: " + areaTriangulo + " cm².");

        } else if (qtdLados == 4) {
            System.out.println("O polígono é um QUADRADO.");
            System.out.println("Sua área é: " + (medidaLado * medidaLado) + " cm².");

        } else if (qtdLados == 5) {
            System.out.println("O polígono é um PENTÁGONO.");

        } else if (qtdLados < 3) {
            System.out.println("NÃO É UM POLÍGONO.");

        } else {
            System.out.println("POLÍGONO NÃO IDENTIFICADO.");
        }


    }
}
