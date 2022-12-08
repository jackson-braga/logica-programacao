package atividades.lista3;

import java.util.Scanner;

public class Exercicio_07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Entrada de Dados
        System.out.println("Primeiro valor: ");
        double valor1 = scan.nextDouble();
        double valor2;

        //Processamento de Dados
        int count = 0;
        do {
            System.out.println("Segundo valor: ");
            valor2 = scan.nextDouble();
            if (valor2 != 0) {
                ++ count;
            }else {
                System.out.println("VALOR INVÁLIDO");
            }
        } while (count < 1);
        double resultado = valor1 / valor2;

        System.out.println(valor1 + " dividido por " + valor2 +" é: " + resultado);
    }
}
