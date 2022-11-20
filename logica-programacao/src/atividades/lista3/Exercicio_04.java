package atividades.lista3;

import java.util.Random;

public class Exercicio_04 {

    public static void main(String[] args) {

        // Entrada de Dados
        Random idades = new Random();
        int[] listaIdades = new int[10];
        int faixa1 = 0;
        int faixa2 = 0;
        int faixa3 = 0;
        int faixa4 = 0;
        int faixa5 = 0;

        //Processamento de Dados
        for (int i = 0; i < listaIdades.length; i++) {
            listaIdades[i] = idades.nextInt(0, 100);
        }
        for (int listaIdade : listaIdades) {
            if (listaIdade <= 15) {
                faixa1++;
            } else if (listaIdade <= 30) {
                faixa2++;
            } else if (listaIdade <= 45) {
                faixa3++;
            } else if (listaIdade <= 60) {
                faixa4++;
            } else {
                faixa5++;
            }
        }

        //Saida de Dados
        System.out.println("Até 15 anos: " + (faixa1 * 10) + "%.");
        System.out.println("De 16 a 30 anos: " + (faixa2 * 10) + "%.");
        System.out.println("De 31 a 45 anos: " + (faixa3 * 10) + "%.");
        System.out.println("De 46 a 60 anos: " + (faixa4 * 10) + "%.");
        System.out.println("Acima de 61 anos: " + (faixa5 * 10) + "%.");
    }
}
