package atividades.lista3;

import java.util.Random;

public class Exercicio04 {
    public static void main(String[] args) {
        Random aleatorio = new Random();

        int idades[] = new int[10];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = aleatorio.nextInt(10, 80); // serão geradas aleatoriamente as idades;
        }
        int cont15 = 0;
        int cont30 = 0;
        int cont45 = 0;
        int cont60 = 0;
        int cont61 = 0;

        for (int i = 0; i < idades.length; i++) {
            if (idades[i] <= 15) {
                cont15++;
            } else if (idades[i] > 15 && idades[i] <= 30) {
                cont30++;
            } else if (idades[i] > 30 && idades[i] <= 45) {
                cont45++;
            } else if (idades[i] > 45 && idades[i] <= 60) {
                cont60++;
            } else {
                cont61++;
            }
        }

        System.out.println("Quantida de pessoas na faixa etária de 15 anos é: " + cont15);
        System.out.println("A percentagem de pessoas na faixa etária de 15 anos é: " + ((cont15  * 100) / idades.length) + "%");
        System.out.println();
        System.out.println("Quantida de pessoas na faixa etária de 16 a 30 anos é: " + cont30);
        System.out.println("A percentagem de pessoas na faixa etária de 16 a 30 anos é: " + ((cont30  * 100) / idades.length) + "%");
        System.out.println();
        System.out.println("Quantida de pessoas na faixa etária de 31 a 45 anos é: " + cont45);
        System.out.println("A percentagem de pessoas na faixa etária de 31 a 45 anos é: " + ((cont45  * 100) / idades.length) + "%");
        System.out.println();
        System.out.println("Quantida de pessoas na faixa etária de 46 a 60 anos é: " + cont60);
        System.out.println("A percentagem de pessoas na faixa etária de 46 a 60 anos é: " + ((cont60  * 100) / idades.length) + "%");
        System.out.println();
        System.out.println("Quantida de pessoas na faixa etária acima de 61 anos é: " + cont61);
        System.out.println("A percentagem de pessoas na faixa etária acima de 61 anos é: " + ((cont61  * 100) / idades.length) + "%");

    }

}
