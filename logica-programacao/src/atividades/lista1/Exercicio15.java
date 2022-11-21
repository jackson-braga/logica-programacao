package atividades.lista1;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        int ano_nascimento = 0, ano_ingresso = 0, idade = 0, tempo_trabalho = 0;
        Calendar dataAtual = Calendar.getInstance();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ano de Nascimento:");
        ano_nascimento = scan.nextInt();
        while (ano_nascimento <= 0) {
            System.out.println("ANO INVÁLIDO!");
            System.out.println("Digite ano de nascimento:");
            ano_nascimento = scan.nextInt();
        }

        System.out.println("Ano de Ingresso na Empresa:");
        ano_ingresso = scan.nextInt();
        while (ano_ingresso <= ano_nascimento){
            System.out.println("ANO INVÁLIDO!");
            System.out.println("Digite ano de ingresso na Empresa:");
            ano_ingresso = scan.nextInt();
        }
        int anoAtual = dataAtual.get(Calendar.YEAR);
        idade = anoAtual - ano_nascimento;
        tempo_trabalho = anoAtual - ano_ingresso;

        if ((idade >= 65) || (tempo_trabalho >= 30) || ((idade >= 60) && (tempo_trabalho >= 25))) {
            System.out.println("Requerer Aposentadoria!");
        } else {
            System.out.println("Não requerer!");
        }
    }

}
