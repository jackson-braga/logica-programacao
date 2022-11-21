package atividades.lista3;

import java.util.Scanner;

public class List03_Ex009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero;

        do {
            System.out.println("Digite um número maior que 1");
            numero = scan.nextInt();
            if (numero < 1) {
                System.out.println("Valor inválido");
                continue;
            }
        } while (numero < 1);
        for(int cont = 1; cont <= numero; cont++){
            System.out.println(cont);
        }
    }
}
