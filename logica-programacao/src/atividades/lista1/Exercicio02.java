package atividades.lista1;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a data atual:");
        System.out.print("Dia: ");
        int diaAtual = sc.nextInt();
        System.out.print("Mês: ");
        int mesAtual = sc.nextInt();
        System.out.print("Ano: ");
        int anoAtual = sc.nextInt();

        System.out.println("Informe a data de nascimento:");
        System.out.print("Dia: ");
        int diaNasc = sc.nextInt();
        System.out.print("Mês: ");
        int mesNasc = sc.nextInt();
        System.out.print("Ano: ");
        int anoNasc = sc.nextInt();

        int quantDia;
        int quantMes;
        int quantAno;

        if (diaNasc < diaAtual) {
            quantDia = diaAtual - diaNasc;
        } else {
            quantDia = diaNasc - diaAtual;
        }

        if (mesNasc < mesAtual) {
            quantMes = mesAtual - mesNasc;
        } else {
            quantMes = mesNasc - mesAtual;
        }
        quantAno = anoAtual - anoNasc;

        int totalDia = quantDia;
        int totalMes = quantMes * 30;
        int totalAno = quantAno * 365;
        int totalDiasVividos = totalDia + totalMes + totalAno;

        System.out.printf("Voce já viveu " + totalDiasVividos + " dias.");

        sc.close();

    }

}


