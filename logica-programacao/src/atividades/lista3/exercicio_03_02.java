//  2. Faça um programa que leia três valores (A, B, C) e
//  mostre-os na ordem lida. Em seguida, mostre-os em ordem
//  crescente e decrescente.

import java.util.Scanner;

public class exercicio_03_02 {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int priNum = scann.nextInt();
        System.out.println("Digite o segundo número: ");
        int segNum = scann.nextInt();
        System.out.println("Digite o terceiro número: ");
        int terNum = scann.nextInt();
        System.out.println("A ordem digitava foi " + priNum +  ", " + segNum + " e " + terNum);

        if (priNum <= segNum && segNum <= terNum) {
            System.out.println("A ordem crescente fica " + priNum +  ", " + segNum + " e " + terNum);
            System.out.println("A ordem decrescente fica " + terNum +  ", " + segNum + " e " + priNum);
        } else if (priNum <= terNum && terNum <= segNum) {
            System.out.println("A ordem crescente fica " + priNum +  ", " + terNum + " e " + segNum);
            System.out.println("A ordem decrescente fica " + segNum +  ", " + terNum + " e " + priNum);
        } else if (segNum <= terNum && terNum <= priNum) {
            System.out.println("A ordem crescente fica " + segNum +  ", " + terNum + " e " + priNum);
            System.out.println("A ordem decrescente fica " + priNum +  ", " + terNum + " e " + segNum);
        } else if (segNum <= priNum && priNum <= terNum) {
            System.out.println("A ordem crescente fica " + segNum +  ", " + priNum + " e " + terNum);
            System.out.println("A ordem decrescente fica " + terNum +  ", " + priNum + " e " + segNum);
        } else if (terNum <= segNum && segNum <= priNum) {
            System.out.println("A ordem crescente fica " + terNum + ", " + segNum + " e " + priNum);
            System.out.println("A ordem decrescente fica " + priNum + ", " + segNum + " e " + terNum);
        } else if (terNum <= priNum && priNum <= segNum) {
            System.out.println("A ordem crescente fica " + terNum + ", " + priNum + " e " + segNum);
            System.out.println("A ordem decrescente fica " + segNum + ", " + priNum + " e " + terNum);
        } else {
            System.out.println("Numeros inválidos");
        }

    }
}
