package atividades.lista3;

import java.util.Random;

public class Exercicio03 {
    public static void main(String[] args) {

        Random aleatorio = new Random();

        int idades[] = new int[10];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = aleatorio.nextInt(10, 80);

        }

        int contador = 0;
        for (int i = 0; i < idades.length; i++) {
            if (idades[i] >= 18) {
                contador++;
            }
        }
        System.out.println("A quantidadede pessoas com idade maior ou igual a 18 anos: " + contador);
    }
}




