package atividades.lista2;

import java.util.Scanner;

/* . Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo,
Retângulo ou Obtusângulo. Sendo que:
        ● Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
        ● Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
        ● Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)
* */
public class Ex04AnguloTriangulo {

    public static void main(String[] args) {

        double[] medidaLado = new double[3];

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o " + (i + 1) + "º ângulo do poligono: \n");
            medidaLado[i] = in.nextDouble();
        }

        if(medidaLado[0] == 90 || medidaLado[1] == 90 || medidaLado[2] == 90){
            System.out.println("É um triângulo Retângulo pois possui um dos seus ângulos em 90º");
        } else if (medidaLado[0] > 90 || medidaLado[1] > 90 || medidaLado[2] > 90) {
            System.out.println("É um triângulo Obtusângulo pois possui um dos seus ângulos maiores que 90º");
        } else {
            System.out.println("É um triângulo Acutângulo pois possui os três ângulos menores que 90º");
        }
    }
}
