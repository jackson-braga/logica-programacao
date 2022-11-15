package atividades.lista1;

import java.util.Scanner;

public class Exercicio_12 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa qe informa se é possível formar um triângulo com a medida detrês lados.");
        System.out.println("Informe a medida A:");
        int A = scan.nextInt();
        System.out.println("Informe a medida B:");
        int B = scan.nextInt();
        System.out.println("Informe a medida C:");
        int C = scan.nextInt();

        //Processamento de Dados
        String mensagem;
        if (A + B > C && A + C > B && B + C > A) {
            mensagem = "Forma um triângulo.";
        } else {
            mensagem = "Não forma um triângulo";
        }

        //Saída de Dados
        System.out.println(mensagem);
    }
}
