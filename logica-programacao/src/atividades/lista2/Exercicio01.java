package atividades.lista2;

import java.util.Calendar;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        int idade = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Idade:");
        idade = scan.nextInt();
        while (idade <= 0) {
            System.out.println("IDADE INVÁLIDO!");
            System.out.println("Digite sua idade:");
            idade = scan.nextInt();
        }
        if ((idade >= 18) && (idade <= 67)) {
            System.out.println("Pode doar sangue");
        } else {
            System.out.println("Não pode doar sangue");
        }
    }
}
