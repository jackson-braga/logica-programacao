package lista1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio9 {
    // Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela
    // poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).

    public static void main(String[] args) {

        Calendar cal = GregorianCalendar.getInstance();
        System.out.println("Ano atual: " + (cal.get(Calendar.YEAR)));

        Scanner input = new Scanner(System.in);
        System.out.println("Insira o ano que você nasceu: ");
        int anoNascimento = input.nextInt();

        int idade = cal.get(Calendar.YEAR) - anoNascimento;

        if (idade >= 16) {
            System.out.println("Você pode votar esse ano.");
        } else {
            System.out.println("Você não poderá votar esse ano.");
        }
    }
}
