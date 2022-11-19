package lista2;

import java.util.Scanner;

public class Exercicio4 {
     // Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é
    // Acutângulo, Retângulo ou Obtusângulo. Sendo que:
    // ● Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
    // ● Triângulo Obtusângulo: possui um ângulo obtuso. (maior que 90º)
    // ● Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do ângulo 1: ");
        float angulo1 = input.nextFloat();

        System.out.println("Informe o valor do ângulo 2: ");
        float angulo2 = input.nextFloat();

        System.out.println("Informe o valor do ângulo 3: ");
        float angulo3 = input.nextFloat();

        if ((angulo1 == 90) || (angulo2 == 90) || (angulo3 == 90)) {
            System.out.println("Triângulo retângulo");
        } else if ((angulo1 > 90) || (angulo2 > 90) || (angulo3 > 90)) {
            System.out.println("Triângulo obtuso");
        } else {
            System.out.println("Triângulo agudo");
        }
    }
}
