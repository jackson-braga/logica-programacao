package atividades.lista1;

import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calendar cal = GregorianCalendar.getInstance();

        System.out.print("Entre com o ano de nascimento com 4 digitos: ");
        int anoNasc = sc.nextInt();
        System.out.print("Entre com o ano de admissão na empresa com 4 digitos: ");
        int anoAdmissao = sc.nextInt();

        int anoAtual = cal.get(Calendar.YEAR);
        int idade = anoAtual - anoNasc;
        int tempoTrabalho = anoAtual - anoAdmissao;

        if (idade >= 65) {
            System.out.println("A idade do funcionário é " + idade);
            System.out.println("O tempo de trabalho do funcionário é " + tempoTrabalho);
            System.out.println("Requerer aposentadoria.");
        } else if (tempoTrabalho >= 30) {
            System.out.println("A idade do funcionário é " + idade);
            System.out.println("O tempo de trabalho do funcionário é " + tempoTrabalho);
            System.out.println("Requerer aposentadoria.");
        } else if (idade >= 60 && tempoTrabalho >= 25) {
            System.out.println("A idade do funcionário é " + idade);
            System.out.println("O tempo de trabalho do funcionário é " + tempoTrabalho);
            System.out.println("Requerer aposentadoria.");
        } else {
            System.out.println("A idade do funcionário é " + idade);
            System.out.println("O tempo de trabalho do funcionário é " + tempoTrabalho);
            System.out.println("Não Requerer.");
        }


        sc.close();
    }
}
