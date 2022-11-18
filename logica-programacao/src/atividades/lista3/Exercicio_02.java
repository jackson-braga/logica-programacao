package atividades.lista3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



public class Exercicio_02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Entrada de Dados
        int[] numeros = new int[3];
        System.out.println("Informe o primeiro numero: ");
        numeros[0] = scan.nextInt();
        System.out.println("Informe o segundo numero: ");
        numeros[1] = scan.nextInt();
        System.out.println("Informe o terceiro numero: ");
        numeros[2] = scan.nextInt();


        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
    }


}
