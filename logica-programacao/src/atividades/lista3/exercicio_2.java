package atividades.lista3;

import java.util.Scanner;

public class exercicio_2 {
    public static void main(String[] args) {
        double A;
        double B;
        double C;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        A = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        C = scanner.nextDouble();
        System.out.println("A ordem digitada foi: " + A + ", " + B + ", " + C);
        //Ordem Decrescente
        if (A>B && B>C){
            System.out.println("A ordem decrescente é: " + A + ", " + B + ", " + C);
        } else if (A>B && C>B && A>C){
            System.out.println("A ordem decrescente é: " + A + ", " + C + ", " + B);
        }else if (B>A && A>C){
            System.out.println("A ordem decrescente é: " + B + ", " + A + ", " + C);
        }else if (B>A && C>A && B>C){
            System.out.println("A ordem decrescente é: " + B + ", " + C + ", " + A);
        }else if (C>A && A>B){
            System.out.println("A ordem decrescente é: " + C + ", " + A + ", " + B);
        }else {
            System.out.println("A ordem decrescente é: " + C + ", " + B + ", " + A);
        }
        //Ordem Crescente
        if (A>B && B>C){
            System.out.println("A ordem crescente é: " + C + ", " + B + ", " + A);
        } else if (A>B && C>B && A>C){
            System.out.println("A ordem crescente é: " + B + ", " + C + ", " + A);
        }else if (B>A && A>C){
            System.out.println("A ordem crescente é: " + C + ", " + A + ", " + B);
        }else if (B>A && C>A && B>C){
            System.out.println("A ordem crescente é: " + A + ", " + C + ", " + B);
        }else if (C>A && A>B){
            System.out.println("A ordem crescente é: " + B + ", " + A + ", " + C);
        }else {
            System.out.println("A ordem crescente é: " + A + ", " + B + ", " + C);
        }

    }
}
