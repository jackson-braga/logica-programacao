package atividades.lista1;

import java.util.Scanner;

public class exercicio_8 {
    //Calcular média das notas e mostrar se o aluno foi aprovado ou não
    public static void main(String[] args) {
        double n1;
        double n2;
        double media;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a primeira nota do aluno: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        n2 = scanner.nextDouble();

        media = (n1+n2)/2;
        if (media>=6){
            System.out.println("Parabéns! Você foi aprovado com média: " + media);
        }else {
            System.out.println("Infelizmente você foi reprovado com média: " + media);
        }
    }
}
