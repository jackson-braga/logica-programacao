package atividades.lista1;

import java.util.Calendar;
import java.util.Scanner;

public class List01_Ex002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual é o seu dia de nascimento: ");
        int diaNascimento = scan.nextInt();
        System.out.println("Qual é o seu mês de nascimento: ");
        int mesNascimento = scan.nextInt();
        System.out.println("Qual é o seu ano de nascimento: ");
        int anoNascimento = scan.nextInt();
        Calendar agora = Calendar.getInstance();
        int anoAtual = agora.get(Calendar.YEAR);

        int calculoAnos = anoAtual - anoNascimento;
        int calculoMeses = (30 * 12) + calculoAnos;
        int calculoDias = calculoAnos * 365;

        System.out.println("Você já viveu: " + calculoAnos + " anos");
        System.out.println("Você já viveu: " + calculoMeses + " meses");
        System.out.println("Você já viveu: " + calculoDias + " dias");

    }
}
// método 2

//import java.util.Scanner;
//
//public class List01_Ex002 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Qual é a sua idade em anos : ");
//        int ano = scan.nextInt();
//        System.out.println("Qual é a sua idade em meses: ");
//        int meses = scan.nextInt();
//        System.out.println("Qual é a sua idade em dias: ");
//        int dias = scan.nextInt();
//
//        int calculoDias = ano * 365 + meses * 30 + dias;
//
//        System.out.println("Você já viveu: " + calculoDias + " dias");
//
//    }
//}