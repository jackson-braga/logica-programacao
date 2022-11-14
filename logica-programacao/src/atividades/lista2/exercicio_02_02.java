//  2. Escreva um programa para ler o número de lados de um
//  polígono regular e a medida do lado (em cm). Calcular e
//  imprimir o seguinte:
//  Se o número de lados for igual a 3 escrever TRIÂNGULO e
//  o valor da área
//  Se o número de lados for igual a 4 escrever QUADRADO e
//  o valor da sua área.
//  Se o número de lados for igual a 5 escrever PENTÁGONO.
//  se o número de lados for inferior a 3 escrever NÃO É
//  UM POLÍGONO.
//  se o número de lados for superior a 5 escrever POLÍGONO
//  NÃO IDENTIFICADO.

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class exercicio_02_02 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Quantos lados terá seu poligono? ");
        int lados = scann.nextInt();

        if (lados < 3) {
            System.out.println("NÃO É UM POLÍGONO");
        } else if (lados == 3) {
            System.out.println("Digite a medida dos lados em cm: ");
            int base = scann.nextInt();
            double area = (sqrt (3) / 4) * (base * base); // calculo area triangulo equilatero
            System.out.println("Seu polígono é um TRIÂNGULO de área " + area + " cm2.");
        } else if (lados == 4) {
            System.out.println("Digite a medida dos lados em cm: ");
            int base = scann.nextInt();
            int area = (base * base);
            System.out.println("Seu polígono é um QUADRADO de área " + area + " cm2.");
        } else if (lados == 5) {
            System.out.println("Digite a medida dos lados em cm: ");
            int base = scann.nextInt();
            double area = (sqrt (5 * (5 + 2 * (sqrt(5)))) * (base * base)) / 4; //calculo area pentagono equilatero
            System.out.println("Seu polígono é um PENTÁGONO de área " + area + " cm2.");
        } else {
            System.out.println("POLÍGONO NÃO IDENTIFICADO");
        }


    }
}
