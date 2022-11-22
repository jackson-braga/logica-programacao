package atividades.lista3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author CrisMoura on 20/11/2022
 */
public class Exe2 {
    public static void main(String[] args) {
//        Faça um programa que leia três valores (A, B, C) e mostre-os na ordem lida. Em seguida,
//        mostre-os em ordem crescente e decrescente.

        Scanner input = new Scanner(System.in);
        System.out.println("Digite 3 valores:");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int[] entradas = {a,b,c};
        int aux;
        boolean controle;


        for(int i = 0; i < entradas.length; i++){
            for (int j =0 ; j < (entradas.length - 1); ++j){
                if(entradas[j] >entradas[j + 1]){
                    aux = entradas[j];
                    entradas[j] = entradas[j + 1];
                    entradas[j + 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(entradas));
        for(int i = 0; i < entradas.length; i++) {
            for (int j = 0; j < (entradas.length - 1); ++j) {
                if (entradas[j] < entradas[j + 1]) {
                    aux = entradas[j];
                    entradas[j] = entradas[j + 1];
                    entradas[j + 1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(entradas));
    }
}
