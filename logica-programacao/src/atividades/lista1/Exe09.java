package atividades.lista1;

import java.util.Scanner;

public class Exe09 {
    public static void main(String[] args) {

        int anoNascimento;
        int anoAtual;
        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Em que ano voc� nasceu?");
        anoNascimento = scanner.nextInt();

        System.out.println("Em que ano estamos?");
        anoAtual = scanner.nextInt();

        idade = anoAtual - anoNascimento;

        if (idade >= 16) {
            System.out.println("Voc� poder� votar este ano!");

        } else {
            System.out.println("Voc� ainda n�o pode votar!");

        }

    }

}
