package atividades.lista1;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {

        int anoNascimento;
        int anoIngressoEmpresa;
        int idade;
        int anosDeTrabalho;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Em que ano você nasceu?");
        anoNascimento = scanner.nextInt();

        System.out.println("Em que ano entrou na empresa?");
        anoIngressoEmpresa = scanner.nextInt();

        idade = 2022 - anoNascimento;
        anosDeTrabalho = 2022 - anoIngressoEmpresa;

        System.out.println("------------------------------------------------");

        if (idade >= 65) {
            System.out.println("Idade: " + idade + ";");
            System.out.println("Tempo de trabalho: " + anosDeTrabalho + ".");
            System.out.println("Requerer Aposentadoria!");
            System.out.println("------------------------------------------------");

        } else if (anosDeTrabalho >= 30) {
            System.out.println("Idade: " + idade + ";");
            System.out.println("Tempo de trabalho: " + anosDeTrabalho + ".");
            System.out.println("Requerer Aposentadoria!");
            System.out.println("------------------------------------------------");

        } else if (idade >= 60 && anosDeTrabalho >= 25 ) {
            System.out.println("Idade: " + idade + ";");
            System.out.println("Tempo de trabalho: " + anosDeTrabalho + ".");
            System.out.println("Requerer Aposentadoria!");
            System.out.println("------------------------------------------------");

        } else {
            System.out.println("Idade: " + idade + ";");
            System.out.println("Tempo de trabalho: " + anosDeTrabalho + ".");
            System.out.println("Não Requerer Aposentadoria!");
            System.out.println("------------------------------------------------");
        }

    }

}
