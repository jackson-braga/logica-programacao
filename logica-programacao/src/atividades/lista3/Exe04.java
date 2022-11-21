package atividades.lista3;

import java.util.Random;

public class Exe04 {
    public static void main(String[] args) {

        int[] idades = new int[10];
        Random random = new Random();

        System.out.println("-------------------Idade das pessoas--------------------");

        for (int index=0; index < idades.length; index++) {
            idades[index] = random.nextInt(100);
            System.out.print(idades[index] + "    ");

        }

        int faixaUm = 0;
        int faixaDois = 0;
        int faixaTres = 0;
        int faixaQuatro = 0;
        int faixaCinco = 0;

        System.out.println();
        System.out.println();
        System.out.println("--------Quantidade de pessoas por faixa etária----------");

        for (int index=0; index < idades.length; index++) {

            if (idades[index] <= 15) {
                faixaUm++;

            }

            if (idades[index] >= 16 && idades[index] <= 30) {
                faixaDois++;

            }

            if (idades[index] >= 31 && idades[index] <= 45) {
                faixaTres++;

            }

            if (idades[index] >= 46 && idades[index] <= 60) {
                faixaQuatro++;

            }

            if (idades[index] >= 61) {
                faixaCinco++;

            }

        }

        System.out.println("Até 15 anos: " + faixaUm);
        System.out.println("De 16 a 30 anos: " + faixaDois);
        System.out.println("De 31 a 45 anos: " + faixaTres);
        System.out.println("De 46 a 60 anos: " + faixaQuatro);
        System.out.println("Acima de 61 anos: " + faixaCinco);

        int pctgFaixaUm = (faixaUm * 100) / 10;
        int pctgFaixaDois = (faixaDois * 100) / 10;
        int pctgFaixaTres = (faixaTres * 100) / 10;
        int pctgFaixaQuatro = (faixaQuatro * 100) / 10;
        int pctgFaixaCinco = (faixaCinco * 100) / 10;

        System.out.println();
        System.out.println("----------------------Porcentagem-----------------------");
        System.out.println("Até 15 anos: " + pctgFaixaUm + "%");
        System.out.println("De 16 a 30 anos: " + pctgFaixaDois + "%");
        System.out.println("De 31 a 45 anos: " + pctgFaixaTres + "%");
        System.out.println("De 46 a 60 anos: " + pctgFaixaQuatro + "%");
        System.out.println("Acima de 61 anos: " + pctgFaixaCinco + "%");

    }

}
