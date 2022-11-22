package atividades.lista1;

import java.util.Scanner;

public class exercicio_2 {
    //Ler idade em anos, meses e dias.
    //Mostrar quantos dias ela viveu.

    public static void main(String[] args) {
        System.out.println("Vamos mostras quantos dias você viveu!");

        Scanner scanner = new Scanner(System.in);
        int anos;
        int meses;
        int dias;
        int calculo;

        System.out.println("Digite sua idade em anos, meses e dias: ");
        anos = scanner.nextInt();
        meses = scanner.nextInt();
        dias = scanner.nextInt();

        calculo = (anos*365) + (meses*30) + dias;

        System.out.println("A sua idade em dias é: " + calculo);
    }
}
