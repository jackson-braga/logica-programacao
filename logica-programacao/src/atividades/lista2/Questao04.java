package lista2;

//      4. Escreva um programa que leia o valor de 3 ângulos de
//      um triângulo e escreva se o triângulo é Acutângulo,
//      Retângulo ou Obtusângulo. Sendo que:
//        ● Triângulo Retângulo: possui um ângulo reto.
//          (igual a 90º)
//        ● Triângulo Obtusângulo: possui um ângulo obtuso.
//          (maior que90º)
//        ● Triângulo Acutângulo: possui três ângulos agudos.
//          (menor que 90º)

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {

        // Criar variáveis e receber valores dos angulos
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a medida do primeiro ângulo do triângulo: ");
        int anguloA = scan.nextInt();
        System.out.println("Informe a medida do segundo ângulo do triângulo: ");
        int anguloB = scan.nextInt();
        System.out.println("Informe a medida do terceiro ângulo do triângulo: ");
        int anguloC = scan.nextInt();

        // Calcular e informar o tipo do triangulo

        if (anguloA == 90 || anguloB == 90 || anguloC == 90) {
            System.out.println("Triângulo Retângulo.");
        } else if (anguloA > 90 || anguloB > 90 || anguloC > 90) {
            System.out.println("Triângulo Obtusângulo.");
        } else {
            System.out.println("Triângulo Acutângulo.");
        }
    }
}
