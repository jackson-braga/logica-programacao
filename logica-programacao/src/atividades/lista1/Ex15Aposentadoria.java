package atividades.lista1;

/*  15. Uma empresa quer verificar se um empregado está qualificado para a aposentadoria ou não.
Para estar em condições, um dos seguintes requisitos deve ser satisfeito:
        ● Ter no mínimo 65 anos de idade.
        ● Ter trabalhado no mínimo 30 anos.
        ● Ter no mínimo 60 anos e ter trabalhado no mínimo 25 anos.
Com base nas informações acima, faça um programa que leia: o ano de seu nascimento e o ano de
seu ingresso na empresa. O programa deverá escrever a idade e o tempo de trabalho do empregado
e a mensagem 'Requerer aposentadoria' ou 'Não requerer'
* */

import java.time.LocalDate;
import java.util.Scanner;

public class Ex15Aposentadoria {

    public static void main(String[] args) {

        int anoNasc, anoEmpresa, idade, tempoTrabalho;
        String msg;

        LocalDate data = LocalDate.now();
        int anoAtual = data.getYear();


        Scanner in = new Scanner(System.in);
        System.out.println("Digite o ano do seu Nascimento: ");
        anoNasc = in.nextInt();
        System.out.println("Digite o ano do seu ingresso na Empresa: ");
        anoEmpresa = in.nextInt();

        idade = anoAtual - anoNasc;
        tempoTrabalho = anoAtual - anoEmpresa;

        if (idade > 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25))
        {
            msg = "Requerer Aposentadoria";
        }
        else {
            msg = "Não Requerer Aposentadoria";
        }

        System.out.printf("A sua idade é %d anos e seu tempo de empresa %d anos, portanto deve " +
                "%s.\n", idade, tempoTrabalho, msg);


    }
}
