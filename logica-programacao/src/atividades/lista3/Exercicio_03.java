package atividades.lista3;

import java.util.Arrays;
import java.util.Random;

public class Exercicio_03 {

    public static void main(String[] args) {

        //Entrada de Dados
        Random idades = new Random();
        int[] listaIdades = new int[10];
        int maiorDeIdade = 0;

        // Processamento de Dados
        for (int i = 0; i < listaIdades.length; i++) {
            listaIdades[i] = idades.nextInt(10, 30);
        }
        for (int listaIdade : listaIdades) {
            if (listaIdade >= 18) {
                maiorDeIdade++;
            }
        }

        //Saída de Dados
        System.out.println("Idades geradas: " + Arrays.toString( listaIdades ) );
        System.out.println("Maiores de Idade: " + maiorDeIdade);
    }

}
