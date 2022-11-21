package atividades.lista3;

import java.util.Random;

public class Exe03 {
    public static void main(String[] args) {

        int[] idades = new int[10];
        Random random = new Random();

        System.out.println("Idades das pessoas:");

        for (int index=0; index < idades.length; index++) {
            idades[index] = random.nextInt(70);
            System.out.print(idades[index] + "    ");

        }

        int qtdIMaioresDeIdade = 0;
        for (int index=0; index < idades.length; index++) {

            if (idades[index] >= 18) {
                qtdIMaioresDeIdade++;

            }

        }
        System.out.println();
        System.out.println("Quantidade de pessoas com idade maior ou igual a 18 anos: " + qtdIMaioresDeIdade + ".");

    }

}
