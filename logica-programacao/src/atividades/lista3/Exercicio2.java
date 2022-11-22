package atividades.lista3;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //2. Faça um programa que leia três valores (A, B, C) e mostre-os na ordem lida. Em seguida, mostre-os em ordem crescente e
        //decrescente.
        Scanner scann = new Scanner(System.in);
        System.out.println("Informe um valor para o número A.");
        int A = scann.nextInt();

        System.out.println("Informe um valor para o número B.");
        int B = scann.nextInt();

        System.out.println("Informe um valor para o número C.");
        int C = scann.nextInt();

        System.out.println("Valores na ordem lida: " + A + ", " + B + ", " + C + "." );

        String resposta = "Valores em ordem: ";

        if(A < B && A < C){
            resposta += A;

            if(B < C){
                resposta += " " + B + " e " + C + ".";
            }else{
                resposta += " " + C + " e " + B + ".";
            }
        } else if(B < A && B < C){
            resposta += B;

            if(A < C){
                resposta += " " + A + " e " + C + ".";
            }else{
                resposta += " " + C + " e " + A + ".";
            }
        } else if(C < A && C < B){
            resposta += C;

            if(A < B){
                resposta += " " + A + " e " + B + ".";
            }else{
                resposta += " " + B + " e " + A + ".";
            }
        }

        System.out.println(resposta);

    }
}
