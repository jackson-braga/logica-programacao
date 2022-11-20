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

        Scanner scanner = new Scanner(System.in);

        System.out.println("Em que ano voc� nasceu?");
        anoNascimento = scanner.nextInt();
        System.out.println("Em que ano estamos?");
        anoAtual = scanner.nextInt();

        System.out.println("Em que m�s voc� nasceu?");
        mesNascimento = scanner.nextInt();
        System.out.println("Em que m�s estamos?");
        mesAtual = scanner.nextInt();

        System.out.println("Em que dia voc� nasceu?");
        diaNascimento = scanner.nextInt();
        System.out.println("Que dia � hoje?");
        diaAtual = scanner.nextInt();

        int qtdAnos;
        int qtdDiasAnos;
        int qtdMeses;
        int qtdDiasMeses;
        int qtdDias;
        int qtdDiasVividos;

        qtdAnos = anoAtual - anoNascimento;
        qtdDiasAnos = qtdAnos * 365;

        if (diaAtual > diaNascimento) {
            qtdDias = diaAtual - diaNascimento;
        } else {
            qtdDias = diaNascimento - diaAtual;
        }

        // Calculando quantidade de dias vididos
        if (mesAtual > mesNascimento) {
            qtdMeses = mesAtual - mesNascimento;
            qtdDiasMeses = qtdMeses * 30;
            qtdDiasVividos = qtdDiasAnos + qtdDiasMeses + qtdDias;

        } else if (mesAtual == mesNascimento && diaAtual > diaNascimento) {
            qtdDiasVividos = qtdDiasAnos + qtdDias;

        } else if (mesAtual == mesNascimento && diaAtual < diaNascimento) {
            qtdDiasVividos = qtdDiasAnos - qtdDias;

        } else {
            qtdMeses = mesNascimento - mesAtual;
            qtdDiasMeses = qtdMeses * 30;
            qtdDiasVividos = qtdDiasAnos - qtdDiasMeses - qtdDias;
        }

        System.out.println("Voc� viveu " + qtdDiasVividos + " dias!");

    }

}
