package atividades.lista1;

import java.util.Scanner;

public class exercicio_6 {
    //Calcular média ponderada de 3 notas de um aluno

    public static void main(String[] args) {
        double n1;
        double n2;
        double n3;
        double media;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        n2 = scanner.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        n3 = scanner.nextDouble();

        media = ((n1*2)+(n2*3)+(n3*5))/(2+3+5);

        System.out.println("A média final do aluno é: " + media);

    }
}
