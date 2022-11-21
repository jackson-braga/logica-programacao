package atividades.lista2;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {

        int anguloUm;
        int anguloDois;
        int anguloTres;
        int somaAngulosInternos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro ângulo:");
        anguloUm = scanner.nextInt();

        System.out.println("Segundo ângulo:");
        anguloDois = scanner.nextInt();

        System.out.println("Terceiro ângulo:");
        anguloTres = scanner.nextInt();

        somaAngulosInternos = anguloUm + anguloDois + anguloTres;

        if (somaAngulosInternos == 180) {

            if (anguloUm == 90 || anguloDois == 90 || anguloTres == 90) {
                System.out.println("É um triângulo retângulo!");

            } else if (anguloUm > 90 || anguloDois > 90 || anguloTres > 90) {
                System.out.println("É um triângulo obtusângulo!");

            } else {
                System.out.println("É um triângulo acutângulo!");

            }

        } else {
            System.out.println("Ângulos informados estão incorretos!");

        }

    }

}
