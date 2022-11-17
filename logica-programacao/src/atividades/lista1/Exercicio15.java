package lista1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Exercicio15 {

    // Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não.
    // Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
    // ● Ter no mínimo 65 anos de idade.
    // ● Ter trabalhado no mínimo 30 anos.
    // ● Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
    // Com base nas informações acima, faça um programa que leia: o ano de seu nascimento e o ano de
    // seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado
    // e a mensagem 'Requerer aposentadoria' ou 'Não requerer'.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Calendar cal = GregorianCalendar.getInstance();
        System.out.println("Ano atual: " + (cal.get(Calendar.YEAR)));

        System.out.println("Ano Nascimento: ");
        int anoNascimento = input.nextInt();

        System.out.println("Ano entrada na empresa: ");
        int anoEntrada = input.nextInt();

        int idade = (cal.get(Calendar.YEAR) - anoNascimento);
        System.out.println("Idade: " + idade + " anos");
        int tempoServico = (cal.get(Calendar.YEAR) - anoEntrada);
        System.out.println("Tempo de serviço: " + tempoServico + " anos");

        if (idade >= 65 || tempoServico >= 30 || (idade >= 60 && tempoServico >= 25)) {
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Não requerer aposentadoria");
        }
    }
}
