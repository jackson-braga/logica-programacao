package atividades.lista1;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double temperatura = 0, c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Temperatura em Fahrennheit:");
        temperatura = scan.nextDouble();
        c = (((temperatura - 32)/9)*5);
        System.out.println(temperatura +"F=" +c +"°C");
    }
}
