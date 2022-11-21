package atividades.lista2;

import java.util.Scanner;

/* 2. Escreva um programa para ler o número de lados de um polígono regular e a medida do lado (em cm). Calcular e imprimir o
seguinte:
        ● Se o número de lados for igual a 3 escrever TRIÂNGULO e o valor da área
        ● Se o número de lados for igual a 4 escrever QUADRADO e o valor da sua área.
        ● Se o número de lados for igual a 5 escrever PENTÁGONO.
        ● se o número de lados for inferior a 3 escrever NÃO É UM POLÍGONO.
        ● se o número de lados for superior a 5 escrever POLÍGONO NÃO IDENTIFICADO.
* */
public class Ex02Poligono {

    public static void main(String[] args) {

        int ladosPoligono;
        double[] medidaLado;
        double area, semiperimetro;
        double somaLados = 0;
        String nomePoligono;

        Scanner in = new Scanner(System.in);
        System.out.print(" Digite a quantidade de lados de um polígono: ");
        ladosPoligono = in.nextInt();

        medidaLado = new double[ladosPoligono];

        if (ladosPoligono < 3) {

            System.out.println("Não é um Poligono");

        } else if (ladosPoligono == 3) {

            for (int i = 0; i < ladosPoligono; i++) {
                System.out.print("Digite o " + (i + 1) + "º lado do poligono: \n");
                medidaLado[i] = in.nextDouble();
                somaLados += medidaLado[i];
            }
            nomePoligono = "Triângulo";

            if(medidaLado[0] < (medidaLado[1]+medidaLado[2]) && medidaLado[1] < (medidaLado[0]+medidaLado[2]) && medidaLado[2] < (medidaLado[0]+medidaLado[1])) {

                semiperimetro = somaLados / 2;
                area = Math.sqrt(semiperimetro * (semiperimetro - medidaLado[0]) * (semiperimetro - medidaLado[1]) * (semiperimetro - medidaLado[2]));
                System.out.printf("O Polígono é um %s e sua área é %.2f.", nomePoligono, area);
            } else {
                System.out.printf("O Polígono escolhido pela quantidade de lados seria um %s, porém de acordo com as medidas informadas, não é possível formar um triângulo. Tente novamente!", nomePoligono);
            }
        } else if (ladosPoligono == 4) {

            System.out.print("Digite a medida do lado do poligono: \n");
            medidaLado[0] = in.nextDouble();
            nomePoligono = "Quadrado";
            area = Math.pow(medidaLado[0], 2);
            System.out.printf("O Polígono é um %s e sua área é %.2f.", nomePoligono, area);

        } else if (ladosPoligono == 5) {

            System.out.print("Digite a medida do lado do poligono: \n");
            medidaLado[0] = in.nextDouble();
            nomePoligono = "Pentágono";
            area = 1.72 * medidaLado[0];
            System.out.printf("O Polígono é um %s e sua área é %.2f.", nomePoligono, area);

        } else {

            System.out.println("Polígono não identificado.");
        }


    }
}
