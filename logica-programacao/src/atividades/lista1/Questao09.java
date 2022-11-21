package lista1;

//      9. Ler o ano atual e o ano de nascimento de uma pessoa.
//      Escrever uma mensagem que diga se ela poderá ou não votar este ano
//      (não é necessário considerar o mês em que a pessoa nasceu).

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Questao09 {

    public static void main(String[] args) {

        //      Criar variável com o ano de nascimento informado pelo usuario

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu ano de nascimento: ");
        int anoNascimento = scan.nextInt();
        GregorianCalendar gc = new GregorianCalendar();
        int anoAtual = gc.get(Calendar.YEAR);

        int idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Você poderá votar nas eleições deste ano!");
        } else {
            System.out.println("Você não poderá votar nas eleições deste ano!");

        }
    }
}
