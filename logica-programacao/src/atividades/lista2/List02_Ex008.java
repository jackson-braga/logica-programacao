package atividades.lista2;

import java.util.Locale;
import java.util.Scanner;

public class List02_Ex008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("1. Telefonou para uma vítima? ");
            String pergunta1 = scan.nextLine();
            System.out.println("2. Esteve no local do crime? ");
            String pergunta2 = scan.nextLine();
            System.out.println("3. Mora perto da vítima? ");
            String pergunta3 = scan.nextLine();
            System.out.println("4. Devia para a vítima? ");
            String pergunta4 = scan.nextLine();
            System.out.println("5. Já trabalhou com a vítima? ");
            String pergunta5 = scan.nextLine();
            pergunta1 = pergunta1.toLowerCase();
            pergunta2 = pergunta2.toLowerCase();
            pergunta3 = pergunta3.toLowerCase();
            pergunta4 = pergunta4.toLowerCase();
            pergunta5 = pergunta5.toLowerCase();
            int contador = 0;

            if (pergunta1.equals("sim")) {
                contador += 1;
            }
            if (pergunta2.equals("sim")) {
                contador += 1;
            }
            if (pergunta3.equals("sim")) {
                contador += 1;
            }
            if (pergunta4.equals("sim")) {
                contador += 1;
            }
            if (pergunta5.equals("sim")) {
                contador += 1;
            }
            if (contador == 2) {
                System.out.println("Suspeito");
            } else if (contador >= 3 && contador <= 4) {
                System.out.println("Cúmplice");
            } else if (contador == 5) {
                System.out.println("Assassino");
            }
        }
    }