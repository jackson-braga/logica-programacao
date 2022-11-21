package lista1;

//      15. Uma empresa quer verificar se um empregado está qualificado para a
//      aposentadoria ou não. Para estar em condições, um dos seguintes
//      requisitos deve ser satisfeito:
//          ● Ter no mínimo 65 anos de idade.
//          ● Ter trabalhado no mínimo 30 anos.
//          ● Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
//      Com base nas informações acima, faça um programa que leia: o ano de seu
//      nascimento e o ano de seu ingresso na empresa. O programa deverá escrever
//      a idade e o tempo de trabalho do empregado e a mensagem 'Requerer
//      aposentadoria' ou 'Não requerer'.

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Questao15 {

    public static void main(String[] args) {
        // Criar variáveis para o ano de nascimento e de ingresso na empresa

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o ano de seu nascimento: ");
        int anoNascimento = scan.nextInt();
        System.out.println("Informe o ano de seu ingresso na empresa: ");
        int anoIngresso = scan.nextInt();

        // Calcular e exibir idade e tempo de contribuição com base nos dados
        // e no ano atual

        GregorianCalendar gc = new GregorianCalendar();
        int anoAtual = gc.get(Calendar.YEAR);

        int idade = anoAtual - anoNascimento;
        int tempoContribuicao = anoAtual - anoIngresso;
        System.out.println("Você tem " + idade + " anos de idade.");
        System.out.println("Você tem " + tempoContribuicao + " anos de tempo de contribuição.");

        // Calcular requisitos e imprimir mensagens acerca da possibilidade
        // de aposentadoria

        if (idade >= 65 || tempoContribuicao >= 30 || idade >= 60 && tempoContribuicao >= 25) {
            System.out.println("Requerer aposentadoria.");
        } else {
            System.out.println("Não requerer aposentadoria.");
        }



    }
}
