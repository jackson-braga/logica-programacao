package lista2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio1 {
    // Para doar sangue é necessário ter entre 18 e 67 anos. Faça um aplicativo que pergunte
    // a idade de uma pessoa e diga se ela pode doar sangue ou não.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Idade: ");
        int idade = input.nextInt();

        if (idade >= 18 && idade <=67) {
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Pode doar sangue.");
        } else {
            System.out.println("Não pode doar sangue.");
        }


    }
}
