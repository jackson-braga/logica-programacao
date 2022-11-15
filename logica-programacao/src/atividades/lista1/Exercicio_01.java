package atividades.lista1;

import java.util.Scanner;

public class Exercicio_01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Informe o valor da base do retângulo em metros: ");
        int base = scan.nextInt();
        System.out.println("Informe o valor da altura do retângulo em metros: ");
        int altura = scan.nextInt();

        //Processamento de Dados
        int area = base * altura;

        //Saída de Dados
        System.out.println("A área do retângulo é de " + area + "m².");
    }
}
