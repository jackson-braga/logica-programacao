package atividades.lista1;

import java.util.Scanner;

public class exercicio_15 {
    //Considerando que o ano atual é 2022, já que não foi pedido.
    public static void main(String[] args) {
        int nascimento;
        int ingresso;
        int tTrabalho;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o ano de seu nascimento: ");
        nascimento = scanner.nextInt();
        System.out.println("Digite o ano de seu ingresso na empresa: ");
        ingresso = scanner.nextInt();

        int idade = 2022 - nascimento;
        tTrabalho = 2022 - ingresso;

        if (idade >= 65 || tTrabalho >= 30 || idade >= 60 && tTrabalho >= 25) {
        System.out.println("Requerer Aposentadoria");

        }else {
            System.out.println("Não requerer aposentadoria!");
        }
    }
}
