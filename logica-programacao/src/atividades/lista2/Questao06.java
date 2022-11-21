package lista2;

import java.util.Scanner;

//      6. Faça um programa que leia as duas notas parciais obtidas
//      por um aluno numa disciplina ao longo de um semestre, e calcule
//      a sua média. A atribuição de conceitos obedece à tabela abaixo:
//          Média de aproveitamento Conceito
//          Entre 9.0 e 10.0 A
//          Entre 7.5 e 9.0 B
//          Entre 6.0 e 7.5 C
//          Entre 4.0 e 6.0 D
//          Entre 4.0 e 0 E
public class Questao06 {

    public static void main(String[] args) {
        // Criar variáveis das notas a serem digitadas pelo usuário

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = scan.nextDouble();
        System.out.println("Informe a segunda nota: ");
        double nota2 = scan.nextDouble();

        // Calcular media
        double media = (nota1 + nota2) / 2;
        System.out.printf("A média é: %.2f", media);

        if (media >= 9 && media <= 10) {
            System.out.println("\nConceito A.");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("\nConceito B.");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("\nConceito C.");
        } else if (media >= 4 && media < 6) {
            System.out.println("\nConceito D.");
        } else if (media >= 0 && media < 4) {
            System.out.println("\nConceito E.");
        }
    }
}
