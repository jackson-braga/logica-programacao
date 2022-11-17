package atividades.lista2;

import java.util.Scanner;

public class Exercicio_04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que informa o tipo de triângulo com base em seus ângulos.");
        System.out.println("Informe o valor do primeiro ângulo: ");
        int angulo1 = scan.nextInt();
        System.out.println("Informe o valor do segundo ângulo: ");
        int angulo2 = scan.nextInt();
        System.out.println("Informe o valor do terceiro ângulo: ");
        int angulo3 = scan.nextInt();

        // Processamento de Dados
        String mensagem="";
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            mensagem = "Retângulo";
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            mensagem = "Obtusângulo";
        } else {
            mensagem = "Acutângulo";
        }

        //Saída de Dados
        System.out.println(mensagem);
    }
}
