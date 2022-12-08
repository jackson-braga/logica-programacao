package atividades.lista2;

import java.util.Scanner;

public class Exercicio_03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que informa o tipo de triângulo.");
        System.out.println("Informe o valor do primeiro lado:");
        int lado1 = scan.nextInt();
        System.out.println("Informe o valor do segundo lado: ");
        int lado2 = scan.nextInt();
        System.out.println("Informe o valor do terceiro lado: ");
        int lado3 = scan.nextInt();

        //Processamento de Dados
        String mensagem ="";
        if (lado1 == lado2 && lado1 == lado3) {
            mensagem = "Equilátero";
        } else if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
            mensagem = "Isóscele";
        } else {
            mensagem = "Escaleno";
        }

        // Saída de Dados
        System.out.println(mensagem);
    }
}
