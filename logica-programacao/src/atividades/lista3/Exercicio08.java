package atividades.lista3;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp;
        do {

            System.out.println("Entre com duas notas: ");
            int nota1 = sc.nextInt();
            int nota2 = sc.nextInt();

            if (nota1 <= 10 && nota2 <= 10) {
                int media = (nota1 + nota2) / 2;
                System.out.println("Media do aluno foi: " + media);
            } else {
                System.out.println("Entre com valores de 0 a 10");
            }

            System.out.println("Deseja fazer um novo calculo? 1 - Sim ou 2 - Não");
            resp = sc.nextInt();



        } while (resp == 1);

        sc.close();
    }
}
