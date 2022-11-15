package atividades.lista1;

import java.time.Year;
import java.util.Scanner;

public class Exercicio_15 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Entrada de Dados
        System.out.println("Programa que informa se um empregado pode se aposentar.");
        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = scan.nextInt();
        System.out.println("Digite seu ano de ingresso na empresa: ");
        int anoDeIngresso = scan.nextInt();

        //Processamento de Dados
        int anoAtual = Year.now().getValue();
        int anosDeVida = anoAtual - anoNascimento;
        int anosDeEmpresa = anoAtual - anoDeIngresso;
        String mensagem;
        if (anosDeVida >= 65 || anosDeEmpresa >= 30 || (anosDeVida >= 60 && anosDeEmpresa >= 25)) {
            mensagem = "Requerer aposentadoria";
        }
        else {
            mensagem = "Não requerer aposentadoria";
        }

        //Saída de Dados
        System.out.println(mensagem);
    }
}
