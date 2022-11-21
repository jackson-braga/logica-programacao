package atividades.lista2;

/**
 * @author CrisMoura on 20/11/2022
 */
import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
//4. Escreva um programa que leia o valor de 3 ângulos de um triângulo e escreva se o triângulo é Acutângulo,
//Retângulo ou Obtusângulo. Sendo que:
//● Triângulo Retângulo: possui um ângulo reto. (igual a 90º)
//● Triângulo Obtusângulo: possui um ângulo obtuso. (maior que90º)
//● Triângulo Acutângulo: possui três ângulos agudos. (menor que 90º)
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do 1 ângulo.");
        float angulo1 = input.nextFloat();
        System.out.println("Digite o valor do 2 ângulo.");
        float angulo2 = input.nextFloat();
        System.out.println("Digite o valor do 3 ângulo.");
        float angulo3 = input.nextFloat();
        if (angulo1 + angulo2 + angulo3 != 180.0F) {
            System.out.println("Nâo é um triângulo.");
        } else if (angulo1 < 90.0F && angulo2 < 90.0F && angulo3 < 90.0F) {
            System.out.println("Triângulo Acutângulo");
        } else if (angulo1 != 90.0F && angulo2 != 90.0F && angulo3 != 90.0F) {
            if (angulo1 > 90.0F || angulo2 > 90.0F || angulo3 > 90.0F) {
                System.out.println("Triângulo Obtusângulo");
            }
        } else {
            System.out.println("Triângulo Retângulo.");
        }

    }
}

