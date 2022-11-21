package lista2;

//      8. Faça um programa que faça 5 perguntas para uma pessoa
//      sobre um crime. As perguntas são:
//          1. Telefonou para a vítima?
//          2. Esteve no local do crime?
//          3. Mora perto da vítima?
//          4. Devia para a vítima?
//          5. Já trabalhou com a vítima?
//      O programa deve no final emitir uma classificação sobre a
//      participação da pessoa no crime. Se a pessoa responder
//      positivamente a 2 questões ela deve ser classificada como
//      “Suspeita”, entre 3 e 4 como “Cúmplice” e 5 como “Assassino“.
//      Caso contrário, ele será classificado como “Inocente“

import java.util.Scanner;

public class Questao08 {

    public static void main(String[] args) {

        // Criar variaveis para armazendas as respotas do usuário
        Scanner scan = new Scanner(System.in);

        System.out.println("Responda com 0 para Não e 1 para Sim: ");
        System.out.println("1. Telefonou para a vítima?");
        int perg1 = scan.nextInt();
        System.out.println("Responda com 0 para Não e 1 para Sim: ");
        System.out.println("2. Esteve no local do crime?");
        int perg2 = scan.nextInt();
        System.out.println("Responda com 0 para Não e 1 para Sim: ");
        System.out.println("3. Mora perto da vítima?");
        int perg3 = scan.nextInt();
        System.out.println("Responda com 0 para Não e 1 para Sim: ");
        System.out.println("4. Devia para a vítima?");
        int perg4 = scan.nextInt();
        System.out.println("Responda com 0 para Não e 1 para Sim: ");
        System.out.println("5. Já trabalhou com a vítima?");
        int perg5 = scan.nextInt();

        // Somar respostas e calcular e exibir respostas

        int soma = perg1 + perg2 + perg3 + perg4 + perg5;

        if (soma == 5) {
            System.out.println("Assassino.");
        } else if (soma >= 3 && soma <= 4) {
            System.out.println("Cúmplice.");
        } else if (soma >= 2 && soma <= 3) {
            System.out.println("Suspeito.");
        } else {
            System.out.println("Inocente.");
        }
    }
}
