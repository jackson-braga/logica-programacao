package atividades.lista2;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com as notas do aluno: ");
        double nota1 = sc.nextDouble();
        double nota2 = sc.nextDouble();
        double mediaNota = (nota1 + nota2) / 2;

        char conceito = 0;
        if (mediaNota > 9.0 && mediaNota >= 10.0) {
            conceito = 'A';
        } else if (mediaNota > 7.5 && mediaNota >= 9.0) {
            conceito = 'B';
        } else if (mediaNota > 6.0 && mediaNota >= 7.5) {
            conceito = 'C';
        } else if (mediaNota > 4.0 && mediaNota >= 6.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }
        sc.close();

        System.out.println("As notas foram: " + nota1 + " e " + nota2);
        System.out.printf("Sua média foi: %.1f" , mediaNota);
        System.out.println();

        if (conceito == 'A' ||  conceito == 'B' || conceito == 'C') {
            System.out.println("Sua note conceito foi " + conceito + " você foi APROVADO");
        } else {
            System.out.println("Sua note conceito foi " + conceito + " você foi REPROVADO");
        }

    }
}
