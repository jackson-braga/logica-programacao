package atividades.lista2;

/**
 * @author CrisMoura on 20/11/2022
 */
import java.util.Scanner;

public class Exer8 {
    public static void main(String[] args) {
//8. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
//1.Telefonou para a vítima?
//2.Esteve no local do crime?
//3.Mora perto da vítima?
//4.Devia para a vítima?
//5.Já trabalhou com a vítima?
//O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
// Se a pessoa responder positivamente a 2 questões ela deve ser classificada como “Suspeita”,
// entre 3 e 4 como “Cúmplice” e 5 como “Assassino“. Caso contrário, ele será classificado como “Inocente“.

        char[] respostas = new char[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Telefonou para a vítima?");
        respostas[0] = input.next().toLowerCase().charAt(0);
        System.out.println("Esteve no local do crime?");
        respostas[1] = input.next().toLowerCase().charAt(0);
        System.out.println("Mora perto da vítima?");
        respostas[2] = input.next().toLowerCase().charAt(0);
        System.out.println("Devia para a vítima?");
        respostas[3] = input.next().toLowerCase().charAt(0);
        System.out.println("Já trabalhou com a vítima?");
        respostas[4] = input.next().toLowerCase().charAt(0);
        int qtdSim = 0;

        for(int i = 0; i < respostas.length; ++i) {
            if (respostas[i] == 's') {
                ++qtdSim;
            }
        }

        if (qtdSim == 2) {
            System.out.println("Suspeito");
        } else if (qtdSim >= 3 && qtdSim <= 4) {
            System.out.println("Cumplice");
        } else if (qtdSim == 5) {
            System.out.println("Assassino");
        } else {
            System.out.println("Inocente");
        }

    }
}
