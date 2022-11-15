package atividades.lista3;

public class Exercicio1 {
    /**
     * 1. Faça um programa que verifique e mostre os números entre 1.000 e 2.000 (inclusive) que, quando divididos por 11 obtém-se
     * resto igual a 2.
     */
    public static void main(String[] args) {
        int[] numeros = new int[1000];
        int controle = 1000;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = controle++;
        }
        System.out.println("Números dividos por 11: ");
        for (int numero : numeros) {
            if (numero % 11 == 0) System.out.println(numero);
        }
    }
}
