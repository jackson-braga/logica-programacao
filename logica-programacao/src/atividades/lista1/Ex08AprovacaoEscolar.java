package atividades.lista1;

import java.util.Scanner;

/* Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever
uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno
é aprovado). Escrever também a média calculada.
* */
public class Ex08AprovacaoEscolar {

    public static void main(String[] args) {

        double n1, n2, media;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite as duas notas do aluno: ");
        n1 = in.nextDouble();
        n2 = in.nextDouble();

        media = (n1+n2)/2;

        if(media >= 6)
        {
            System.out.printf(" O aluno com a média %.1f foi Aprovado.\n", media);
        }
        else {
            System.out.printf(" O aluno com a média %.1f foi Reprovado.\n", media);
        }


    }
}
