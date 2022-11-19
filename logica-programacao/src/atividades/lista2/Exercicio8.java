package lista2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Exercicio8 {

    // Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
    // 1. Telefonou para a vítima?
    // 2. Esteve no local do crime?
    // 3. Mora perto da vítima?
    // 4. Devia para a vítima?
    // 5. Já trabalhou com a vítima?
    // O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
    // Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
    // entre 3 e 4 como “Cúmplice” e 5 como Assassino. Caso contrário, ele será classificado como Inocente.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] respostas = new String[5];
        int contadorSim = 0;

        System.out.println("Por favor, responda com Sim ou Não.");
        System.out.println("Telefonou para a vítima? ");
        respostas[0] = input.next();

        System.out.println("Esteve no local do crime? ");
        respostas[1] = input.next();

        System.out.println("Mora perto da vítima? ");
        respostas[2] = input.next();

        System.out.println("Devia para a vítima? ");
        respostas[3] = input.next();

        System.out.println("Já trabalhou com a vítima? ");
        respostas[4] = input.next();

        for (int i = 0; i < respostas.length; i++) {
            System.out.print(respostas[i]);
            if (i < (respostas.length - 1)) {
                System.out.print(", ");
            }
            if (respostas[i].equalsIgnoreCase("sim")) {
                contadorSim++;
            }
        }
        System.out.println();
        System.out.println(contadorSim);

        if (contadorSim == 2) {
            System.out.println("Suspeita");
        } else if (contadorSim == 3 || contadorSim == 4) {
            System.out.println("Cúmplice");
        } else if (contadorSim == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }
    }
}

