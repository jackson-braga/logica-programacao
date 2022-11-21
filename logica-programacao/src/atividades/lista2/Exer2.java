package atividades.lista2;

/**
 * @author CrisMoura on 20/11/2022
 */
import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
// 2. Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm).
// Calcular e imprimir o seguinte:
// ● Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
// ● Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
// ● Se o número de lados for igual a 5 escrever PENTÁGONO.
// ● se o número de lados for inferior a 3 escrever NÃO É UM POLÍGONO.
// ● se o número de lados for superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de lados: ");
        int numLados = input.nextInt();
        System.out.println("Digite a medida em cm : ");
        double medidas = input.nextDouble();
        double valorArea = (double)numLados * medidas;
        if (numLados == 3) {
            System.out.printf("TRIÂNGULO  %.2f cm\n", valorArea);
        } else if (numLados < 3) {
            System.out.println("NÃO É UM POLÍGONO.\n");
        }

        if (numLados == 4) {
            System.out.printf("QUADRADO %.2f cm\n", valorArea);
        }

        if (numLados == 5) {
            System.out.println("PENTÁGONO.\n");
        } else if (numLados > 5) {
            System.out.println("POLÍGONO NÃO IDENTIFICADO.\n");
        }

    }
}
