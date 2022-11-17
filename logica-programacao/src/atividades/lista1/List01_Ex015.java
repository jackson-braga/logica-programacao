package atividades.lista1;

import java.util.Calendar;
import java.util.Scanner;

public class List01_Ex015 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Nome do funcionário: ");
            String nomeFuncionario = scan.nextLine();
            System.out.println("Qual o ano de nascimento: ");
            int anoNascimento = scan.nextInt();
            System.out.println("Qual o ano de contratação do funcionário: ");
            int anosContratacao = scan.nextInt();

            Calendar agora = Calendar.getInstance();
            int anoAtual = agora.get(Calendar.YEAR);
            int idadeFuncionario = anoAtual - anoNascimento;
            int tempoDeCasa = anoAtual - anosContratacao;

            if (idadeFuncionario >= 65) {
                System.out.println("Requerer aposentadoria");
            } else if (tempoDeCasa >= 30) {
                System.out.println("Requerer aposentadoria");
            } else if (idadeFuncionario >= 60 && tempoDeCasa >= 25) {
                System.out.println("Requerer aposentadoria");
            } else {
                System.out.println("Não requerer aposentadoria");
            }
            System.out.println("Idade do funcionário: " + idadeFuncionario + " anos");
            System.out.println("Tempo de trabalho: " + tempoDeCasa + " anos");
        }
}
