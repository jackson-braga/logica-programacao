package atividades.lista1;

import java.util.Scanner;

/* 12. Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e escrever se
formam ou não um triângulo. OBS: para formar um triângulo, o valor de cada lado deve ser menor que
a soma dos outros 2 lados.
* */
public class Ex12FormaTriangulo {

    public static void main(String[] args) {

        double A, B, C;

        Scanner in = new Scanner(System.in);
        System.out.println(" Digite as três medidas para verificar se forma um triângulo: ");
        A = in.nextDouble();
        B = in.nextDouble();
        C = in.nextDouble();

        if(A < (B+C) && B < (A+C) && C < (A+B)) {
            System.out.printf("As medidas %.1f, %.1f e %.1f forma um triângulo.", A, B, C);
        }
        else {
            System.out.printf("As medidas %.1f, %.1f e %.1f não forma um triângulo.", A, B, C);
        }

    }
}
