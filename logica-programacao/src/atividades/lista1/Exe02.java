package atividades.lista1;

import java.util.Scanner;

public class Exe02 {
    public static void main(String[] args) {

        int diaNascimento;
        int diaAtual;
        int mesNascimento;
        int mesAtual;
        int anoNascimento;
        int anoAtual;

        int qtdDias;
        int qtdMes;
        int qtdAno;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Em que ano você nasceu? ");
        anoNascimento = scanner.nextInt();
        System.out.println("Em que ano estamos? ");
        anoAtual = scanner.nextInt();

        System.out.println("Em que mês você nasceu? ");
        mesNascimento = scanner.nextInt();
        System.out.println("Em que mês estamos? ");
        mesAtual = scanner.nextInt();

        System.out.println("Em que dia você nasceu? ");
        diaNascimento = scanner.nextInt();
        System.out.println("Que dia é hoje? ");
        diaAtual = scanner.nextInt();


    }

}
