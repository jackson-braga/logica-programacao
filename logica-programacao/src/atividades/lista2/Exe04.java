package atividades.lista2;

import java.util.Scanner;

public class Exe04 {
    public static void main(String[] args) {

        int anguloUm;
        int anguloDois;
        int anguloTres;
        int somaAngulosInternos;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Primeiro �ngulo:");
        anguloUm = scanner.nextInt();

        System.out.println("Segundo �ngulo:");
        anguloDois = scanner.nextInt();

        System.out.println("Terceiro �ngulo:");
        anguloTres = scanner.nextInt();

        somaAngulosInternos = anguloUm + anguloDois + anguloTres;

        if (somaAngulosInternos == 180) {

            if (anguloUm == 90 || anguloDois == 90 || anguloTres == 90) {
                System.out.println("� um tri�ngulo ret�ngulo!");

            } else if (anguloUm > 90 || anguloDois > 90 || anguloTres > 90) {
                System.out.println("� um tri�ngulo obtus�ngulo!");

            } else {
                System.out.println("� um tri�ngulo acut�ngulo!");

            }

        } else {
            System.out.println("�ngulos informados est�o incorretos!");

        }

    }

}
