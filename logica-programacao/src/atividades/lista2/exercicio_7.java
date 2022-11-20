package atividades.lista2;

import java.util.Scanner;

public class exercicio_7 {
    public static void main(String[] args) {
        int ano;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ano que você quer verificar: ");
        ano = scanner.nextInt();

        double div4 = ano % 4;
        double div100 = ano % 100;
        double div400 = ano % 400;

        if(div4 == 0 && div100 != 0) {
            System.out.println("Esse é um ano Bissexto");
        } else if (ano > 400 && div400 == 0 ) {
            System.out.println("Esse é um ano Bissexto");
        }else {
            System.out.println("Esse não é um ano Bissexto");
        }
    }
}
