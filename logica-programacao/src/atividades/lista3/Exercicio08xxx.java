package atividades.lista3;

import java.util.Scanner;

public class Exercicio08xxx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char resp;
        do {
            System.out.println("Entre com duas notas: ");
            int nota1 = sc.nextInt();
            int nota2 = sc.nextInt();

            int media = (nota1 + nota2) / 2;
            System.out.println("Media do aluno foi: " + media);

            System.out.println("Deseja fazer um novo calculo? S ou N");
            resp = sc.nextLine().charAt(0);

        } while (resp == 'S');

        sc.close();
    }
}
